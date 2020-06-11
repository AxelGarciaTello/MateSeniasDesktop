
package Control;

import GUI.IngresoTutor;
import GUI.MenuTutor;
import Logico.Tutor;
import Persistencia.IngresoTutorConexionBD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class IngresarTutorActionListener implements ActionListener {
    private JFrame ventana;
    private JTextField correo;
    private JPasswordField contrasenia;
    
    public IngresarTutorActionListener(JFrame ventana, JTextField correo,
            JPasswordField contrasenia){
        this.ventana=ventana;
        this.correo=correo;
        this.contrasenia=contrasenia;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Tutor tutor;
        IngresoTutorConexionBD ingreso;
        if(correo.getText().equals("") || contrasenia.getText().equals("")){
            JOptionPane.showMessageDialog(
                    null, "Por favor ingrese todos los datos", 
                    "Datos incompletos", 2
            );
        }
        else{
            ingreso = new IngresoTutorConexionBD();
            tutor=ingreso.ingresarTutor(
                    correo.getText(), contrasenia.getText()
            );
            if(tutor!=null){
                MenuTutor menu = new MenuTutor(tutor);
                menu.setVisible(true);
                ((IngresoTutor)ventana).destruir();
                ventana.dispose();
            }
        }
    }
    
}
