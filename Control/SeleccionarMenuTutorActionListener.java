
package Control;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;


public class SeleccionarMenuTutorActionListener implements ActionListener {
    private JPanel menu;
    private CardLayout cl;
    private int seleccion;
    
    public SeleccionarMenuTutorActionListener(JPanel menu, int seleccion){
        cl=(CardLayout) menu.getLayout();
        this.menu=menu;
        this.seleccion=seleccion;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        switch(seleccion){
            case 1:
                cl.show(menu, "informacion");
            break;
        }
    }
    
}
