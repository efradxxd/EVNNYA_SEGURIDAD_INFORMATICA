package evnnya;



import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import PERSONA.persona2;
import evnnya.Herramientas.*;
import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField; 
import static com.sun.javafx.tk.Toolkit.getToolkit;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.StageStyle;
import javax.swing.JTextField;
import conecciones.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import procedimientos.Denunciantes;
import procedimientos.Custodia;
import procedimientos.Direcciones;
import procedimientos.Vulnerabilidad;
import procedimientos.Victima;
import procedimientos.Agresor;
import procedimientos.Denuncias;
import procedimientos.Recepcion;
import procedimientos.Reportes;
import procedimientos.Archivos;



/**
 *
 * @author efralerma
 */
public class FXMLMRController implements Initializable {
    
    Archivos archivos = new Archivos();
    Denunciantes denunciante = new Denunciantes();
    Denuncias denuncia = new Denuncias();
    Custodia custodia= new Custodia();
    Direcciones direccion = new Direcciones();
    Recepcion recepcion = new Recepcion();
    Reportes reportes = new Reportes();
    Vulnerabilidad vulnerabilidad = new Vulnerabilidad();
    Victima victima = new Victima();
    Agresor agresor= new Agresor();
    Conexion conexio = new Conexion();
    Herramientas herramientas   = new Herramientas ();


    //VARIABLES GLOBALES

    public String NUM_OFICIO;
    public String FECHA_SISTEMA, FECHA_OFICIO;
    public String HORA_SISTEMA;
    public int TIPO_DENUNCIANTE;
    public String NOMBRE_DENUNCIANTE,NOMBRE_CUSTODIA;
    public String A_PATERNO_DENUNCIANTE,A_PATERNO_CUSTODIA;
    public String A_MATERNO_DENUNCIANTE,A_MATERNO_CUSTODIA;
    public int EDAD_DENUNCIANTE,EDAD_CUSTODIA;
    public String SEXO_DENUNCIANTE,SEXO_CUSTODIA;
    public String ESCOLARIDAD_DENUNCIANTE,ESCOLARIDAD_CUSTODIA;
    public String RELACION_VICTIMA_DENUNCIANTE,RELACION_VICTIMA_CUSTODIA,RELACION_AGRESOR;
    public String D_NUM_DENUNCIANTE,D_NUM_VICTIMA,D_NUM_CUSTODIA,D_NUM_AGRESOR;
    public String D_CALLE_DENUNCIANTE,D_CALLE_VICTIMA,D_CALLE_AGRESOR,D_CALLE_CUSTODIA;
    public String D_COLONIA_DENUNCIANTE,D_COLONIA_VICTIMA,D_COLONIA_CUSTODIA,D_COLONIA_AGRESOR;
    public int D_CP_DENUNCIANTE,D_CP_VICTIMA,D_CP_CUSTODIA,D_CP_AGRESOR;
    public String D_ENTRE_CALLE_DENUNCIANTE,D_ENTRE_CALLE_VICTIMA,D_ENTRE_CALLE_CUSTODIA_D_ENTRE_CALLE_AGRESOR;
    public String D_MUNICIPIO_DENUNCIANTE,D_MUNICIPIO_VICTIMA,D_MUNICIPIO_CUSTODIA,D_MUNICIPIO_AGRESOR;
    public String D_REFERANCIA_CASA,D_REFERANCIA_CASA_VICTIMA;
    public String D_EMAIL_DENUNCIANTE,D_EMAIL_VICTIMA,D_EMAIL_CUSTODIA,D_EMAIL_AGRESOR;
    public String D_TELEFONO_FIJO_DENUNCIANTE,D_TELEFONO_FIJO_VICTIMA,D_TELEFONO_FIJO_AGRESOR,D_TELEFONO_FIJO_CUSTODIA;
    public String D_TELEFONO_MOVIL_DENUNCIANTE,D_TELEFONO_MOVIL_VICTIMA,D_TELEFONO_MOVIL_CUSTODIA,D_TELEFONO_MOVIL_AGRESOR; 
    public String TIPO_DE_PERSONA_DENUNCINTE;
    public int TIPO_DE_DENUNCIA;
    public String Medio_denuncia;
    public String OBSERVACIONES, RESENA_SITUACION;
    public String TIPO_VULNERABILIDAD;
    public String archivo;
    public int estado=0;


   
    
    
    
    
    //JFX BOTONES DE LA INTERFAZ
    @FXML JFXButton btn_recepcion;
    @FXML JFXButton btn_custodia;
    @FXML JFXButton btn_victima;
    @FXML JFXButton btn_agreso;
    @FXML JFXButton btn_vulnerabilidad;
    @FXML JFXButton btn_resenia;
    @FXML JFXButton btn_archivos;
    @FXML JFXButton BTN_FREPORTE, BTN_ARCHIVO,btn_eliminar_archivo;
    //PANELES 
    @FXML Pane pnl_recepcion;
    @FXML Pane pnl_custodia;
    @FXML Pane pnl_victima;
    @FXML Pane pnl_agresor;
    @FXML Pane pnl_vulnerabilidad;
    @FXML Pane pnl_archivos;
    @FXML Pane PNL_ROSA;
    @FXML Pane pnl_recepcio;
    //JFXCHECKBOX
    @FXML JFXCheckBox check_persona_moral;
    @FXML JFXCheckBox check_persona_fisica;
    @FXML JFXCheckBox check_1,check_2,check_3,check_4,check_5,check_6,check_7,check_8,check_9,check_10,check_11,
            check_12,check_13,check_14,check_15,check_16,check_17,check_18,check_19,check_20,check_21,check_otro;
    //JFXCOMBOBOX
    @FXML JFXComboBox combo_sexo_denunciante;
    @FXML JFXComboBox combo_sexo_victima;
    @FXML JFXComboBox combo_sexo_agresor;
    @FXML JFXComboBox combo_estado_civil_agresor;
    @FXML JFXComboBox combo_sexo_tutela;
    @FXML JFXComboBox combo_escolaridad_victima;
    @FXML JFXComboBox combo_escolaridad_denunciante;
    @FXML JFXComboBox combo_escolaridad_agresor;
    @FXML JFXComboBox combo_escolaridad_tutela;
    @FXML JFXComboBox COMBO_MUNICIPIO_AGRESOR2;
    @FXML JFXComboBox COMBO_MUNICIPIO_VICTIMA;
    @FXML JFXComboBox COMBO_MUNICIPIO_DENUNCIANTE;
    @FXML JFXComboBox COMBO_MUNICIPIO_CUSTODIA,combo_clacificacion,combo_estado;

