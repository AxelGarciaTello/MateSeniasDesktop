
package Control;

import GUI.OpcionesFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;


public class ColocarOpcionActionListener implements ActionListener {
    private JButton boton;
    private Object texto;
    private OpcionesFrame ventana;
    
    public ColocarOpcionActionListener(JButton boton, Object texto,
            OpcionesFrame ventana){
        this.boton=boton;
        this.texto=texto;
        this.ventana=ventana;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String mensaje="";
        if(texto instanceof JButton){
            mensaje=((JButton)texto).getText();
        }
        else if(texto instanceof JTextField){
            mensaje=((JTextField)texto).getText();
        }
        boton.setText(mensaje);
        ventana.destruir();
        ventana.dispose();
    }
    
}
