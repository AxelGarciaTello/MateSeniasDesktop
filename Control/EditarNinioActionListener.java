
package Control;

import GUI.EditadoNinio;
import GUI.InformacionNinioPanel;
import Logico.Tutor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class EditarNinioActionListener implements ActionListener {
    private InformacionNinioPanel ventana;
    private EditadoNinio principal;
    private JList opciones;
    private Tutor tutor;
    private JTextField nombre,
                       correo;
    private JPasswordField contrasenia,
                           confirmacion;
    
    public EditarNinioActionListener(
            InformacionNinioPanel ventana,
            EditadoNinio principal, JList opciones,
            Tutor tutor, JTextField nombre, JTextField correo,
            JPasswordField contrasenia,
            JPasswordField confirmacion){
        this.ventana=ventana;
        this.principal=principal;
        this.opciones=opciones;
        this.tutor=tutor;
        this.nombre=nombre;
        this.correo=correo;
        this.contrasenia=contrasenia;
        this.confirmacion=confirmacion;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        int opcion=0;
        if(nombre.getText().equals("") && contrasenia.getText().equals("")){
            JOptionPane.showMessageDialog(
                    null, "Parece que no agrego ningun dato para modificar",
                    "Modificación", JOptionPane.INFORMATION_MESSAGE
            );
        }
        else if(!contrasenia.getText().equals(confirmacion.getText())){
            JOptionPane.showMessageDialog(
                    null, "Parece que las contraseñas no coinciden", "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
        else{
            opcion=opciones.getSelectedIndex();
            if(!nombre.getText().equals("")){
                tutor.getNinios(opcion).setNombre(nombre.getText());
            }
            if(!contrasenia.getText().equals("")){
                tutor.getNinios(opcion).setContrasenia(contrasenia.getText());
            }
            ventana.actualizar();
            principal.destruir();
            principal.dispose();
        }
    }
    
}
