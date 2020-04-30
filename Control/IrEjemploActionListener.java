
package Control;

import GUI.EjemploFrame;
import Logico.Ejemplo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class IrEjemploActionListener implements ActionListener {
    private Ejemplo ejemplo;
    
    public IrEjemploActionListener(Ejemplo ejemplo){
        this.ejemplo=ejemplo;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        EjemploFrame ejemplo = new EjemploFrame(this.ejemplo);
        ejemplo.setVisible(true);
    }
    
}
