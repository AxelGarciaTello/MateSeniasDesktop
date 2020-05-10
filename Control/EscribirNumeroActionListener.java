
package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;


public class EscribirNumeroActionListener implements ActionListener {
    private String texto;
    private JTextField lugar;
    
    public EscribirNumeroActionListener(String texto, JTextField lugar){
        this.texto=texto;
        this.lugar=lugar;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String mensaje = lugar.getText();
        mensaje+=texto;
        lugar.setText(mensaje);
    }
    
}