    //BOTONES NORMALES DE INTERFAZ
    @FXML Button btn_administrador, btn_agresor, BTN_AGREGAR,BTN_MODIFICAR,BTN_ELIMINAR_VICTIMA,BTN_VERIFICAR,
            BTN_ELIMINAR_AGRESOR,BTN_AGREGAR_AGRESOR,BTN_VERIFICAR_AGRESOR,BTN_MODIFICAR_AGRESOR;
    //IMAGEVIEW
    @FXML ImageView iv_buscar_reporte;
    //JFXTEXTFIELD
    @FXML JFXTextField txtNumeroOficio;
    @FXML JFXTextField TXT_FECHA,TXT_HORA;
    @FXML JFXTextField TXT_QUIEN_ENVIA;
    @FXML JFXTextField TXT_NOMBRE_DENUNCIANTE,TXT_NOMBRE_VICTIMA,TXT_NOMBRE_CUSTODIA,TXT_NOMBRE_AGRESOR;
    @FXML JFXTextField TXT_APATERNO, TXT_APATERNO_VICTIMA,TXT_APATERNO_CUSTODIA,TXT_APATERNO_AGRESOR;
    @FXML JFXTextField TXT_AMATERNO, TXT_AMATERNO_VICTIMA,TXT_AMATERNO_CUSTODIA,TXT_AMATERNO_AGRESOR;
    @FXML JFXTextField TXT_EDAD, TXT_EDAD_VICTIMA,TXT_EDAD_COSTODIA,TXT_EDAD_AGRESOR;
    @FXML JFXTextField TXT_RVICTIMA, TXT_RAGRESOR,TXT_RVICTIMA_COSTODIA,TXT_RVICTIMA_AGRESOR;
    @FXML JFXTextField TXT_CALLE,TXT_CALLE_VICTIMA,TXT_CALLE_CUSTODIA,TXT_CALLE_AGRESOR;
    @FXML JFXTextField TXT_NUMCALLE,TXT_NUMERO_VICTIMA,TXT_NUM_CUSTODIA,TXT_NUM_AGRESOR;
    @FXML JFXTextField TXT_COLONIA, TXT_COLONIA_VICTIMA,TXT_COLONIA_CUSTODIA,TXT_COLONIA_AGRESOR;
    @FXML JFXTextField TXT_CP,TXT_CP_VICTIMA,TXT_CP_CUSTODIA,TXT_CP_AGRESOR;
    @FXML JFXTextField TXT_TELEFONOFIJO,TXT_TFIJO_VICTIMA,TXT_TFIJO_CUSTODIA,TXT_TFIJO_AGRESOR;
    @FXML JFXTextField TXT_TELEFONOMOVIL,TXT_TMOVIL_VICTIMA,TXT_TMOVIL_CUSTODIA,TXT_TMOVIL_AGRESOR;
    @FXML JFXTextField TXT_EMAIL,TXT_EMAIL_VICTIMA,TXT_EMAIL_CUSTODIA,TXT_EMAIL_AGRESOR;
    @FXML JFXTextField TXT_ENTRE_CALLES_VICTIMA;
    @FXML JFXTextField TXT_LUGAR_TRABAJO_AGRESOR,TXT_OCUPACION_AGRESOR;
    @FXML JFXTextField TXT_OTRA_VULNERAVILIDAD,
            txt_titulodoc,txt_comentario;
    //TEXTAREA            
    @FXML TextArea TXT_REFERENCIA_HOGAR_VICTIMA;
    @FXML TextArea TXT_RESENA_VULNERACION;
    @FXML TextArea TXT_OBSERVACIONES;
    //JFXRADIOBUTTON
    @FXML JFXRadioButton CHECK_ANONIMA;
    @FXML JFXRadioButton CHECK_PUBLICA;
    @FXML JFXRadioButton CHECK_PRIVADA;
    @FXML JFXRadioButton CHECK_DPERSONAL;
    @FXML JFXRadioButton CHECK_DTELEFONICA;
    @FXML JFXRadioButton CHECK_DESCRITA;   
    //SE DECLARAN LAS TABLAS Y LAS COLUMNAS
    //TABLA VICTIMAS
    @FXML  TableView<persona2> tablaPersonas;
    @FXML  TableColumn nombreCL;
    @FXML  TableColumn apaternoCL;
    @FXML  TableColumn amaternoCL;
    @FXML  TableColumn edadCL;
    @FXML  TableColumn sexoCL;
    @FXML  TableColumn escolaridadCL;
    @FXML  TableColumn ragresorCL;
    ObservableList<persona2> personas;  
    public int posicionPersonaEnTabla;

    // Declaramos la tabla y las columnas
    @FXML private TableView<Persona> tablaDocumentos;
    @FXML private TableColumn rutaCL;
    @FXML private TableColumn tituloCL;
    @FXML private TableColumn estadoCL;
    @FXML private TableColumn clasificacionCL;
    @FXML private TableColumn comentarioCL;
    ObservableList<Persona> ListaDocuementos;
    private int posicionDocumentoEnTabla;


    //TABLA AGRESORES    
    @FXML  TableView<persona2> tablaPersonas2;
    @FXML  TableColumn nombreCL2;
    @FXML  TableColumn apaternoCL2;
    @FXML  TableColumn amaternoCL2;
    @FXML  TableColumn edadCL2;
    @FXML  TableColumn sexoCL2;
    @FXML  TableColumn escolaridadCL2;
    @FXML  TableColumn ragresorCL2;
    @FXML  TableColumn tfijoCL2;
    @FXML  TableColumn tmovilC2;
    @FXML  TableColumn emailC2;
    @FXML  TableColumn calleC2;
    @FXML  TableColumn coloniaC2;
    @FXML  TableColumn numC2;
    @FXML  TableColumn cpC2;
    @FXML  TableColumn municipioC2;
    @FXML  TableColumn estadocivilCL;
    @FXML  TableColumn ocupacionCL;
    @FXML  TableColumn lugartrabajoCL;
    ObservableList<persona2> personas2; 
    public int posicionPersonaEnTabla2;
    
    
        public FXMLMRController() {

        }

    //eventos documentos
    @FXML public void aniadirDocumento() {
        if(String.valueOf(combo_estado.getValue())=="publico"){
            estado=1;
        }
        else{
            estado=0;
        }
        Persona documento = new Persona();
        documento.ruta.set(archivo);
        documento.titulo.set(txt_titulodoc.getText());
        documento.estado.set(estado);
        documento.comentario.setValue(txt_comentario.getText());
        documento.clasificacion.set(String.valueOf(combo_clacificacion.getValue()));
        ListaDocuementos.add(documento);
        txt_comentario.setText("");
        txt_titulodoc.setText("");
        btn_eliminar_archivo.setDisable(false);
    }


    /**
     * Método que realiza las acciones tras pulsar el boton "Eliminar"
     *
     * @param event
     */
    @FXML private void eliminarD(ActionEvent event) {
        ListaDocuementos.remove(posicionDocumentoEnTabla);
    }
    /**
     * Listener de la tabla personas
     */
    private final ListChangeListener<Persona> selectorTablaDocumentos =
            new ListChangeListener<Persona>() {
                @Override
                public void onChanged(ListChangeListener.Change<? extends Persona> c) {
                    ponerDocumentoSeleccionado();
                }
    };

    
     /* PARA SELECCIONAR UNA CELDA DE LA TABLA "tablaPersonas"
     */
    public Persona getTablaDocumentosSeleccionado() {
        if (tablaDocumentos != null) {
            List<Persona> tabla = tablaDocumentos.getSelectionModel().getSelectedItems();
            if (tabla.size() == 1) {
                final Persona competicionSeleccionada = tabla.get(0);
                return competicionSeleccionada;
            }
        }
        return null;
    }

    /**
     * Método para poner en los textFields la tupla que selccionemos
     */
    private void ponerDocumentoSeleccionado() {
        final Persona documento = getTablaDocumentosSeleccionado();
        posicionDocumentoEnTabla = ListaDocuementos.indexOf(documento);

        if (documento != null) {

            // Pongo los textFields con los datos correspondientes
          
            txt_titulodoc.setText(documento.getTitulo());
            estado=1;
            txt_comentario.setText(documento.getComentarioo());

        }
    }

