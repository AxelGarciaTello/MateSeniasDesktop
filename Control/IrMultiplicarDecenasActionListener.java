
package Control;

import GUI.MultiplicarDecenasFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class IrMultiplicarDecenasActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ae) {
        MultiplicarDecenasFrame multiplicar = new MultiplicarDecenasFrame();
        multiplicar.setVisible(true);
    }
    
}
