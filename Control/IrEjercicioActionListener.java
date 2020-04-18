
package Control;

import GUI.Ejercicio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class IrEjercicioActionListener implements ActionListener {
    private String titulo,
                   simbolo;
    
    public IrEjercicioActionListener(String titulo, String simbolo){
        this.titulo=titulo;
        this.simbolo=simbolo;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Ejercicio ejercicio = new Ejercicio(titulo, simbolo);
        ejercicio.setVisible(true);
    }
    
}