    /**
     * Método para inicializar la tabla
     */
    private void inicializarTablaDocumentos() {
        rutaCL.setCellValueFactory(new PropertyValueFactory<Persona, String>("ruta"));
        tituloCL.setCellValueFactory(new PropertyValueFactory<Persona, String>("titulo"));
        estadoCL.setCellValueFactory(new PropertyValueFactory<Persona, Integer>("estado"));
        clasificacionCL.setCellValueFactory(new PropertyValueFactory<Persona, String>("clasificacion"));
        comentarioCL.setCellValueFactory(new PropertyValueFactory<Persona, String>("clasificacion"));
        ListaDocuementos = FXCollections.observableArrayList();
        tablaDocumentos.setItems(ListaDocuementos);
    }
    

    //EVENTOS DE LAS TABLA VICTIMA
    @FXML private void Aniadir(ActionEvent event) {
        Alert dialogo=new Alert(AlertType.WARNING);
        dialogo.setContentText(" Verificando datos");
        java.awt.Toolkit.getDefaultToolkit().beep();
        //dialogo.setHeaderText("fff");
        dialogo.setTitle("EVNNYA");
        dialogo.initStyle(StageStyle.UTILITY);
        //dialogo.showAndWait();

        if(TXT_NOMBRE_VICTIMA.getText().equals("")){
            dialogo.setHeaderText("Falta de ingresar nombre de la víctima");
            dialogo.showAndWait();
        }
        else{

            persona2 persona = new persona2();
            persona.nombre.set(TXT_NOMBRE_VICTIMA.getText());
            persona.apellido_paterno.set(TXT_APATERNO_VICTIMA.getText());
            persona.apellido_materno.set(TXT_AMATERNO_VICTIMA.getText());
            if(TXT_EDAD_VICTIMA.getText().equals("")){
                persona.edad.set(0);
            }
            else{
             persona.edad.set(Integer.parseInt(TXT_EDAD_VICTIMA.getText()));   
            }        
            persona.sexo.set(String.valueOf(combo_sexo_victima.getValue()));
            persona.escolaridad.set(String.valueOf(combo_escolaridad_victima.getValue()));
            persona.ragresor.set(TXT_RAGRESOR.getText());
            personas.add(persona);

            TXT_NOMBRE_VICTIMA.setText("");
            TXT_APATERNO_VICTIMA.setText("");
            TXT_AMATERNO_VICTIMA.setText("");
            TXT_EDAD_VICTIMA.setText("");
                TXT_TFIJO_VICTIMA.setText("");
            TXT_TMOVIL_VICTIMA.setText("");
            TXT_EMAIL_VICTIMA.setText("");
            TXT_RAGRESOR.setText("");  
            //BTN_AGREGAR.setDisable(true);
            BTN_ELIMINAR_VICTIMA.setDisable(false);
            BTN_MODIFICAR.setDisable(false);
            }

        }

    @FXML private void Verificar_victima(ActionEvent event){
        if(TXT_NOMBRE_VICTIMA.getText().equals("")|| TXT_APATERNO_VICTIMA.getText().equals("")|| TXT_EDAD_VICTIMA.getText().equals(""))
        {
            BTN_AGREGAR.setDisable(true);
            BTN_ELIMINAR_VICTIMA.setDisable(true);
            BTN_MODIFICAR.setDisable(true);
        }
        else
        {
            BTN_AGREGAR.setDisable(false);

        }
    }

    @FXML private void modificar(ActionEvent event) {

        persona2 persona = new persona2();
        persona.nombre.set(TXT_NOMBRE_VICTIMA.getText());
        persona.apellido_paterno.set(TXT_APATERNO_VICTIMA.getText());
        persona.apellido_materno.set(TXT_AMATERNO_VICTIMA.getText());
        persona.edad.set(Integer.parseInt(TXT_EDAD_VICTIMA.getText()));
        persona.sexo.set(String.valueOf(combo_sexo_victima.getValue()));
        persona.escolaridad.set(String.valueOf(combo_escolaridad_victima.getValue()));
        persona.ragresor.set(TXT_RAGRESOR.getText());
        personas.set(posicionPersonaEnTabla, persona);

        TXT_NOMBRE_VICTIMA.setText("");
        TXT_APATERNO_VICTIMA.setText("");
        TXT_AMATERNO_VICTIMA.setText("");
        TXT_EDAD_VICTIMA.setText("");
        TXT_TFIJO_VICTIMA.setText("");
        TXT_TMOVIL_VICTIMA.setText("");
        TXT_EMAIL_VICTIMA.setText("");
        TXT_RAGRESOR.setText("");
        }

    private void ponerPersonaSeleccionada() {

        final persona2 persona = getTablaPersonasSeleccionada();
        posicionPersonaEnTabla = personas.indexOf(persona);

        if (persona != null) {

            // Pongo los textFields con los datos correspondientes
            TXT_NOMBRE_VICTIMA.setText(persona.getNombre());
            TXT_APATERNO_VICTIMA.setText(persona.getApellido_paterno());
            TXT_AMATERNO_VICTIMA.setText(persona.getApellido_materno());
            TXT_RAGRESOR.setText(persona.getRagresor());
            TXT_EDAD_VICTIMA.setText(persona.getEdad().toString());
        }
    }    

    @FXML public void eliminar(ActionEvent event) {

        personas.remove(posicionPersonaEnTabla);

        TXT_NOMBRE_VICTIMA.setText("");
        TXT_APATERNO_VICTIMA.setText("");
        TXT_AMATERNO_VICTIMA.setText("");
        TXT_EDAD_VICTIMA.setText("");
        TXT_TFIJO_VICTIMA.setText("");
        TXT_TMOVIL_VICTIMA.setText("");
        TXT_EMAIL_VICTIMA.setText("");
        TXT_RAGRESOR.setText("");
        }

    private void inicializarTablaPersonas() {

        nombreCL.setCellValueFactory(new PropertyValueFactory<persona2, String>("nombre"));
        apaternoCL.setCellValueFactory(new PropertyValueFactory<persona2, String>("apellido_paterno"));
        amaternoCL.setCellValueFactory(new PropertyValueFactory<persona2, String>("apellido_materno"));
        edadCL.setCellValueFactory(new PropertyValueFactory<persona2, Integer>("edad"));
        sexoCL.setCellValueFactory(new PropertyValueFactory<persona2, String>("sexo"));
        escolaridadCL.setCellValueFactory(new PropertyValueFactory<persona2, String>("escolaridad"));
        ragresorCL.setCellValueFactory(new PropertyValueFactory<persona2, String>("ragresor"));  
        personas = FXCollections.observableArrayList();
        tablaPersonas.setItems(personas);
        }
    
    private final ListChangeListener<persona2> selectorTablaPersonas = new ListChangeListener<persona2>() {

            @Override
            public void onChanged(ListChangeListener.Change<? extends persona2> c) {
                ponerPersonaSeleccionada();
            }
    };

    public persona2 getTablaPersonasSeleccionada() {

        if (tablaPersonas != null) {
            List<persona2> tabla = tablaPersonas.getSelectionModel().getSelectedItems();
            if (tabla.size() == 1) {
                final persona2 competicionSeleccionada = tabla.get(0);
                return competicionSeleccionada;
            }
        }
        return null;
    }

