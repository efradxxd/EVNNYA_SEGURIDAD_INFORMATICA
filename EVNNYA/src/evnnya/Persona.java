/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evnnya;

/**
 *
 * @author efralerma
 */

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;


public class Persona {
    
    public SimpleStringProperty ruta = new SimpleStringProperty();
    public SimpleStringProperty titulo = new SimpleStringProperty();
    public SimpleIntegerProperty estado = new SimpleIntegerProperty();
    public SimpleStringProperty clasificacion = new SimpleStringProperty();
    public SimpleStringProperty comentario = new SimpleStringProperty();
    
    
    public String getRuta(){
        return ruta.get();
    }
    public String getTitulo(){
        return titulo.get();
    }
    
    public String getClasificacion(){
        return clasificacion.get();
    }
    
    public Integer getEstado (){
        return estado.get();
    }
    
    public String getComentarioo(){
        return comentario.get();
    }
    
}
