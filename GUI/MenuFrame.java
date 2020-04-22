
package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static javax.swing.SwingConstants.CENTER;


public class MenuFrame extends JFrame {
    public Container contenedor;
    public JLabel icono;
    
    public MenuFrame(){
        super("Mate con señas");
        initComponents();
    }
    
    private void initComponents(){
        this.setSize(1000, 700);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setIconImage(
                new ImageIcon(
                        getClass().getResource("Iconos/Icono.png")
                ).getImage()
        );
        JLabel titulo = new JLabel("Mate con señas");
        titulo.setFont(new Font("Ubuntu", 0, 35));
        titulo.setForeground(new Color(255, 255, 255));
        titulo.setHorizontalAlignment(CENTER);
        titulo.setVerticalAlignment(CENTER);
        icono = new JLabel();
        icono.setIcon(
                new ImageIcon(
                        getClass().getResource("Iconos/IconoGrande.png")
                )
        );
        icono.setHorizontalAlignment(CENTER);
        icono.setVerticalAlignment(CENTER);
        contenedor = this.getContentPane();
        contenedor.setBackground(new Color(56, 87, 35));
        contenedor.setLayout(new BorderLayout());
        contenedor.add(titulo, BorderLayout.NORTH);
    }
    
    public void destruir(){
        if(contenedor!=null){
            contenedor=null;
        }
        if(icono!=null){
            icono=null;
        }
        System.gc();
    }
    
    public void agregarMenu(JPanel menu){
        contenedor.add(menu, BorderLayout.WEST);
    }
    
    public void agregarFondo(JPanel fondo){
        contenedor.add(fondo, BorderLayout.CENTER);
    }
    
}
