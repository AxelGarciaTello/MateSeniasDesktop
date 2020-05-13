
package Control;

import GUI.IngresoTutor;
import GUI.MenuTutor;
import GUI.RegistroFrame;
import Logico.Tutor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;


public class IngresarTutorActionListener implements ActionListener {
    private JFrame ventana;
    
    public IngresarTutorActionListener(JFrame ventana){
        this.ventana=ventana;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        MenuTutor menu = new MenuTutor(new Tutor("Axel","a","a",null));
        menu.setVisible(true);
        if(ventana instanceof IngresoTutor){
            ((IngresoTutor)ventana).destruir();
        }
        else if(ventana instanceof RegistroFrame){
            ((RegistroFrame)ventana).destruir();
        }
        ventana.dispose();
    }
    
}