    //EVENTOS DE LAS TABLA AGRESOR
    @FXML private void AniadirAgresores(ActionEvent event) {

        //TOMA LOS VALORES DE LOS TXTFIELDS 
        Alert dialogo=new Alert(AlertType.WARNING);
        dialogo.setContentText(" Verificando datos");
        java.awt.Toolkit.getDefaultToolkit().beep();
        //dialogo.setHeaderText("fff");
        dialogo.setTitle("EVNNYA");
        dialogo.initStyle(StageStyle.UTILITY);
        //dialogo.showAndWait();
        if(TXT_NOMBRE_AGRESOR.getText().equals("")){
           dialogo.setHeaderText("Falta nombre agresor");
           dialogo.showAndWait();
        }
        else{

            persona2 persona = new persona2();
            persona.nombre.set(TXT_NOMBRE_AGRESOR.getText());
            persona.apellido_paterno.set(TXT_APATERNO_AGRESOR.getText());
            persona.apellido_materno.set(TXT_AMATERNO_AGRESOR.getText());
            if(TXT_EDAD_AGRESOR.getText().equals("")){
                persona.edad.set(0);
            }
            else if(TXT_CP_AGRESOR.getText().equals("")){
                persona.cp.set(0);          
            }
            else{
                persona.cp.set(Integer.parseInt(TXT_CP_AGRESOR.getText()));
                persona.edad.set(Integer.parseInt(TXT_EDAD_AGRESOR.getText()));
            }
            persona.sexo.set(String.valueOf(combo_sexo_agresor.getValue()));
            persona.escolaridad.set(String.valueOf(combo_escolaridad_agresor.getValue()));
            persona.ragresor.set(TXT_RVICTIMA_AGRESOR.getText());
            persona.telefono_fijo.set(TXT_TFIJO_AGRESOR.getText());
            persona.telefono_movil.set(TXT_TMOVIL_AGRESOR.getText());
            persona.email.set(TXT_EMAIL_AGRESOR.getText());
            persona.calle.set(TXT_CALLE_AGRESOR.getText());
            persona.colonia.set(TXT_COLONIA_AGRESOR.getText());            
            persona.numero.set(TXT_NUM_AGRESOR.getText());
            persona.municipio.set(String.valueOf(COMBO_MUNICIPIO_AGRESOR2.getValue()));
            persona.estado_civil.set(String.valueOf(combo_estado_civil_agresor.getValue()));
            //System.out.println(""+persona.estado_civil);
            persona.ocupacion.set(TXT_OCUPACION_AGRESOR.getText());
            //System.out.println(""+persona.ocupacion);
            persona.lugar_trabajo.set(TXT_LUGAR_TRABAJO_AGRESOR.getText());
            //System.out.println(""+persona.lugar_trabajo);
            personas2.add(persona);
            TXT_NOMBRE_AGRESOR.setText("");
            TXT_APATERNO_AGRESOR.setText("");
            TXT_AMATERNO_AGRESOR.setText("");
            TXT_EDAD_AGRESOR.setText("");
            TXT_TFIJO_AGRESOR.setText("");
            TXT_TMOVIL_AGRESOR.setText("");
            TXT_CALLE_AGRESOR.setText("");
            TXT_COLONIA_AGRESOR.setText("");
            TXT_NUM_AGRESOR.setText("");
            TXT_EMAIL_AGRESOR.setText("");
            TXT_RVICTIMA_AGRESOR.setText("");  
            //BTN_AGREGAR_AGRESOR.setDisable(true);
            BTN_ELIMINAR_AGRESOR.setDisable(false);
            BTN_MODIFICAR_AGRESOR.setDisable(false);
           }

    }

    @FXML private void Modificar_Agresor(ActionEvent event) {

        //TOMA LOS VALORES DE LOS TXTFIELDS 
        Alert dialogo=new Alert(AlertType.WARNING);
        dialogo.setContentText(" Verificando datos");
        java.awt.Toolkit.getDefaultToolkit().beep();
        //dialogo.setHeaderText("fff");
        dialogo.setTitle("EVNNYA");
        dialogo.initStyle(StageStyle.UTILITY);
        //dialogo.showAndWait();
        if(TXT_NOMBRE_AGRESOR.getText().equals("")){
           dialogo.setHeaderText("Falta nombre agresor");
           dialogo.showAndWait();
        }
        else{
            persona2 persona = new persona2();
            persona.nombre.set(TXT_NOMBRE_AGRESOR.getText());
            persona.apellido_paterno.set(TXT_APATERNO_AGRESOR.getText());
            persona.apellido_materno.set(TXT_AMATERNO_AGRESOR.getText());
            persona.edad.set(Integer.parseInt(TXT_EDAD_AGRESOR.getText()));
            persona.sexo.set(String.valueOf(combo_sexo_agresor.getValue()));
            persona.escolaridad.set(String.valueOf(combo_escolaridad_agresor.getValue()));
            persona.telefono_fijo.set(TXT_TFIJO_AGRESOR.getText());
            persona.telefono_movil.set(TXT_TMOVIL_AGRESOR.getText());
            persona.email.set(TXT_EMAIL_AGRESOR.getText());
            persona.calle.set(TXT_CALLE_AGRESOR.getText());
            persona.colonia.set(TXT_COLONIA_CUSTODIA.getText());
            persona.numero.set(TXT_NUM_AGRESOR.getText());
            persona.cp.set(Integer.parseInt(TXT_CP_AGRESOR.getText()));
            persona.ragresor.set(TXT_RVICTIMA_AGRESOR.getText());
            personas2.set(posicionPersonaEnTabla2, persona);
            TXT_NOMBRE_AGRESOR.setText("");
            TXT_APATERNO_AGRESOR.setText("");
            TXT_AMATERNO_AGRESOR.setText("");
            TXT_EDAD_AGRESOR.setText("");
            TXT_TFIJO_AGRESOR.setText("");
            TXT_TMOVIL_AGRESOR.setText("");
            TXT_EMAIL_AGRESOR.setText("");
            TXT_RVICTIMA_AGRESOR.setText("");        
        }

        }

    @FXML private void eliminar_Agresor(ActionEvent event) {
            personas2.remove(posicionPersonaEnTabla);
            TXT_NOMBRE_AGRESOR.setText("");
            TXT_APATERNO_AGRESOR.setText("");
            TXT_AMATERNO_AGRESOR.setText("");
            TXT_EDAD_AGRESOR.setText("");
            TXT_TFIJO_AGRESOR.setText("");
            TXT_TMOVIL_AGRESOR.setText("");
            TXT_EMAIL_AGRESOR.setText("");
            TXT_CALLE_AGRESOR.setText("");
            TXT_CP_AGRESOR.setText("");
            TXT_RVICTIMA_AGRESOR.setText("");
        }

