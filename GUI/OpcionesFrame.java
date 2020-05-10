
package GUI;

import Control.ColocarOpcionActionListener;
import Control.EscribirNumeroActionListener;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class OpcionesFrame extends JFrame {
    private JButton proveniente;
    private JButton[] opciones;
    private JTextField dato;
    private JButton aceptar;
    private Container contenedor;
    
    public OpcionesFrame(int x, int y, JButton proveniente){
        this.proveniente=proveniente;
        initComponents(x, y);
    }
    
    private void initComponents(int x, int y){
        int a;
        this.setSize(170,380);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocation(x ,y);
        this.setIconImage(
                new ImageIcon(
                        getClass().getResource("Iconos/Icono.png")
                ).getImage()
        );
        this.setUndecorated(true);
        contenedor=this.getContentPane();
        contenedor.setBackground(new Color(56, 87, 35));
        contenedor.setLayout(null);
        dato = new JTextField();
        dato.setSize(100, 45);
        dato.setLocation(10, 10);
        dato.setEditable(false);
        dato.setFont(new Font("Ubuntu", 0, 20));
        contenedor.add(dato);
        aceptar = new JButton("ok");
        aceptar.setSize(50,45);
        aceptar.setLocation(110, 10);
        aceptar.setBackground(new Color(47, 55, 74));
        aceptar.setForeground(new Color(255, 255, 255));
        aceptar.setFont(new Font("Ubuntu", 0, 13));
        aceptar.addActionListener(
                new ColocarOpcionActionListener(
                        proveniente, dato, this
                )
        );
        contenedor.add(aceptar);
        opciones = new JButton[15];
        opciones[0] = new JButton("+");
        opciones[0].setLocation(10,60);
        opciones[1] = new JButton("-");
        opciones[1].setLocation(60,60);
        opciones[2] = new JButton("x");
        opciones[2].setLocation(10,110);
        opciones[3] = new JButton("/");
        opciones[3].setLocation(60,110);
        opciones[4] = new JButton("=");
        opciones[4].setLocation(110,60);
        opciones[5] = new JButton("7");
        opciones[5].setLocation(10,170);
        opciones[6] = new JButton("8");
        opciones[6].setLocation(60,170);
        opciones[7] = new JButton("9");
        opciones[7].setLocation(110,170);
        opciones[8] = new JButton("4");
        opciones[8].setLocation(10,220);
        opciones[9] = new JButton("5");
        opciones[9].setLocation(60,220);
        opciones[10] = new JButton("6");
        opciones[10].setLocation(110,220);
        opciones[11] = new JButton("1");
        opciones[11].setLocation(10,270);
        opciones[12] = new JButton("2");
        opciones[12].setLocation(60,270);
        opciones[13] = new JButton("3");
        opciones[13].setLocation(110,270);
        opciones[14] = new JButton("0");
        opciones[14].setLocation(10,320);
        for(a=0; a<15; a++){
            opciones[a].setSize(50,50);
            opciones[a].setBackground(new Color(47, 55, 74));
            opciones[a].setForeground(new Color(255, 255, 255));
            if(a<5){
                opciones[a].addActionListener(
                    new ColocarOpcionActionListener(
                            proveniente, opciones[a], this
                    )
                );
            }
            else{
                opciones[a].addActionListener(
                        new EscribirNumeroActionListener(
                                opciones[a].getText(), dato
                        )
                );
            }
            contenedor.add(opciones[a]);
        }
    }
    
    public void destruir(){
        int tamanio=0,
            x=0;
        if(proveniente!=null){
            proveniente=null;
        }
        if(opciones!=null){
            tamanio=opciones.length;
            for(x=0; x<tamanio; x++){
                if(opciones[x]!=null){
                    opciones[x]=null;
                }
            }
        }
        if(dato!=null){
            dato=null;
        }
        if(aceptar!=null){
            aceptar=null;
        }
        if(contenedor!=null){
            contenedor=null;
        }
        System.gc();
    }
    
}
