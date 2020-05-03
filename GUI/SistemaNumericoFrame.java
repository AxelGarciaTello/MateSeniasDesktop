
package GUI;

import Control.CerrarVentanaActionListener;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class SistemaNumericoFrame extends JFrame {
    private JButton atras;
    private JTextField[] numeros;
    private Container contenedor;
    
    public SistemaNumericoFrame(){
        initComponents();
    }
    
    public void initComponents(){
        int x,
            xp=145,
            yp=50;
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
        JLabel titulo = new JLabel("Sistema Numérico: Decimal");
        titulo.setSize(600, 35);
        titulo.setLocation(0, 10);
        titulo.setFont(new Font("Ubuntu", 0, 35));
        titulo.setForeground(new Color(255, 255, 255));
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setVerticalAlignment(SwingConstants.CENTER);
        contenedor.add(titulo);
        JLabel[] bloques = new JLabel[3];
        bloques[0] = new JLabel("Unidades");
        bloques[0].setLocation(10, 80);
        bloques[1] = new JLabel("Decenas");
        bloques[1].setLocation(10, 150);
        bloques[2] = new JLabel("Centenas");
        bloques[2].setLocation(10, 220);
        for(x=0; x<3; x++){
            bloques[x].setSize(100, 30);
            bloques[x].setFont(new Font("Ubuntu", 0, 20));
            bloques[x].setForeground(new Color(255, 255, 255));
            contenedor.add(bloques[x]);
        }
        numeros = new JTextField[28];
        for(x=0; x<10; x++){
            numeros[x]= new JTextField(String.valueOf(x));
            numeros[x].setLocation(xp, 80);
            xp+=45;
        }
        xp=190;
        for(x=1; x<10; x++){
            numeros[x+9] = new JTextField(String.valueOf(x*10));
            numeros[x+9].setLocation(xp, 150);
            xp+=45;
        }
        xp=190;
        for(x=1; x<10; x++){
            numeros[x+18] = new JTextField(String.valueOf(x*100));
            numeros[x+18].setLocation(xp, 220);
            xp+=45;
        }
        for(x=0; x<28; x++){
            numeros[x].setSize(40, 40);
            numeros[x].setFont(new Font("Ubuntu", 0, 20));
            numeros[x].setEditable(false);
            numeros[x].setHorizontalAlignment(SwingConstants.CENTER);
            contenedor.add(numeros[x]);
        }
        xp=145;
        JLabel[] flechas = new JLabel[26];
        for(x=0; x<14; x++){
            flechas[x] = new JLabel();
            flechas[x].setIcon(
                new ImageIcon(
                        getClass().getResource("Iconos/FlechaAbajo.png")
                )
            );
            flechas[x].setLocation(xp, yp);
            xp+=90;
            if(x==5){
                yp=120;
                xp=235;
            }
            if(x==9){
                yp=190;
                xp=235;
            }
        }
        xp=190;
        yp=110;
        for( ; x<26; x++){
            flechas[x] = new JLabel();
            flechas[x].setIcon(
                new ImageIcon(
                        getClass().getResource("Iconos/FlechaArriba.png")
                )
            );
            flechas[x].setLocation(xp, yp);
            xp+=90;
            if(x==17){
                yp=180;
                xp=190;
            }
            if(x==21){
                yp=250;
                xp=190;
            }
        }
        for(x=0; x<26; x++){
            flechas[x].setSize(85, 40);
            flechas[x].setHorizontalAlignment(SwingConstants.CENTER);
            flechas[x].setVerticalAlignment(SwingConstants.CENTER);
            contenedor.add(flechas[x]);
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
