
package Persistencia;

import Logico.Ninio;
import Logico.Progreso;
import Logico.Tutor;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class IngresoTutorConexionBD extends ConexionBD {
    
    public IngresoTutorConexionBD(){
        super();
    }
    
    public Tutor ingresarTutor(String correo, String contrasenia){
        int noNinios,
            i=0,
            j=0;
        String nombre,
               sentencia,
               nombreNinio,
               contraseniaNinio;
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
        Tutor tutor=null;
        Progreso[][] progresos;
        Ninio[] ninios;
        ResultSet rs,
                  rsAvance;
        sentencia="SELECT * FROM `tutor` WHERE email='"+correo+"' "
                + "and psw=sha2('"+contrasenia+"', 224);";
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
                progresos = new Progreso[noNinios][24];
                ninios = new Ninio[noNinios];
                sentencia="SELECT * FROM `infante` WHERE emailtutor='"
                    +correo+"';";
                rs=super.consultar(sentencia);
                for(i=0; i<noNinios; i++){
                    rs.next();
                    nombreNinio=rs.getString("usr");
                    contraseniaNinio=rs.getString("psw");
                    ninios[i] = new Ninio(
                            nombreNinio, correo, contraseniaNinio
                    );
                }
                for(i=0; i<noNinios; i++){
                    sentencia="SELECT * FROM `avance` WHERE UsrInfante='"
                            +ninios[i].getNombre()+"' ORDER BY `avance`."
                            + "`idContenido` ASC;";
                    rsAvance=super.consultar(sentencia);
                    for(j=0; j<24; j++){
                        rsAvance.next();
                        progresos[i][j] = new Progreso(
                                temas[j],
                                Integer.parseInt(
                                        rsAvance.getString("Calificación")
                                )
                        );
                    }
                    ninios[i].setProgresos(progresos[i]);
                }
                tutor = new Tutor(nombre, correo, contrasenia, ninios);
            }
        }
        catch(SQLException sqle){
            sqle.printStackTrace();
            JOptionPane.showMessageDialog(
                    null, "Sus datos son incorrectos","Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
        return tutor;
    }
    
}