    private void inicializarTablaPersonas2() {

            nombreCL2.setCellValueFactory(new PropertyValueFactory<persona2, String>("nombre"));
            apaternoCL2.setCellValueFactory(new PropertyValueFactory<persona2, String>("apellido_paterno"));
            amaternoCL2.setCellValueFactory(new PropertyValueFactory<persona2, String>("apellido_materno"));
            edadCL2.setCellValueFactory(new PropertyValueFactory<persona2, Integer>("edad"));
            sexoCL2.setCellValueFactory(new PropertyValueFactory<persona2, String>("sexo"));
            escolaridadCL2.setCellValueFactory(new PropertyValueFactory<persona2, String>("escolaridad"));
            tmovilC2.setCellValueFactory(new PropertyValueFactory<persona2, String>("telefono_movil"));
            tfijoCL2.setCellValueFactory(new PropertyValueFactory<persona2, String>("telefono_fijo"));
            ragresorCL2.setCellValueFactory(new PropertyValueFactory<persona2, String>("ragresor"));
            emailC2.setCellValueFactory(new PropertyValueFactory<persona2, String>("email"));       
            coloniaC2.setCellValueFactory(new PropertyValueFactory<persona2, String>("colonia"));
            calleC2.setCellValueFactory(new PropertyValueFactory<persona2, String>("calle"));
            numC2.setCellValueFactory(new PropertyValueFactory<persona2, String>("numero"));
            cpC2.setCellValueFactory(new PropertyValueFactory<persona2, Integer>("cp"));
            municipioC2.setCellValueFactory(new PropertyValueFactory<persona2, String>("municipio"));
            estadocivilCL.setCellValueFactory(new PropertyValueFactory<persona2, String>("estado_civil"));
            ocupacionCL.setCellValueFactory(new PropertyValueFactory<persona2, String>("ocupacion"));
            lugartrabajoCL.setCellValueFactory(new PropertyValueFactory<persona2, String>("lugar_trabajo"));
            personas2 = FXCollections.observableArrayList();
            tablaPersonas2.setItems(personas2);
        }

    private final ListChangeListener<persona2> selectorTablaPersonas2 =
        new ListChangeListener<persona2>() {
                    @Override
                    public void onChanged(ListChangeListener.Change<? extends persona2> c) {
                        ponerPersonaSeleccionada2();
                        //System.out.println(""+posicionPersonaEnTabla2);
                    }
                };

    public persona2 getTablaPersonasSeleccionada2() {
            if (tablaPersonas2 != null) {
                List<persona2> tabla = tablaPersonas2.getSelectionModel().getSelectedItems();
                if (tabla.size() == 1) {
                    final persona2 competicionSeleccionada = tabla.get(0);
                    return competicionSeleccionada;
                }
            }
            return null;
        }

    private void ponerPersonaSeleccionada2() {
            final persona2 persona = getTablaPersonasSeleccionada2();
            posicionPersonaEnTabla2 = personas2.indexOf(persona);

            if (persona != null) {

                // Pongo los textFields con los datos correspondientes
                TXT_NOMBRE_AGRESOR.setText(persona.getNombre());
                TXT_APATERNO_AGRESOR.setText(persona.getApellido_paterno());
                TXT_RVICTIMA_AGRESOR.setText(persona.getRagresor());
                TXT_EDAD_AGRESOR.setText(persona.getEdad().toString());
                TXT_CALLE_AGRESOR.setText(persona.getCalle().toString());
                TXT_CP_AGRESOR.setText(persona.getCp().toString());
                TXT_NUM_AGRESOR.setText(persona.getNumero());
                TXT_COLONIA_AGRESOR.setText(persona.getColonia());
                TXT_TMOVIL_AGRESOR.setText(persona.getTelefono_movil());
                TXT_TFIJO_AGRESOR.setText(persona.getTelefono_fijo());
                TXT_EMAIL_AGRESOR.setText(persona.getEmail());

            }
            System.out.println(""+posicionPersonaEnTabla2 );
        }

     //EVENTOS DE LA INTERFAZ
    @FXML private void handleButtonAction(ActionEvent event) {
           //System.out.println("Presiono: "+event.getTarget().toString());
            if(event.getTarget()==btn_recepcion){
                pnl_recepcio.setVisible(true);
                pnl_recepcion.setVisible(true);
                pnl_custodia.setVisible(false);
                pnl_victima.setVisible(false);
                pnl_agresor.setVisible(false);
                pnl_vulnerabilidad.setVisible(false);
                pnl_archivos.setVisible(false);

            }else if(event.getTarget()==btn_custodia){
                pnl_recepcio.setVisible(false);
                pnl_recepcion.setVisible(true);
                pnl_custodia.setVisible(true);
                pnl_victima.setVisible(false);
                pnl_agresor.setVisible(false);
                pnl_vulnerabilidad.setVisible(false);
                pnl_archivos.setVisible(false);

            }else if(event.getTarget()==btn_victima){
                pnl_recepcio.setVisible(false);
                pnl_recepcion.setVisible(true);
                pnl_custodia.setVisible(false);
                pnl_victima.setVisible(true);
                pnl_agresor.setVisible(false);
                pnl_vulnerabilidad.setVisible(false);
                pnl_archivos.setVisible(false);

            }else if(event.getTarget()==btn_agresor){
                pnl_recepcio.setVisible(false);
                pnl_recepcion.setVisible(true);
                pnl_custodia.setVisible(false);
                pnl_victima.setVisible(false);
                pnl_agresor.setVisible(true);
                pnl_vulnerabilidad.setVisible(false);
                pnl_archivos.setVisible(false);

            }else if(event.getTarget()==btn_vulnerabilidad){
                pnl_recepcio.setVisible(false);
                pnl_recepcion.setVisible(true);
                pnl_custodia.setVisible(false);
                pnl_victima.setVisible(false);
                pnl_agresor.setVisible(false);
                pnl_vulnerabilidad.setVisible(true);
                pnl_archivos.setVisible(false);

            }else if(event.getTarget()==btn_resenia){
                pnl_recepcio.setVisible(false);
                pnl_recepcion.setVisible(true);
                pnl_custodia.setVisible(false);
                pnl_victima.setVisible(false);
                pnl_agresor.setVisible(false);
                pnl_vulnerabilidad.setVisible(false);
                pnl_archivos.setVisible(false);

            } else if(event.getTarget()==btn_archivos){
                pnl_recepcio.setVisible(false);
                pnl_recepcion.setVisible(true);
                pnl_custodia.setVisible(false);
                pnl_victima.setVisible(false);
                pnl_agresor.setVisible(false);
                pnl_vulnerabilidad.setVisible(false);
                pnl_archivos.setVisible(true);  
            } else if(event.getTarget()==check_persona_moral){
                check_persona_fisica.setSelected(false);
                TIPO_DE_PERSONA_DENUNCINTE="Persona Moral";
                TXT_APATERNO.setText("MORAL");
                TXT_AMATERNO.setText("MORAL");
                combo_sexo_denunciante.setDisable(true);
                combo_escolaridad_denunciante.setDisable(true);
            } else if(event.getTarget()==check_persona_fisica){
                check_persona_moral.setSelected(false);
                combo_sexo_denunciante.setDisable(false);
                combo_escolaridad_denunciante.setDisable(false);
                TIPO_DE_PERSONA_DENUNCINTE="Persona Fisica";
                TXT_APATERNO.setText("");
                TXT_AMATERNO.setText("");
            } else if(event.getTarget()==CHECK_ANONIMA){
               TIPO_DE_DENUNCIA=1;

            }else if(event.getTarget()==CHECK_PUBLICA){
               TIPO_DE_DENUNCIA=2;

             }else if(event.getTarget()==CHECK_PRIVADA){
               TIPO_DE_DENUNCIA=3;  

            }else if(event.getTarget()==CHECK_DTELEFONICA){

               Medio_denuncia="Telefonica";

            }else if(event.getTarget()==CHECK_DESCRITA){

               Medio_denuncia="Escrita";

           }else if(event.getTarget()==CHECK_DESCRITA){
               Medio_denuncia="Personal";

            } else if(event.getTarget()==iv_buscar_reporte){


            }

        }

