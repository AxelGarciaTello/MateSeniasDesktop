
package Control;

import Logico.Juego;
import Logico.Ninio;
import Logico.Progreso;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class CalificarJuegoActionListener implements ActionListener {
    private JButton[] crucigrama;
    private Juego juego;
    private Ninio ninio;
    private JButton reintentar;
    private int progreso;
    
    public CalificarJuegoActionListener(JButton[] crucigrama,
            Juego juego, Ninio ninio, JButton reintentar, int progreso){
        this.crucigrama=crucigrama;
        this.juego=juego;
        this.ninio=ninio;
        this.reintentar=reintentar;
        this.progreso=progreso;
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
        aciertos=juego.calificar(respuestas, ninio.getProgreso(progreso));
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
