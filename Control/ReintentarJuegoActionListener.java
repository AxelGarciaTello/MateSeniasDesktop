
package Control;

import Logico.Juego;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


public class ReintentarJuegoActionListener implements ActionListener {
    private JButton[] crucigrama;
    private Juego juego;
    private JButton reintentar;
    
    public ReintentarJuegoActionListener(JButton[] crucigrama, Juego juego,
            JButton reintentar){
        this.crucigrama=crucigrama;
        this.juego=juego;
        this.reintentar=reintentar;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        int tamanio=crucigrama.length,
            x=0;
        for(x=0; x<tamanio; x++){
            if(juego.getSimbolo(x, 1).equals("S")){
                crucigrama[x].setText(juego.getSimbolo(x, 0));
            }
            else{
                crucigrama[x].setText("");
            }
            crucigrama[x].setBackground(new Color(47, 55, 74));
        }
        reintentar.setVisible(false);
    }
    
}