    //comprueba si existen los valores escenciales para subir un expediente
    @FXML public void VERIFICAR_DATOS(ActionEvent event){

        //TOMA LOS VALORES DE LOS TXTFIELDS 
        Alert dialogo=new Alert(AlertType.WARNING);
        dialogo.setContentText(" Verificando datos");
        java.awt.Toolkit.getDefaultToolkit().beep();
        //dialogo.setHeaderText("fff");
        dialogo.setTitle("EVNNYA");
        dialogo.initStyle(StageStyle.UTILITY);
        dialogo.showAndWait();


        if(TXT_NOMBRE_DENUNCIANTE.getText().equals("")){
            dialogo.setHeaderText("falta nombre del denunciante");
            dialogo.showAndWait();
        }
        else if(personas.isEmpty()==true){
            dialogo.setHeaderText("falta nombre de la victima");
            dialogo.showAndWait();
        }

        else if(personas2.isEmpty()==true){
            dialogo.setHeaderText("falta nombre del agresor");
            dialogo.showAndWait();
        }
        else{
            BTN_FREPORTE.setDisable(false);
        }

    }

    @FXML public void Convertir_datos(){

        //DENUNCIANTE
        NUM_OFICIO=(txtNumeroOficio.getText());   
        NOMBRE_DENUNCIANTE=(TXT_NOMBRE_DENUNCIANTE.getText());
        A_PATERNO_DENUNCIANTE=(TXT_APATERNO.getText());  
        A_MATERNO_DENUNCIANTE=(TXT_AMATERNO.getText());
        if(TXT_EDAD.getText().equals("")){
                EDAD_DENUNCIANTE=0;
           }
           else if(TXT_CP.getText().equals("")){
                D_CP_DENUNCIANTE=0;          
           }
           else{
                D_CP_DENUNCIANTE=Integer.parseInt(TXT_CP.getText());
                EDAD_DENUNCIANTE=(Integer.parseInt(TXT_EDAD.getText()));
           }
         RELACION_VICTIMA_DENUNCIANTE=(TXT_RVICTIMA.getText());
         D_NUM_DENUNCIANTE=(TXT_NUMCALLE.getText());
         D_CALLE_DENUNCIANTE=(TXT_CALLE.getText());    
         D_COLONIA_DENUNCIANTE=(TXT_COLONIA.getText());    
         D_EMAIL_DENUNCIANTE=(TXT_EMAIL.getText());
         D_TELEFONO_FIJO_DENUNCIANTE=(TXT_TELEFONOFIJO.getText());
         D_TELEFONO_MOVIL_DENUNCIANTE=(TXT_TELEFONOMOVIL.getText());
         SEXO_DENUNCIANTE=String.valueOf(combo_sexo_denunciante.getValue());
         ESCOLARIDAD_DENUNCIANTE=String.valueOf(combo_escolaridad_denunciante.getValue());
         D_MUNICIPIO_DENUNCIANTE=String.valueOf(COMBO_MUNICIPIO_DENUNCIANTE.getValue());
         //VICTIMA
         D_TELEFONO_FIJO_VICTIMA=TXT_TFIJO_VICTIMA.getText();
         D_TELEFONO_MOVIL_VICTIMA=TXT_TMOVIL_VICTIMA.getText();
         D_EMAIL_VICTIMA=TXT_EMAIL_VICTIMA.getText();
         D_CALLE_VICTIMA=TXT_CALLE_VICTIMA.getText();
         D_NUM_VICTIMA=(TXT_NUMERO_VICTIMA.getText());
         if(TXT_CP_VICTIMA.getText().equals("")){
             D_CP_VICTIMA=0;
         }
         else{
             D_CP_VICTIMA=Integer.parseInt(TXT_CP_VICTIMA.getText());
         }

         D_COLONIA_VICTIMA=TXT_COLONIA_VICTIMA.getText();
         D_ENTRE_CALLE_VICTIMA=TXT_ENTRE_CALLES_VICTIMA.getText();
         D_MUNICIPIO_VICTIMA=String.valueOf(combo_sexo_victima.getValue());
         D_REFERANCIA_CASA_VICTIMA=TXT_REFERENCIA_HOGAR_VICTIMA.getText(); 
         //AGRESOR
         D_TELEFONO_FIJO_AGRESOR=TXT_TFIJO_AGRESOR.getText();
         D_TELEFONO_MOVIL_AGRESOR=TXT_TMOVIL_AGRESOR.getText();
         D_EMAIL_AGRESOR=TXT_EMAIL_AGRESOR.getText();
         D_CALLE_AGRESOR=TXT_CALLE_AGRESOR.getText();
         D_NUM_AGRESOR=(TXT_NUM_AGRESOR.getText());
         if(TXT_COLONIA_AGRESOR.getText().equals("")){
             D_CP_AGRESOR=0;
         }
         else{
             D_CP_AGRESOR=Integer.parseInt(TXT_COLONIA_AGRESOR.getText());
         }    
         D_COLONIA_AGRESOR=TXT_COLONIA_AGRESOR.getText();
         D_MUNICIPIO_AGRESOR=String.valueOf(combo_sexo_agresor.getValue());
         //CUSTODIA
         NOMBRE_CUSTODIA=TXT_NOMBRE_CUSTODIA.getText();
         A_PATERNO_CUSTODIA=TXT_AMATERNO_CUSTODIA.getText();
         A_MATERNO_CUSTODIA=TXT_AMATERNO_CUSTODIA.getText();
         if(TXT_EDAD_COSTODIA.getText().equals("")){
                EDAD_CUSTODIA=0;
            }
//            else if(TXT_CP_CUSTODIA.getText().equals("")){
//                D_CP_CUSTODIA=0;  
//                
//            }
            else{
//                D_CP_CUSTODIA=Integer.parseInt(TXT_CP_CUSTODIA.getText());
                EDAD_CUSTODIA=(Integer.parseInt(TXT_EDAD_COSTODIA.getText()));
            }
         SEXO_CUSTODIA=String.valueOf(combo_sexo_tutela.getValue());
         ESCOLARIDAD_CUSTODIA=String.valueOf(combo_escolaridad_tutela.getValue());
         RELACION_VICTIMA_CUSTODIA=TXT_RVICTIMA_COSTODIA.getText();
         D_CALLE_CUSTODIA=TXT_CALLE_CUSTODIA.getText();
         D_NUM_CUSTODIA=(TXT_NUM_CUSTODIA.getText());
         D_COLONIA_CUSTODIA=TXT_COLONIA_CUSTODIA.getText();
         D_TELEFONO_FIJO_CUSTODIA=TXT_TFIJO_CUSTODIA.getText();
         D_TELEFONO_MOVIL_CUSTODIA=TXT_TMOVIL_CUSTODIA.getText();
         D_EMAIL_CUSTODIA=TXT_TFIJO_CUSTODIA.getText();
         D_MUNICIPIO_CUSTODIA=String.valueOf(COMBO_MUNICIPIO_CUSTODIA.getValue());
         //VULNERABILIDAD
         if(TXT_OBSERVACIONES.getText().equals("")){
             OBSERVACIONES="";
         }
         else{
             OBSERVACIONES=TXT_OBSERVACIONES.getText();
         }
         if(TXT_RESENA_VULNERACION.getText().equals("")){
             OBSERVACIONES="";
         }
         else{
             RESENA_SITUACION=TXT_RESENA_VULNERACION.getText();
         }
         FECHA_SISTEMA=String.valueOf(herramientas.obtenerFechaSistema());
         FECHA_OFICIO=TXT_FECHA.getText();
         HORA_SISTEMA=String.valueOf(herramientas.getHoraActual());
         BTN_FREPORTE.setDisable(false);  

    }

    
    
