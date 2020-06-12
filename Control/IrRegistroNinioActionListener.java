
package Control;

import GUI.InformacionNinioPanel;
import GUI.RegistroNinio;
import Logico.Tutor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IrRegistroNinioActionListener implements ActionListener {
    private InformacionNinioPanel ventana;
    private Tutor tutor;
    
    public IrRegistroNinioActionListener(InformacionNinioPanel ventana,
            Tutor tutor){
        this.ventana=ventana;
        this.tutor=tutor;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        RegistroNinio registro = new RegistroNinio(ventana, tutor);
        registro.setVisible(true);
    }
    
}
