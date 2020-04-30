
package Control;

import GUI.Ejercicio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class IrEjercicioActionListener implements ActionListener {
    
    
    public IrEjercicioActionListener(){
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Ejercicio ejercicio = new Ejercicio();
        ejercicio.setVisible(true);
    }
    
}
