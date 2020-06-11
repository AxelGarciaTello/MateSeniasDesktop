
package Control;

import GUI.MenuTutor;
import GUI.RegistroFrame;
import Logico.Tutor;
import Persistencia.ConexionBD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class RegistrarTutorActionListener implements ActionListener {
    private JFrame ventana;
    private JTextField nombre,
                       correo;
    private JPasswordField contrasenia,
                           confirmacion;
    
    public RegistrarTutorActionListener(JFrame ventana, JTextField nombre,
            JTextField correo, JPasswordField contrasenia,
            JPasswordField confirmacion){
        this.ventana=ventana;
        this.nombre=nombre;
        this.correo=correo;
        this.contrasenia=contrasenia;
        this.confirmacion=confirmacion;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String sentencia;
        boolean respuesta;
        ConexionBD bd;
        Tutor tutor;
        MenuTutor menu;
        if(nombre.getText().equals("") ||
                correo.getText().equals("") ||
                contrasenia.getText().equals("")){
            JOptionPane.showMessageDialog(
                    null, "Por favor llene todos los campos", "Campos vacíos", 1
            );
        }
        else if(contrasenia.getText().length()<6){
            JOptionPane.showMessageDialog(
                    null, "La contraseña es muy pequeña", "Contraseña", 1
            );
        }
        else if(!contrasenia.getText().equals(confirmacion.getText())){
            JOptionPane.showMessageDialog(
                    null, "Las contraseñas no coinciden", "Contraseña",1
            );
        }
        else{
            bd = new ConexionBD();
            sentencia="INSERT INTO `tutor` (`usr`, `email`, `psw`) VALUES ('"+
                    nombre.getText()+"', '"+correo.getText()+"', '"+
                    contrasenia.getText()+"');";
            respuesta = bd.administrar(sentencia);
            if(respuesta){
                JOptionPane.showMessageDialog(
                        null, "Usuario creado con exito", "¡Felicidades!", 0
                );
                tutor = new Tutor(
                        nombre.getText(), correo.getText(),
                        contrasenia.getText(), null
                );
                menu = new MenuTutor(tutor);
                menu.setVisible(true);
                ((RegistroFrame)ventana).destruir();
                ventana.dispose();
            }
            else{
                JOptionPane.showMessageDialog(
                        null, "No se pudo crear el usuario\nVerifique que el "
                                + "correo no haya sido registrado previamente",
                        "Error", 1
                );
            }
        }
    }
    
}
