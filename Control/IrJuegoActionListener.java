
package Control;

import GUI.JuegoFrame;
import Logico.Juego;
import Logico.Ninio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class IrJuegoActionListener implements ActionListener {
    private Juego juego;
    private Ninio ninio;
    private int progreso;
    
    public IrJuegoActionListener(Juego juego, Ninio ninio, int progreso){
        this.juego=juego;
        this.ninio=ninio;
        this.progreso=progreso;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        JuegoFrame juegoVentana = new JuegoFrame(juego, ninio, progreso);
        juegoVentana.setVisible(true);
    }
    
}
