
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


public class MultiplicarCentenasFrame extends JFrame {
    private JButton atras;
    private JTextField[] numeros;
    private Container contenedor;
    
    public MultiplicarCentenasFrame(){
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
        JLabel titulo = new JLabel("Multiplicar con centenas");
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
        numeros = new JTextField[34];
        numeros[0] = new JTextField("111");
        numeros[1] = new JTextField("23");
        numeros[2] = new JTextField("333");
        numeros[3] = new JTextField("222  ");
        numeros[4] = new JTextField("2553");
        numeros[5] = new JTextField("822");
        numeros[6] = new JTextField("137");
        numeros[7] = new JTextField("5754");
        numeros[8] = new JTextField("2466  ");
        numeros[9] = new JTextField("822    ");
        numeros[10] = new JTextField("305");
        numeros[11] = new JTextField("216");
        numeros[12] = new JTextField("1830");
        numeros[13] = new JTextField("305  ");
        numeros[14] = new JTextField("610    ");
        numeros[15] = new JTextField("964");
        numeros[16] = new JTextField("49");
        numeros[17] = new JTextField("8676");
        numeros[18] = new JTextField("3856  ");
        numeros[19] = new JTextField("47236");
        numeros[20] = new JTextField("587");
        numeros[21] = new JTextField("197");
        numeros[22] = new JTextField("4109");
        numeros[23] = new JTextField("5283  ");
        numeros[24] = new JTextField("587    ");
        numeros[25] = new JTextField("444");
        numeros[26] = new JTextField("333");
        numeros[27] = new JTextField("1332");
        numeros[28] = new JTextField("1332  ");
        numeros[29] = new JTextField("1332    ");
        numeros[30] = new JTextField("112614");
        numeros[31] = new JTextField("65880");
        numeros[32] = new JTextField("115639");
        numeros[33] = new JTextField("147852");
        for(a=0; a<30; a++){
            numeros[a].setLocation(x, y);
            y+=30;
            b++;
            if(b==5){
                y=85;
                x+=85;
                b=0;
            }
        }
        numeros[30].setLocation(140, 235);
        numeros[31].setLocation(225, 235);
        numeros[32].setLocation(395, 235);
        numeros[33].setLocation(480, 235);
        for(a=0; a<34; a++){
            if(a<30){
                numeros[a].setSize(50, 25);
            }
            else{
                numeros[a].setSize(60, 25);
            }
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
        JSeparator[] separador = new JSeparator[12];
        for(a=0; a<12; a++){
            separador[a] = new JSeparator();
            separador[a].setSize(65, 2);
            separador[a].setBackground(new Color(255, 255, 255));
        }
        x=60;
        for(a=0; a<6; a++){
            separador[a].setLocation(x, 142);
            x+=85;
        }
        separador[6].setLocation(60, 202);
        separador[7].setLocation(315, 202);
        separador[8].setLocation(145, 232);
        separador[9].setLocation(230, 232);
        separador[10].setLocation(400, 232);
        separador[11].setLocation(485, 232);
        for(a=0; a<12; a++){
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
