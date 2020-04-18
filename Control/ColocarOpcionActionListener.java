
package Control;

import GUI.OpcionesFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


public class ColocarOpcionActionListener implements ActionListener {
    private JButton boton;
    private String texto;
    private OpcionesFrame ventana;
    
    public ColocarOpcionActionListener(JButton boton, String texto,
            OpcionesFrame ventana){
        this.boton=boton;
        this.texto=texto;
        this.ventana=ventana;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        boton.setText(texto);
        ventana.destruir();
        ventana.dispose();
    }
    
}
