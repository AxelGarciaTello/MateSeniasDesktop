
package Control;

import GUI.EjemploFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class IrEjemploActionListener implements ActionListener {
    private String titulo,
                   signo;
    
    public IrEjemploActionListener(String titulo, String signo){
        this.titulo=titulo;
        this.signo=signo;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        EjemploFrame ejemplo = new EjemploFrame(titulo, signo);
        ejemplo.setVisible(true);
    }
    
}
