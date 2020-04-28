
package Control;

import GUI.SistemaNumericoFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AbrirSistemaNumericoActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ae) {
        SistemaNumericoFrame sistemaNumerico = new SistemaNumericoFrame();
        sistemaNumerico.setVisible(true);
    }
    
}
