
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
import static javax.swing.SwingConstants.CENTER;


public class SistemaNumericoFrame extends JFrame {
    private JButton atras;
    private JTextField[] numeros;
    private Container contenedor;
    
    public SistemaNumericoFrame(){
        initComponents();
    }
    
    public void initComponents(){
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
        titulo.setHorizontalAlignment(CENTER);
        titulo.setVerticalAlignment(CENTER);
        contenedor.add(titulo);
        JLabel[] bloques = new JLabel[3];
        bloques[0] = new JLabel("Unidades");
        bloques[0].setSize(100, 30);
        bloques[0].setLocation(10, 60);
    }
    
}
