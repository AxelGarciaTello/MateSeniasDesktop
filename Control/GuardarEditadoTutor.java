
package Control;

import Logico.Tutor;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class GuardarEditadoTutor extends EditarTutorActionListener {
    private Tutor tutor;
    private JTextField nombre,
                       correo;
    private JPasswordField contrasenia,
                           nuevaContrasenia,
                           confirmacion;
    
    public GuardarEditadoTutor(Object[] paquete, JTextField[] editables,
            JTextField nombre, JTextField correo, JPasswordField contrasenia,
            JPasswordField nuevaContrasenia, JPasswordField confirmacion,
            Tutor tutor) {
        super(paquete, editables);
        this.tutor=tutor;
        this.nombre=nombre;
        this.correo=correo;
        this.contrasenia=contrasenia;
        this.nuevaContrasenia=nuevaContrasenia;
        this.confirmacion=confirmacion;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        boolean aprovado = tutor.compararContrasenia(contrasenia.getText());
        if(aprovado){
            if(!nuevaContrasenia.getText().equals(confirmacion.getText())){
                JOptionPane.showMessageDialog(null, "La nueva contraseña y su "
                        + "confirmación son diferentes.", "Error", 1);
            }
            else{
                tutor.setNombre(nombre.getText());
                tutor.setCorreo(correo.getText());
                if(!nuevaContrasenia.getText().equals("")){
                    tutor.setContrasenia(nuevaContrasenia.getText());
                }
                super.actionPerformed(ae);
            }
        }
        else{
            JOptionPane.showMessageDialog(
                    null, "La contraseña no concuerda.\nIngrese de nuevo la "
                            + "contraseña.", "Error", 1
            );
        }
    }
    
}
