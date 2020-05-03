
package GUI;

import Control.CerrarVentanaActionListener;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class MultiplicarDecenasFrame extends JFrame {
    private JButton atras;
    private JTextField[] numeros;
    private Container contenedor;
    
    public MultiplicarDecenasFrame(){
        initComponents();
    }
    
    private void initComponents(){
        int a=0,
            b=0,
            x=65,
            y=85;
        this.setSize(600, 337);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setIconImage(
                new ImageIcon(
                        getClass().getResource("Iconos/Icono.png")
                ).getImage()
        );
        this.setUndecorated(true);
        contenedor = this.getContentPane();
        contenedor.setBackground(new Color(56, 87, 35));
        contenedor.setLayout(null);
        JLabel titulo = new JLabel("Multiplicar con decenas");
        titulo.setSize(600, 35);
        titulo.setLocation(0, 10);
        titulo.setFont(new Font("Ubuntu", 0, 35));
        titulo.setForeground(new Color(255, 255, 255));
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setVerticalAlignment(SwingConstants.CENTER);
        contenedor.add(titulo);
        atras = new JButton();
        atras.setSize(50, 50);
        atras.setIcon(
                new ImageIcon(
                        getClass().getResource("Iconos/Atras.png")
                )
        );
        atras.setLocation(10, 10);
        atras.addActionListener(
                new CerrarVentanaActionListener(this)
        );
        atras.setBackground(new Color(56, 87, 35));
        atras.setBorder(null);
        contenedor.add(atras);
        numeros = new JTextField[24];
        numeros[0] = new JTextField("11");
        numeros[1] = new JTextField("3");
        numeros[2] = new JTextField("33");
        numeros[3] = new JTextField("22");
        numeros[4] = new JTextField("5");
        numeros[5] = new JTextField("110");
        numeros[6] = new JTextField("35");
        numeros[7] = new JTextField("16");
        numeros[8] = new JTextField("190");
        numeros[9] = new JTextField("90");
        numeros[10] = new JTextField("9");
        numeros[11] = new JTextField("810");
        numeros[12] = new JTextField("46");
        numeros[13] = new JTextField("33");
        numeros[14] = new JTextField("138");
        numeros[15] = new JTextField("58");
        numeros[16] = new JTextField("10");
        numeros[17] = new JTextField("00");
        numeros[18] = new JTextField("35  ");
        numeros[19] = new JTextField("540");
        numeros[20] = new JTextField("138  ");
        numeros[21] = new JTextField("1518");
        numeros[22] = new JTextField("58  ");
        numeros[23] = new JTextField("580");
        for(a=0; a<18; a++){
            numeros[a].setLocation(x, y);
            y+=30;
            b++;
            if(b==3){
                y=85;
                x+=85;
                b=0;
            }
        }
        numeros[18].setLocation(235, 175);
        numeros[19].setLocation(235, 205);
        numeros[20].setLocation(405, 175);
        numeros[21].setLocation(405, 205);
        numeros[22].setLocation(490, 175);
        numeros[23].setLocation(490, 205);
        for(a=0; a<24; a++){
            numeros[a].setSize(50, 25);
            numeros[a].setHorizontalAlignment(JTextField.RIGHT);
            numeros[a].setEditable(false);
            contenedor.add(numeros[a]);
        }
        JLabel[] simbolos = new JLabel[6];
        x=45;
        for(a=0; a<6; a++){
            simbolos[a] = new JLabel("x");
            simbolos[a].setSize(25, 25);
            simbolos[a].setLocation(x, 100);
            x+=85;
            simbolos[a].setForeground(new Color(255, 255, 255));
            contenedor.add(simbolos[a]);
        }
        JSeparator[] separador = new JSeparator[9];
        for(a=0; a<9; a++){
            separador[a] = new JSeparator();
            separador[a].setSize(65, 2);
            separador[a].setBackground(new Color(255, 255, 255));
        }
        x=60;
        for(a=0; a<6; a++){
            separador[a].setLocation(x, 142);
            x+=85;
        }
        separador[6].setLocation(230, 202);
        separador[7].setLocation(400, 202);
        separador[8].setLocation(485, 202);
        for(a=0; a<9; a++){
            contenedor.add(separador[a]);
        }
    }
    
    public void destruir(){
        int tamanio=0,
            x=0;
        if(atras!=null){
            atras=null;
        }
        if(numeros!=null){
            tamanio=numeros.length;
            for(x=0; x<tamanio; x++){
                if(numeros[x]!=null){
                    numeros[x]=null;
                }
            }
        }
        if(contenedor!=null){
            contenedor=null;
        }
        System.gc();
    }
    
}
