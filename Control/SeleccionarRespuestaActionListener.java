
package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;


public class SeleccionarRespuestaActionListener implements ActionListener {
    private String texto;
    private JTextField respuesta;
    
    public SeleccionarRespuestaActionListener(String texto,
            JTextField respuesta){
        this.texto=texto;
        this.respuesta=respuesta;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        respuesta.setText(texto);
    }
    
}
