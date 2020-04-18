
package Control;

import GUI.JuegoFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class IrJuegoActionListener implements ActionListener {
    private String titulo;
    
    public IrJuegoActionListener(String titulo){
        this.titulo=titulo;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        JuegoFrame juego = new JuegoFrame(titulo);
        juego.setVisible(true);
    }
    
}
