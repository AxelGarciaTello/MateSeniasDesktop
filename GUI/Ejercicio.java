
package GUI;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Ejercicio extends EjemploFrame {
    private JButton[] respuestas;
    private JButton calificar;
    
    public Ejercicio(String titulo, String simbolo) {
        super(titulo, simbolo);
        initComponents();
    }
    
    private void initComponents(){
        int a=0,
            b=0,
            x=60,
            y=200;
        respuestas = new JButton[18];
        for(a=0; a<18; a++){
            respuestas[a] = new JButton("000");
            respuestas[a].setSize(60, 25);
            respuestas[a].setLocation(x, y);
            y+=30;
            b++;
            if(b==3){
                y=200;
                x+=85;
                b=0;
            }
            super.contenedor.add(respuestas[a]);
        }
        calificar = new JButton();
        calificar.setSize(50, 50);
        calificar.setIcon(
                new ImageIcon(
                        getClass().getResource("Iconos/Atras.png")
                )
        );
        calificar.setLocation(540, 10);
        contenedor.add(calificar);
    }
    
}
