
package evnnya;

import java.sql.*;
public class mysql_conecction {
    Connection cn;
    
    public Connection conexion(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        cn = DriverManager.getConnection("jdbc:mysql://localhost/usuarios","root",
                "Supergato98%");    
            System.out.println("si se armo la conexion prro :v");
        }
        catch(Exception e){
            
            System.out.println(" tuviste un error puto :v "+e.getMessage());
        }
        return cn;   
    }
    
    Statement createStatement(){
        throw new UnsupportedOperationException("No soportado prro :v");
    }
}
