
package GUI;

import Control.CerrarVentanaActionListener;
import Logico.Ejemplo;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Ejercicio extends EjemploFrame {
    private JButton[] respuestas;
    private JButton calificar;
    private JButton reintentar;
    
    public Ejercicio() {
        super(new Ejemplo());
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
            respuestas[a].setBackground(new Color(47, 55, 74));
            respuestas[a].setForeground(new Color(255, 255, 255));
            respuestas[a].setBorder(null);
            super.contenedor.add(respuestas[a]);
        }
        calificar = new JButton();
        calificar.setSize(50, 50);
        calificar.setIcon(
                new ImageIcon(
                        getClass().getResource("Iconos/Calificar.png")
                )
        );
        calificar.setLocation(540, 10);
        calificar.setBackground(new Color(56, 87, 35));
        calificar.setBorder(null);
        contenedor.add(calificar);
        reintentar = new JButton("Intentarlo otra vez");
        reintentar.setLocation(175, 300);
        reintentar.setSize(250,30);
        reintentar.setVisible(false);
        contenedor.add(reintentar);
        super.atras.addActionListener(
                new CerrarVentanaActionListener(this)
        );
    }
    
    @Override
    public void destruir(){
        int tamanio=0,
            x=0;
        super.destruir();
        if(respuestas!=null){
            tamanio=respuestas.length;
            for(x=0; x<tamanio; x++){
                if(respuestas[x]!=null){
                    respuestas[x]=null;
                }
            }
        }
        if(calificar!=null){
            calificar=null;
        }
        if(reintentar!=null){
            reintentar=null;
        }
    }
    
}