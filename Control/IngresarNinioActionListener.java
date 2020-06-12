
package Control;

import GUI.IngresoNinio;
import GUI.MenuNinio;
import Logico.Ninio;
import Persistencia.IngresoNinioConexionBD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class IngresarNinioActionListener implements ActionListener{
    private JFrame ventana;
    private JTextField nombre;
    private JPasswordField contrasenia;
    
    public IngresarNinioActionListener(JFrame ventana,
            JTextField nombre, JPasswordField contrasenia){
        this.ventana=ventana;
        this.nombre=nombre;
        this.contrasenia=contrasenia;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        IngresoNinioConexionBD ingreso;
        Ninio ninio;
        if(nombre.getText().equals("") || contrasenia.getText().equals("")){
            JOptionPane.showMessageDialog(
                    null, "Por favor llene todos los campos", "Error",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
        else{
            ingreso=new IngresoNinioConexionBD();
            ninio=ingreso.ingresarNinio(
                    nombre.getText(), contrasenia.getText()
            );
            if(ninio!=null){
                MenuNinio menu = new MenuNinio(ninio);
                menu.setVisible(true);
                ((IngresoNinio)ventana).destruir();
                ventana.dispose();
            }
        }
    }
    
}
