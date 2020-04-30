
package GUI;

import Control.CerrarVentanaActionListener;
import Logico.Ejemplo;
import Logico.Operacion;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPopupMenu.Separator;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import static javax.swing.SwingConstants.CENTER;


public class EjemploFrame extends JFrame {
    public JButton atras;
    private JTextField[] numeros;
    public Container contenedor;
    private Ejemplo ejemplo;
    
    public EjemploFrame(Ejemplo ejemplo){
        this.ejemplo=ejemplo;
        initComponents();
    }
    
    private void initComponents(){
        int a=0,
            b=0,
            x=65,
            y=85,
            xs=45,
            div=0,
            contador=0,
            valor=0;
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
        JLabel etiqueta = new JLabel(ejemplo.getTema());
        etiqueta.setSize(600, 35);
        etiqueta.setLocation(0, 10);
        etiqueta.setFont(new Font("Ubuntu", 0, 35));
        etiqueta.setForeground(new Color(255, 255, 255));
        etiqueta.setHorizontalAlignment(CENTER);
        etiqueta.setVerticalAlignment(CENTER);
        contenedor.add(etiqueta);
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
        Operacion[] operaciones = ejemplo.getOperaciones();
        JLabel[] simbolos = new JLabel[6];
        for(a=0; a<6; a++){
            simbolos[a] = new JLabel(
                    String.valueOf(operaciones[a].getSigno())
            );
            simbolos[a].setSize(25, 25);
            simbolos[a].setLocation(xs, 100);
            xs+=85;
            simbolos[a].setForeground(new Color(255, 255, 255));
            contenedor.add(simbolos[a]);
        }
        numeros = new JTextField[18];
        for(a=0; a<18; a++){
            div=a/3;
            switch (contador) {
                case 0:
                    valor=operaciones[div].getNumero1();
                    contador++;
                    break;
                case 1:
                    valor=operaciones[div].getNumero2();
                    contador++;
                    break;
                case 2:
                    valor=operaciones[div].getRespuesta();
                    contador=0;
                    break;
            }
            numeros[a] = new JTextField(
                    String.valueOf(valor)
            );
            numeros[a].setSize(50, 25);
            numeros[a].setLocation(x, y);
            y+=30;
            b++;
            if(b==3){
                y=85;
                x+=85;
                b=0;
            }
            numeros[a].setHorizontalAlignment(JTextField.RIGHT);
            numeros[a].setEditable(false);
            contenedor.add(numeros[a]);
        }
        JSeparator[] separador = new JSeparator[6];
        xs=60;
        for(a=0; a<6; a++){
            separador[a] = new Separator();
            separador[a].setSize(65, 2);
            separador[a].setBackground(new Color(255, 255, 255));
            separador[a].setLocation(xs, 142);
            xs+=85;
            contenedor.add(separador[a]);
        }
    }
    
    public void destruir(){
        int x=0;
        if(atras!=null){
            atras=null;
        }
        for(x=0; x<18; x++){
            if(numeros[x]!=null){
                numeros[x]=null;
            }
        }
        if(contenedor!=null){
            contenedor=null;
        }
        System.gc();
    }
    
}
