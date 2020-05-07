
package Control;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;


public class ReintentarEjercicioActionListener implements ActionListener {
    private JTextField[] respuestas;
    private JButton reintentar;
    
    public ReintentarEjercicioActionListener(JTextField[] respuestas,
            JButton reintentar){
        this.respuestas=respuestas;
        this.reintentar=reintentar;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        int tamanio=respuestas.length,
            x=0;
        for(x=0; x<tamanio; x++){
            respuestas[x].setText("");
            respuestas[x].setBackground(new Color(255, 255, 255));
        }
        reintentar.setVisible(false);
    }
    
}
