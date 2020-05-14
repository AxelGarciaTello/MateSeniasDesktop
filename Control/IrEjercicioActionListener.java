
package Control;


import GUI.EjercicioFrame;
import Logico.Ejercicio;
import Logico.Ninio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class IrEjercicioActionListener implements ActionListener {
    private Ejercicio ejercicio;
    private Ninio ninio;
    private int progreso;
    
    
    public IrEjercicioActionListener(Ejercicio ejercicio, Ninio ninio,
            int progreso){
        this.ejercicio=ejercicio;
        this.ninio=ninio;
        this.progreso=progreso;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        EjercicioFrame ejercicioFrame = new EjercicioFrame(
                ejercicio, ninio, progreso
        );
        ejercicioFrame.setVisible(true);
    }
    
}
