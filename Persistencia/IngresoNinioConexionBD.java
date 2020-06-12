
package Persistencia;

import Logico.Ninio;
import Logico.Progreso;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class IngresoNinioConexionBD extends ConexionBD {
    
    public IngresoNinioConexionBD(){
        super();
    }
    
    public Ninio ingresarNinio(String nombre, String contrasenia){
        int i=0;
        String sentencia,
               correo;
        String[] temas={"Suma con Unidades",
                        "Suma con Decenas",
                        "Suma con Centenas",
                        "Resta con Unidades",
                        "Resta con Decenas",
                        "Resta con Centenas",
                        "Multiplicación con Unidades",
                        "Multiplicación con Decenas",
                        "Multilicación con Centenas",
                        "Divición con Unidades",
                        "División con Decenas",
                        "División con Centenas",
                        "Crucigrama sumas",
                        "Crucigrama restas",
                        "Crucigrama sumas y restas",
                        "Crucigrama sumas y restas 2",
                        "Crucigrama multiplicaciones",
                        "Crucigrama divisiones",
                        "Crucigrama multiplicaciones y divisiones",
                        "Crucigrama multiplicaciones y divisiones 2",
                        "Crucigrama operadores",
                        "Crucigrama operadores 2",
                        "Crucigrama operadores 3",
                        "Crucigrama operadores 4"
        };
        Ninio ninio=null;
        Progreso[] progresos;
        ResultSet rs;
        sentencia="SELECT * FROM `infante` WHERE usr='"+nombre+"' "
                + "AND psw=sha2('"+contrasenia+"', 224);";
        rs=super.consultar(sentencia);
        try{
            rs.next();
            correo=rs.getString("emailtutor");
            progresos = new Progreso[24];
            sentencia="SELECT * FROM `avance` WHERE UsrInfante='"
                    +nombre+"' ORDER BY `avance`."
                    + "`idContenido` ASC;";
            rs=super.consultar(sentencia);
            for(i=0; i<24; i++){
                rs.next();
                progresos[i] = new Progreso(
                        temas[i], Integer.parseInt(rs.getString("Calificación"))
                );
            }
            ninio = new Ninio(nombre, correo, contrasenia, progresos);
        }
        catch(SQLException sqle){
            sqle.printStackTrace();
            JOptionPane.showMessageDialog(
                    null, "Sus datos son incorrectos","Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
        return ninio;
    }
    
}
