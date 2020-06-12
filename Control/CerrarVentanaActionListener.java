
package Control;

import GUI.EditadoNinio;
import GUI.EjemploFrame;
import GUI.EjercicioFrame;
import GUI.JuegoFrame;
import GUI.MultiplicarCentenasFrame;
import GUI.MultiplicarDecenasFrame;
import GUI.RegistroNinio;
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
        else if(ventana instanceof EjercicioFrame){
            ((EjercicioFrame)ventana).destruir();
        }
        else if(ventana instanceof JuegoFrame){
            ((JuegoFrame)ventana).destruir();
        }
        else if(ventana instanceof SistemaNumericoFrame){
            ((SistemaNumericoFrame)ventana).destruir();
        }
        else if(ventana instanceof MultiplicarDecenasFrame){
            ((MultiplicarDecenasFrame)ventana).destruir();
        }
        else if(ventana instanceof MultiplicarCentenasFrame){
            ((MultiplicarCentenasFrame)ventana).destruir();
        }
        else if(ventana instanceof RegistroNinio){
            ((RegistroNinio)ventana).destruir();
        }
        else if(ventana instanceof EditadoNinio){
            ((EditadoNinio)ventana).destruir();
        }
        ventana.dispose();
    }
    
    
}
