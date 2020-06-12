
package Control;

import Logico.Tutor;
import Persistencia.ConexionBD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;


public class EliminarTutorActionListener implements ActionListener {
    private Tutor tutor;
    
    public EliminarTutorActionListener(Tutor tutor){
        this.tutor=tutor;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String sentencia="DELETE FROM `tutor` WHERE `tutor`.`email` = '"
                +tutor.getCorreo()+"';";
        boolean confirmacion;
        JPasswordField contrasenia = new JPasswordField();
        ConexionBD bd;
        int opcion=JOptionPane.showConfirmDialog(
                null, "Esta seguro que quiere eliminar su "
                        + "cuenta", "Eliminar", 0, JOptionPane.QUESTION_MESSAGE
        );
        if(opcion==0){
            JOptionPane.showConfirmDialog(
                    null, contrasenia, "Ingrese su contraseña para confirmar",
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE
            );
            if(tutor.compararContrasenia(contrasenia.getText())){
                bd = new ConexionBD();
                confirmacion = bd.administrar(sentencia);
                if(confirmacion){
                    tutor.destruir();
                    System.exit(0);
                }
                else{
                    JOptionPane.showMessageDialog(
                            null, "No se pudo eliminar la cuenta", "Error",
                            JOptionPane.ERROR_MESSAGE
                    );
                }
            }
            else{
                JOptionPane.showMessageDialog(
                        null, "Contraseña incorrecta", "Error",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        }
    }
    
}
