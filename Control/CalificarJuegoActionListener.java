
package Control;

import Logico.Juego;
import Logico.Progreso;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class CalificarJuegoActionListener implements ActionListener {
    private JButton[] crucigrama;
    private Juego juego;
    private Progreso progreso;
    private JButton reintentar;
    
    public CalificarJuegoActionListener(JButton[] crucigrama,
            Juego juego, Progreso progreso, JButton reintentar){
        this.crucigrama=crucigrama;
        this.juego=juego;
        this.progreso=progreso;
        this.reintentar=reintentar;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        int tamanio=crucigrama.length,
            x=0;
        String[] respuestas = new String[tamanio];
        boolean[] aciertos = new boolean[tamanio];
        for(x=0; x<tamanio; x++){
            if(crucigrama[x].getText().equals("")){
                JOptionPane.showMessageDialog(
                        null, "No se contesto todas las "
                                + "casillas", "Error", 1
                );
                return;
            }
            respuestas[x]=crucigrama[x].getText();
        }
        aciertos=juego.calificar(respuestas, progreso);
        for(x=0; x<tamanio; x++){
            if(aciertos[x]){
                crucigrama[x].setBackground(
                        new Color(133, 196, 120)
                );
            }
            else{
                crucigrama[x].setBackground(
                        new Color(255, 105, 97)
                );
            }
        }
        reintentar.setVisible(true);
    }
    
}
