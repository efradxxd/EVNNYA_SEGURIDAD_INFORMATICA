package evnnya;

/**
 *
 * @author efralerma
 */
import com.jfoenix.controls.JFXTextField;
import java.util.Calendar;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Herramientas {
    Herramientas(){
        
    }
    
    
    public static String getHoraActual() {
    Date hoy = new Date();
    SimpleDateFormat formateador = new SimpleDateFormat("hh:mm:ss");
    return formateador.format(hoy);
    }
    
    
    public String obtenerFechaSistema()
    {
        Calendar fechaSistema= Calendar.getInstance();
        return fechaSistema.get(Calendar.DAY_OF_MONTH) + "/" + (fechaSistema.get(Calendar.MONTH)+1) + "/" + fechaSistema.get(Calendar.YEAR);
    }
    public String obtenerElString(String cadena)
    {
        int posicion[] = new int [2]; 
        //Guarda las posiciones de lo que esta entre comillas
        for (int i = 0, j = 0; i < cadena.length(); i++)
            if (cadena.charAt(i) == '\'') {
                posicion[j] = i;
                j++;
            }
        return cadena.substring(posicion[0]+1, posicion[1]);
    }
    
    public boolean convertirIntToBoolean(int convertir){
            return (convertir == 1);
        }
    public JFXTextField validar(JFXTextField variable){
            variable.setOnKeyTyped(new EventHandler<KeyEvent>(){
            @Override
            public void handle(KeyEvent event) {
                char car = event.getCharacter().charAt(0);
                if (Character.isLetter(car)) {
                    event.consume();
                }
            }
            
        });
            return variable;
        }
}