        @FXML  void Mandar_alaBD(ActionEvent event){  

        Convertir_datos(); 


//        //SE INSTANCIA LA CLASE CONEXION
//        mysql_conecction con = new mysql_conecction();
//        //variable de conexion
//        Connection cn = con.conexion();
//        //encriptamiento
//        cls_encriptamiento objeto = new cls_encriptamiento();
 
        
        //CUSTODIA
        
        insertar_custodia();

       Limpiarcampos();

    } 
    
    public void insertar_custodia(){
        
         //SE INSTANCIA LA CLASE CONEXION
        mysql_conecction con = new mysql_conecction();
        //variable de conexion
        Connection cn = con.conexion();
        //encriptamiento
        cls_encriptamiento objeto = new cls_encriptamiento();
        
        try{
         PreparedStatement pps = cn.prepareStatement("INSERT INTO custodia (id, nombre, apellido_paterno"
                 + ",apellido_materno, edad, sexo, escolaridad, relacion_victima) VALUES"
                 + "(?,?,?,?,?,?,?,?);");
         pps.setString(1, null);
         pps.setString(2, objeto.metodo_encriptamiento(NOMBRE_CUSTODIA));
         pps.setString(3, objeto.metodo_encriptamiento(A_PATERNO_CUSTODIA));
         pps.setString(4, objeto.metodo_encriptamiento(A_MATERNO_CUSTODIA));
         pps.setInt(5, EDAD_CUSTODIA);
         pps.setString(6,objeto.metodo_encriptamiento(SEXO_CUSTODIA));
         pps.setString(7,objeto.metodo_encriptamiento(ESCOLARIDAD_CUSTODIA));
         pps.setString(8,objeto.metodo_encriptamiento(RELACION_VICTIMA_CUSTODIA));
         pps.executeUpdate();
         pps.close();
//    //String query="INSERT INTO custodia (id, nombre, apellido_paterno"
//    //                 + ",apellido_materno, edad, sexo, escolaridad, relacion_victima) VALUES"
//    //                 + "(null,'"+NOMBRE_CUSTODIA+"','"+A_PATERNO_CUSTODIA+"','"+A_MATERNO_CUSTODIA+"'"+EDAD_CUSTODIA+"','"+SEXO_CUSTODIA+"','"+ESCOLARIDAD_CUSTODIA+"','"+RELACION_VICTIMA_CUSTODIA+"');";
//    //Statement st = cn.createStatement();
//    //            //EJECUTA EL QUERY
//    //            ResultSet rs = st.executeQuery(query);
        }
        catch(SQLException ex){
            System.out.println("tienes este error "+ex.getMessage());
        }
    }

    //LIMPIARDATOS
    public void Limpiarcampos(){
        TXT_NOMBRE_DENUNCIANTE.setText("");
        TXT_NOMBRE_VICTIMA.setText("");
        TXT_NOMBRE_CUSTODIA.setText("");
        TXT_NOMBRE_AGRESOR.setText("");
        TXT_AMATERNO.setText("");
        TXT_AMATERNO_AGRESOR.setText("");
        TXT_AMATERNO_VICTIMA.setText("");
        TXT_AMATERNO_CUSTODIA.setText("");
        TXT_APATERNO.setText("");
        TXT_APATERNO_AGRESOR.setText("");
        TXT_APATERNO_VICTIMA.setText("");
        TXT_APATERNO_CUSTODIA.setText("");
        TXT_CALLE.setText("");
        TXT_CALLE_AGRESOR.setText("");
        TXT_CALLE_CUSTODIA.setText("");
        TXT_CALLE_VICTIMA.setText("");
        TXT_CP.setText("");
        TXT_CP_AGRESOR.setText("");
        TXT_CP_VICTIMA.setText("");
        TXT_CP_CUSTODIA.setText("");
        TXT_COLONIA.setText("");
        TXT_COLONIA_AGRESOR.setText("");
        TXT_COLONIA_CUSTODIA.setText("");
        TXT_COLONIA_VICTIMA.setText("");
        TXT_NUMCALLE.setText("");
        TXT_NUMERO_VICTIMA.setText("");
        TXT_NUM_AGRESOR.setText("");
        TXT_NUM_CUSTODIA.setText("");
        TXT_TELEFONOFIJO.setText("");
        TXT_TFIJO_AGRESOR.setText("");
        TXT_TFIJO_CUSTODIA.setText("");
        TXT_TFIJO_VICTIMA.setText("");
        TXT_TELEFONOMOVIL.setText("");
        TXT_TMOVIL_AGRESOR.setText("");
        TXT_TMOVIL_CUSTODIA.setText("");
        TXT_AMATERNO_VICTIMA.setText("");
        TXT_EMAIL.setText("");
        TXT_EMAIL_AGRESOR.setText("");
        TXT_EMAIL_CUSTODIA.setText("");
        TXT_EMAIL_VICTIMA.setText("");
        for (int i = 0; i < ListaDocuementos.size(); i++) {
         
           ListaDocuementos.remove(i); 
        }
        for (int i = 0; i < personas.size(); i++) {
         
           personas.remove(i); 
        }
        for (int i = 0; i < personas2.size(); i++) {
         
           personas2.remove(i); 
        }
        
    }

    public JFXTextField validar(JFXTextField variable){


        variable.setOnKeyTyped(new EventHandler<javafx.scene.input.KeyEvent>(){


        @Override public void handle(javafx.scene.input.KeyEvent event) {

            char car = event.getCharacter().charAt(0);
            String stg = event.getText();
            if(stg=="{" || stg=="}" ){
                event.consume();
            }
            else if (Character.isLetter(car) ||car==')'||car=='['||car==']'  ||car=='{' ||car=='}'||car=='"' ||car=='/'  || car==',' || car=='.'|| car=='?'|| car=='_' ||car=='-'||car=='+'||car=='='||car=='`'||car=='~'||car=='<'||car=='>'||car==';'||car==':'||car=='!'||car=='@'||car=='™'||car=='#'||car=='$'||car=='%'||car=='^'||car=='&'||car=='*'||car=='(' ||car=='p'||car=='|') {
                event.consume();
            }      
            }

            });
            return variable;
            }
    @FXML public void SeleccionarArchivo(ActionEvent event){
        Alert dialogo=new Alert(AlertType.WARNING);
        dialogo.setContentText(" Verificando datos");
        java.awt.Toolkit.getDefaultToolkit().beep();
        //dialogo.setHeaderText("fff");
        dialogo.setTitle("EVNNYA");
        dialogo.initStyle(StageStyle.UTILITY);
        //dialogo.showAndWait();
        if(txt_comentario.getText().equals("")||txt_titulodoc.getText().equals("")){
            dialogo.setHeaderText("Rellena tods los campos");
            dialogo.showAndWait();
        }
        else{
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Buscar Imagen");

            // Agregar filtros para facilitar la busqueda
            fileChooser.getExtensionFilters().addAll(
                    new FileChooser.ExtensionFilter("All Images", "*.*"),
                    new FileChooser.ExtensionFilter("*.*", "*.*"),
                    new FileChooser.ExtensionFilter("*.*", "*.*")
            );

            // Obtener la imagen seleccionada
            File imgFile = fileChooser.showOpenDialog(null);
            archivo= imgFile.getAbsolutePath();       
            aniadirDocumento();
            txt_comentario.setText("");
            txt_titulodoc.setText("");
        }

    }

