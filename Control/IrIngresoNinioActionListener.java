
package Control;

import GUI.IngresoNinio;
import GUI.IngresoTutor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;


public class IrIngresoNinioActionListener implements ActionListener {
    private JFrame ventana;
    
    public IrIngresoNinioActionListener(JFrame ventana){
        this.ventana=ventana;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        IngresoNinio ninio = new IngresoNinio();
        ninio.setVisible(true);
        if(ventana instanceof IngresoTutor){
            ((IngresoTutor)ventana).destruir();
        }
        ventana.dispose();
    }
    
}
