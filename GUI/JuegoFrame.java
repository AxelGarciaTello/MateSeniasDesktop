
package GUI;

import Control.CerrarVentanaActionListener;
import Control.VerOpcionesActionListener;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static javax.swing.SwingConstants.CENTER;


public class JuegoFrame extends JFrame {
    private JButton atras;
    private JButton calificar;
    private JButton[] crucigrama;
    private Container contenedor;
    
    public JuegoFrame(String titulo){
        initComponents(titulo);
    }
    
    private void initComponents(String titulo){
        int x=0;
        this.setSize(930, 500);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setIconImage(
                new ImageIcon(
                        getClass().getResource("Iconos/Icono.png")
                ).getImage()
        );
        this.setUndecorated(true);
        contenedor=this.getContentPane();
        contenedor.setBackground(new Color(0, 80, 0));
        contenedor.setLayout(null);
        contenedor.setBackground(new Color(56, 87, 35));
        JLabel etiqueta = new JLabel("Crucigrama: "+titulo);
        etiqueta.setSize(930, 35);
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
        contenedor.add(atras);
        crucigrama = new JButton[24];
        for(x=0; x<24; x++){
            crucigrama[x] = new JButton("000");
            crucigrama[x].setSize(75, 75);
            crucigrama[x].setHorizontalAlignment(JTextField.CENTER);
            crucigrama[x].setBackground(new Color(47, 55, 74));
            crucigrama[x].setForeground(new Color(255, 255, 255));
        }
        crucigrama[0].setLocation(275,100);
        crucigrama[1].setLocation(575,100);
        crucigrama[2].setLocation(200,175);
        crucigrama[3].setLocation(275,175);
        crucigrama[4].setLocation(350,175);
        crucigrama[5].setLocation(425,175);
        crucigrama[6].setLocation(500,175);
        crucigrama[7].setLocation(575,175);
        crucigrama[8].setLocation(650,175);
        crucigrama[9].setLocation(725,175);
        crucigrama[10].setLocation(800,175);
        crucigrama[11].setLocation(275,250);
        crucigrama[12].setLocation(575,250);
        crucigrama[13].setLocation(50,325);
        crucigrama[14].setLocation(125,325);
        crucigrama[15].setLocation(200,325);
        crucigrama[16].setLocation(275,325);
        crucigrama[17].setLocation(350,325);
        crucigrama[18].setLocation(425,325);
        crucigrama[19].setLocation(500,325);
        crucigrama[20].setLocation(575,325);
        crucigrama[21].setLocation(650,325);
        crucigrama[22].setLocation(275,400);
        crucigrama[23].setLocation(575,400);
        for(x=0; x<24; x++){
            crucigrama[x].addActionListener(
                    new VerOpcionesActionListener(crucigrama[x])
            );
            contenedor.add(crucigrama[x]);
        }
        calificar = new JButton();
        calificar.setSize(50, 50);
        calificar.setIcon(
                new ImageIcon(
                        getClass().getResource("Iconos/Atras.png")
                )
        );
        calificar.setLocation(870,10);
        contenedor.add(calificar);
    }
    
    public void destruir(){
        int x=0;
        if(atras!=null){
            atras=null;
        }
        if(calificar!=null){
            calificar=null;
        }
        for(x=0; x<14; x++){
            if(crucigrama[x]!=null){
                crucigrama[x]=null;
            }
        }
        if(contenedor!=null){
            contenedor=null;
        }
        System.gc();
    }
}
