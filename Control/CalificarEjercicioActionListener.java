
package Control;

import Logico.Ejercicio;
import Logico.Progreso;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class CalificarEjercicioActionListener implements ActionListener {
    private JTextField[] cajaRespuestas;
    private Progreso progreso;
    private Ejercicio ejercicio;
    private JButton reintentar;
    
    public CalificarEjercicioActionListener(JTextField[] cajaRespuestas,
            Progreso progreso, Ejercicio ejercicio, JButton reintentar){
        this.cajaRespuestas=cajaRespuestas;
        this.progreso=progreso;
        this.ejercicio=ejercicio;
        this.reintentar=reintentar;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        int tamanio=cajaRespuestas.length,
            x=0;
        int[] respuestas = new int[tamanio];
        boolean[] aciertos = new boolean[tamanio];
        for(x=0; x<tamanio; x++){
            if(cajaRespuestas[x].getText().equals("")){
                JOptionPane.showMessageDialog(
                        null, "No se contesto todos los problemas", "Error", 1
                );
                return;
            }
            respuestas[x]=Integer.parseInt(cajaRespuestas[x].getText());
        }
        aciertos = ejercicio.calificar(respuestas, progreso);
        for(x=0; x<tamanio; x++){
            if(aciertos[x]){
                cajaRespuestas[x].setBackground(new Color(133, 196, 120));
            }
            else{
                cajaRespuestas[x].setBackground(new Color(255, 105, 97));
            }
        }
        reintentar.setVisible(true);
    }
    
}
