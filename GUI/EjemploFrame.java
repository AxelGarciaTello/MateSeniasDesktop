
package GUI;

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
    private JButton atras;
    private JTextField[] numeros;
    public Container contenedor;
    
    public EjemploFrame(String titulo, String simbolo){
        super(titulo);
        initComponents(titulo, simbolo);
    }
    
    private void initComponents(String titulo, String simbolo){
        int a=0,
            b=0,
            x=65,
            y=85,
            xs=45;
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
        contenedor.setBackground(new Color(0, 80, 0));
        contenedor.setLayout(null);
        JLabel etiqueta = new JLabel(titulo);
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
        contenedor.add(atras);
        JLabel[] simbolos = new JLabel[6];
        for(a=0; a<6; a++){
            simbolos[a] = new JLabel(simbolo);
            simbolos[a].setSize(25, 25);
            simbolos[a].setLocation(xs, 100);
            xs+=85;
            simbolos[a].setForeground(new Color(255, 255, 255));
            contenedor.add(simbolos[a]);
        }
        numeros = new JTextField[18];
        for(a=0; a<18; a++){
            numeros[a] = new JTextField("000");
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
    
}