
package Control;

import GUI.IngresoNinio;
import GUI.MenuNinio;
import Logico.Ninio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;



public class IngresarNinioActionListener implements ActionListener{
    private JFrame ventana;
    
    public IngresarNinioActionListener(JFrame ventana){
        this.ventana=ventana;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        MenuNinio menu = new MenuNinio(new Ninio("Axel"));
        menu.setVisible(true);
        if(ventana instanceof IngresoNinio){
            ((IngresoNinio)ventana).destruir();
        }
        ventana.dispose();
    }
    
}
