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

public class DOCUMENTOS {
    SimpleStringProperty ruta = new SimpleStringProperty();
    SimpleIntegerProperty estado = new SimpleIntegerProperty();
    SimpleStringProperty comentario = new SimpleStringProperty();
    SimpleStringProperty clasificacion = new SimpleStringProperty();
    SimpleStringProperty titulo = new SimpleStringProperty();
    
    public String getRuta(){
        return ruta.get();
    }
    
    public Integer getEstado(){
        return estado.get();
    }
    
    public String getComentario(){
        return comentario.get();
    }
    
    public String getClasificacion(){
        return clasificacion.get();
    }
    
    public String getTitulo(){
        return titulo.get();
    }
    
}
