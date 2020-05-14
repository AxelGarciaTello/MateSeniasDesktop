
package Control;

import Logico.Tutor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class EliminarTutorActionListener implements ActionListener {
    private Tutor tutor;
    
    public EliminarTutorActionListener(Tutor tutor){
        this.tutor=tutor;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        int opcion=JOptionPane.showConfirmDialog(
                null, "Esta seguro que quiere eliminar su "
                        + "cuenta", "Eliminar", 0, 2
        );
        if(opcion==0){
            tutor.destruir();
            System.exit(0);
        }
    }
    
}
