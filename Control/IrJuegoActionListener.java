
package Control;

import GUI.JuegoFrame;
import Logico.Juego;
import Logico.Progreso;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class IrJuegoActionListener implements ActionListener {
    private Juego juego;
    private Progreso progreso;
    
    public IrJuegoActionListener(Juego juego, Progreso progreso){
        this.juego=juego;
        this.progreso=progreso;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        JuegoFrame juegoVentana = new JuegoFrame(juego, progreso);
        juegoVentana.setVisible(true);
    }
    
}
