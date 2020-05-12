
package GUI;

import Control.SeleccionarMenuTutorActionListener;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;


public class MenuTutor extends MenuFrame {
    private JButton informacion;
    private JButton ninios;
    private JButton salir;
    private JPanel menu;
    private JPanel fondo;
    private JPanel supermenu;
    private InformacionTutorPanel informacionTutor;
    
    public MenuTutor(){
        super();
        initComponents();
    }
    
    private void initComponents(){
        crearFondo();
        informacionTutor = new InformacionTutorPanel();
        supermenu = new JPanel();
        supermenu.setLayout(new CardLayout());
        supermenu.add(fondo, "fondo");
        supermenu.add(informacionTutor, "informacion");
        super.agregarFondo(supermenu);
        crearMenu();
    }
    
    private void crearFondo(){
        fondo = new JPanel();
        fondo.setBackground(new Color(56, 87, 35));
        fondo.setLayout(new BorderLayout());
        fondo.add(super.getIcono(), BorderLayout.CENTER);
    }
    
    private void crearMenu(){
        menu = new JPanel();
        menu.setLayout(new GridLayout(3, 1, 10, 10));
        menu.setBackground(new Color(56, 87, 35));
        informacion = new JButton("Información");
        informacion.setBackground(new Color(56, 87, 35));
        informacion.setForeground(new Color(255, 255, 255));
        informacion.setBorder(null);
        informacion.addActionListener(
                new SeleccionarMenuTutorActionListener(
                        supermenu, 1
                )
        );
        menu.add(informacion);
        ninios = new JButton("Niños");
        ninios.setBackground(new Color(56, 87, 35));
        ninios.setForeground(new Color(255, 255, 255));
        ninios.setBorder(null);
        menu.add(ninios);
        salir = new JButton("Salir");
        salir.setBackground(new Color(56, 87, 35));
        salir.setForeground(new Color(255, 255, 255));
        salir.setBorder(null);
        menu.add(salir);
        super.agregarMenu(menu);
    }
    
}
