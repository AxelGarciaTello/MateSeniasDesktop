
package Control;


import GUI.EjercicioFrame;
import Logico.Ejercicio;
import Logico.Progreso;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class IrEjercicioActionListener implements ActionListener {
    private Ejercicio ejercicio;
    private Progreso progreso;
    
    
    public IrEjercicioActionListener(Ejercicio ejercicio, Progreso progreso){
        this.ejercicio=ejercicio;
        this.progreso=progreso;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        EjercicioFrame ejercicioFrame = new EjercicioFrame(ejercicio, progreso);
        ejercicioFrame.setVisible(true);
    }
    
}
