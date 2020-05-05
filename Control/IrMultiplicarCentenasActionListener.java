
package Control;

import GUI.MultiplicarCentenasFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class IrMultiplicarCentenasActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ae) {
        MultiplicarCentenasFrame multiplicar = new MultiplicarCentenasFrame();
        multiplicar.setVisible(true);
    }
    
}
