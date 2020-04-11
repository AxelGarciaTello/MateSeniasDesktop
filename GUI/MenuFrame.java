
package GUI;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class MenuFrame extends JFrame {
    
    public MenuFrame(){
        super("Matematicas con señas");
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
    }
    
}
