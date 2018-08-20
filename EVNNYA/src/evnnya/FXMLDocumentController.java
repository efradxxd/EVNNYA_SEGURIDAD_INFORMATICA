
package evnnya;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import conecciones.Conexion;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import procedimientos.Usuarios;

public class FXMLDocumentController implements Initializable {

    //SE INSTANCIA LA CLASE CONEXION
   public mysql_conecction con = new mysql_conecction();
    //variable de conexion
   public Connection cn = con.conexion();
    //encriptamiento
   public cls_encriptamiento objeto = new cls_encriptamiento();
    //se instancia el panel
    
    CoordinacionAsesoresJuridicosController forma = new CoordinacionAsesoresJuridicosController();
    
    @FXML
    private Button btnClose;

    @FXML
    private Button btnAceptar;

    @FXML
    private JFXPasswordField txtContrasena;

    @FXML
    private JFXTextField txtUsuario;

    @FXML
    public void LOGEO(){
        int validar =0;
        try{ 
           //CONSULTA A LA BASE DE DATOS
            String query = "SELECT * FROM users WHERE user_name='"+objeto.metodo_encriptamiento(txtUsuario.getText())
                    +"' AND password='"+objeto.metodo_encriptamiento(txtContrasena.getText())+"'";
            String datos[]= new String [3];
            //EL STATEMENT ABRE LA CONEXION A LA BASE
            Statement st = cn.createStatement();
            //EJECUTA EL QUERY
            ResultSet rs = st.executeQuery(query);
            
            while(rs.next()){
                datos[0]=rs.getString(1);
                System.out.println(" "+objeto.metodo_desencriptamiento(datos[0]));
                datos[1]=rs.getString(2);
                System.out.println(" "+objeto.metodo_desencriptamiento(datos[1]));
                datos[2]=rs.getString(3);
                System.out.println(" "+objeto.metodo_desencriptamiento(datos[2]));
                validar=validar+1;
            }
            //CIERRA CONEXION
            st.close();
        }
        catch(SQLException e){
            System.out.println(""+e.getMessage());
        }
        if(validar>0){
            //LLAMA AL FORMULARIO
            try {
                FXMLLoader nuevaVentana = new FXMLLoader(getClass().getResource("FXMLMR.fxml"));
                Parent padre = (Parent) nuevaVentana.load();
                Stage escenario = new Stage();
                escenario.setScene(new Scene(padre));
                escenario.setResizable(false);
                escenario.sizeToScene();
                escenario.show();
            }        
            catch (Exception e) {
                System.out.println(" Este es el error"+e.getMessage());
            }
            }
        else{
            //System.out.println("ACCESO  NO PERMITIDO"); 
        }
    }

    @FXML
    private void handleClose(ActionEvent event) {
        System.exit(1);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        System.out.println("INICIO");
    }

}
