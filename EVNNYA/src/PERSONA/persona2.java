package PERSONA;

/**
 *
 * @author efralerma
 */
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
public class persona2 {
    public SimpleStringProperty nombre = new SimpleStringProperty();
    public SimpleStringProperty apellido_paterno = new SimpleStringProperty();
    public SimpleStringProperty apellido_materno = new SimpleStringProperty();
    public SimpleStringProperty sexo = new SimpleStringProperty();
    public SimpleIntegerProperty edad = new SimpleIntegerProperty();
    public SimpleStringProperty escolaridad = new SimpleStringProperty();
    public SimpleStringProperty telefono_fijo = new SimpleStringProperty();
    public SimpleStringProperty telefono_movil = new SimpleStringProperty();
    public SimpleStringProperty email = new SimpleStringProperty();
    public SimpleStringProperty municipio = new SimpleStringProperty();
    public SimpleStringProperty calle = new SimpleStringProperty();
    public SimpleStringProperty colonia = new SimpleStringProperty();
    public SimpleStringProperty numero = new SimpleStringProperty();
    public SimpleIntegerProperty cp = new SimpleIntegerProperty();
    public SimpleStringProperty ragresor = new SimpleStringProperty();
    public SimpleStringProperty estado_civil = new SimpleStringProperty();
    public SimpleStringProperty ocupacion = new SimpleStringProperty();
    public SimpleStringProperty lugar_trabajo = new SimpleStringProperty();
        
    public String getNombre(){
        return nombre.get();
    }
    public String getEstadocivil(){
        return estado_civil.get();
    }
    
    public String getLugartrabajo(){
        return lugar_trabajo.get();
    }
    
    public String getApellido_paterno(){
        return apellido_paterno.get();
    }
    public String getApellido_materno(){
        return apellido_materno.get();
    }
    public Integer getEdad (){
        return edad.get();
    }
    public String getOcupacion (){
        return ocupacion.get();
    }
     public String getSexo(){
        return sexo.get();
    }
    
     public String getEscolaridad(){
        return escolaridad.get();
    }
     
    public String getTelefono_fijo(){
        return telefono_fijo.get();
    }
    
    public String getTelefono_movil(){
        return telefono_movil.get();
    }
    
    public String getMunicipio(){
        return municipio.get();
    }
    
    public String getCalle(){
        return calle.get();
    }
    
    public String getColonia(){
        return colonia.get();
    }
    
    public String getNumero(){
        return numero.get();
    }
    
    public Integer getCp(){
        return cp.get();
    }
    
    public String getEmail(){
        return email.get();
    }
    public String getRagresor(){
        return ragresor.get();
    }
}
