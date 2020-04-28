
package Control;

import GUI.EjemploFrame;
import GUI.Ejercicio;
import GUI.JuegoFrame;
import GUI.SistemaNumericoFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class CerrarVentanaActionListener implements ActionListener {
    private JFrame ventana;
    
    public CerrarVentanaActionListener(JFrame ventana){
        this.ventana=ventana;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ventana instanceof EjemploFrame){
            ((EjemploFrame)ventana).destruir();
        }
        else if(ventana instanceof Ejercicio){
            ((Ejercicio)ventana).destruir();
        }
        else if(ventana instanceof JuegoFrame){
            ((JuegoFrame)ventana).destruir();
        }
        else if(ventana instanceof SistemaNumericoFrame){
            ((SistemaNumericoFrame)ventana).destruir();
        }
        ventana.dispose();
    }
    
    
}
