
package Control;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;


public class SeleccionarMenuNinioActionListener implements ActionListener {
    private JPanel menu;
    private CardLayout cl;
    private int seleccion;
    
    public SeleccionarMenuNinioActionListener(JPanel menu, int seleccion){
        cl=(CardLayout) menu.getLayout();
        this.menu=menu;
        this.seleccion=seleccion;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        switch(seleccion){
            case 1:
                cl.show(menu, "video");
            break;
            case 2:
                cl.show(menu, "ejemplo");
            break;
            case 3:
                cl.show(menu, "ejercicio");
            break;
            case 4:
                cl.show(menu, "juego");
            break;
            case 5:
                System.exit(0);
            break;
        }
    }
    
}