    @Override public void initialize(URL url, ResourceBundle rb) {
    
    //GRUPO NIVEL DE ANONIMATO
    ToggleGroup grupoAnonimo = new ToggleGroup();
    CHECK_ANONIMA.setToggleGroup(grupoAnonimo);
    CHECK_PUBLICA.setToggleGroup(grupoAnonimo);
    CHECK_PRIVADA.setToggleGroup(grupoAnonimo);
    
    //GRUPO MEDIO DE REPORTE
    ToggleGroup grupoMedioReporte = new ToggleGroup();
    CHECK_DESCRITA.setToggleGroup(grupoMedioReporte);
    CHECK_DPERSONAL.setToggleGroup(grupoMedioReporte);
    CHECK_DTELEFONICA.setToggleGroup(grupoMedioReporte);
    
    //grupo estado
    ToggleGroup grupoEstado = new ToggleGroup();
    //rdb_privado.setToggleGroup(grupoEstado);
    //rdb_publico.setToggleGroup(grupoEstado);
    
    this.inicializarTablaPersonas();
    this.inicializarTablaPersonas2();
    this.inicializarTablaDocumentos();
    
    //BTN_FREPORTE.setDisable(true);

    //VALIDAR CAMPOS NUMERICOS
    validar(TXT_EDAD_VICTIMA);
    validar(TXT_EDAD_AGRESOR);
    validar(TXT_EDAD_COSTODIA);
    validar(TXT_EDAD);
    validar(TXT_TELEFONOFIJO);
    validar(TXT_TELEFONOMOVIL);
    validar(TXT_TFIJO_AGRESOR);
    validar(TXT_TMOVIL_AGRESOR);
    validar(TXT_TFIJO_VICTIMA);
    validar(TXT_TMOVIL_VICTIMA);
    validar(TXT_TMOVIL_CUSTODIA);
    validar(TXT_TFIJO_CUSTODIA);
    validar(TXT_CP);
    validar(TXT_CP_AGRESOR);
    validar(TXT_CP_CUSTODIA);
    validar(TXT_CP_VICTIMA);
      
    //BOTON AGREGAR INICIA DESHANILITADO
    BTN_ELIMINAR_VICTIMA.setDisable(true);
    BTN_MODIFICAR.setDisable(true);
    btn_eliminar_archivo.setDisable(true);
    //BTN_AGREGAR.setDisable(true);

    BTN_ELIMINAR_AGRESOR.setDisable(true);
    BTN_MODIFICAR_AGRESOR.setDisable(true);
    //BTN_AGREGAR_AGRESOR.setDisable(true);
     
    // Seleccionar las tuplas de la tabla de las personas
    final ObservableList<persona2> tablaPersonaSel = tablaPersonas.getSelectionModel().getSelectedItems();
    tablaPersonaSel.addListener(selectorTablaPersonas); 

    final ObservableList<persona2> tablaPersonaSel2 = tablaPersonas2.getSelectionModel().getSelectedItems();
    tablaPersonaSel2.addListener(selectorTablaPersonas2); 
    
    final ObservableList<Persona> tablaDocumentoSeleccionado= tablaDocumentos.getSelectionModel().getSelectedItems();
    tablaDocumentoSeleccionado.addListener(selectorTablaDocumentos);
    
    
 

    //DECLARACIÓN DE LISTAS PARA LOS COMBO BOX
    String[] sexos = new String[]{"Desconocido", "Hombre", "Mujer"};
    String[] escolaridades = new String[]{"Ninguna","Primaria incompleta","Primaria completa","Secundaria incompleta",
        "Secundaria completa","Estudios técnicos con primaria","Preparatoria incompleta","Preparatoria completa",
        "Estudios técnicos con preparatoria","Licenciatura incompleta","Licenciatura completa","Postgrado"};
    String[] estados_civies = new String[]{"Soltero","Casado","Divorciado","Separado","Unión libre","Viudo"};
    String[] municipios = new String[]{"NINGUNO","001 Canatlán","002 Canelas" ,"003 Coneto de Comonfort","004 Cuencamé",
        "005 Durango","006 Gral. Simón Boívar","007 Gómez Palacio","008 Guadalupe Victoria","009 Guanaceví","010 Hidalgo",
        "011 Indé","012 Lerdo","012 Mapimi","013 Mapimí","014 Mezquital","015 Nazas","016 Nombre de dios","017 Ocampo",
        "018 El Oro","019 Otáez","020 Panuco de Coronado","021 Peñón Blanco","022 Poanas","023 Pueblo Nuevo","024 Rodeo",""
            + "025 San Bernando","026 San Dimas","027 San Juan Guadalupe","028 San Juan del Río","029 San Luis del Cordero",
            "030 San Pedro del Gallo","031 Santa Clara","032 Tamazula","033 Tepehuanes","034 Tamazula","035 Tepehuanes",
            "036 Tlahualilo", "037 Topia","038 Vicente Guerrero","039 Nuevo Ideal","040 Victoria Durango"};
    String[] clacificacion= new String[]{"Hoja de Convivencia,Hoja de Ingreso Arera medica","Hoja de ingreso trabajo social",
    "hoja de ingreso casa hogar","informe psicilogia","Liberación de custodia","ofico común","anexo psicologia","anexo trabajo social",
    "anexo medico","diagnostico inicial","fotografia","fotografia infantil","video","oficio recibido","sentencia","amparos","notificacion","otro"};
    String[] estados_documento= new String[]{"publico","privado"};
    //SE RELLENA CADA COMBO BOX CON SU ARRAY CORRESPONDIENTE
    combo_estado.getItems().addAll(estados_documento);
    combo_clacificacion.getItems().addAll(clacificacion);
    COMBO_MUNICIPIO_AGRESOR2.getItems().addAll(municipios);
    COMBO_MUNICIPIO_VICTIMA.getItems().addAll(municipios);
    COMBO_MUNICIPIO_DENUNCIANTE.getItems().addAll(municipios);
    COMBO_MUNICIPIO_CUSTODIA.getItems().addAll(municipios);
    combo_sexo_denunciante.getItems().addAll(sexos);
    combo_sexo_victima.getItems().addAll(sexos);
    combo_sexo_agresor.getItems().addAll(sexos);
    combo_sexo_tutela.getItems().addAll(sexos);        
    combo_estado_civil_agresor.getItems().addAll(estados_civies);
    combo_escolaridad_victima.getItems().addAll(escolaridades);
    combo_escolaridad_denunciante.getItems().addAll(escolaridades);
    combo_escolaridad_tutela.getItems().addAll(escolaridades);
    combo_escolaridad_agresor.getItems().addAll(escolaridades);
}   
    
}
