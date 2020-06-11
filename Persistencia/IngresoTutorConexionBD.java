
package Persistencia;

import Logico.Ninio;
import Logico.Tutor;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class IngresoTutorConexionBD extends ConexionBD {
    
    public IngresoTutorConexionBD(){
        super();
    }
    
    public Tutor ingresarTutor(String correo, String contrasenia){
        int noNinios;
        String nombre, sentencia;
        Tutor tutor=null;
        Ninio[] ninios;
        ResultSet rs;
        sentencia="SELECT * FROM `tutor` WHERE email='"+correo+"' "
                + "and psw='"+contrasenia+"';";
        rs=super.consultar(sentencia);
        try{
            rs.next();
            nombre=rs.getString("usr");
            sentencia="SELECT count(*) FROM infante WHERE emailtutor='"
                    +correo+"';";
            rs=super.consultar(sentencia);
            rs.next();
            noNinios=Integer.parseInt(rs.getString("count(*)"));
            if(noNinios==0){
                tutor = new Tutor(nombre, correo, contrasenia, null);
            }
            else{
                /*ninios = new Ninio[noNinios];
                sentencia="SELECT * FROM `infante` WHERE emailtutor='"
                    +correo+"';";
                rs=super.consultar(sentencia);
                rs.next();
                while(!rs.isLast()){
                    
                }*/
            }
        }
        catch(SQLException sqle){
            sqle.printStackTrace();
            JOptionPane.showMessageDialog(
                    null, "Sus datos son incorrectos","Error",2
            );
        }
        return tutor;
    }
    
}
