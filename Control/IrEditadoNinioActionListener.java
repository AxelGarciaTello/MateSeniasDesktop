
package Control;

import GUI.EditadoNinio;
import GUI.InformacionNinioPanel;
import Logico.Tutor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JList;
import javax.swing.JOptionPane;


public class IrEditadoNinioActionListener implements ActionListener {
    private InformacionNinioPanel ventana;
    private Tutor tutor;
    private JList ninios;
    
    public IrEditadoNinioActionListener(
            InformacionNinioPanel ventana, Tutor tutor,
            JList ninios){
        this.ventana=ventana;
        this.tutor=tutor;
        this.ninios=ninios;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ninios.getSelectedIndex()!=-1){
            EditadoNinio editado = new EditadoNinio(
                    ventana, tutor, ninios
            );
            editado.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(
                    null, "No se selecciono ningun niño para modificar",
                    "Error", JOptionPane.INFORMATION_MESSAGE
            );
        }
    }
    
}
