
package GUI;

import Control.SeleccionarMenuTutorActionListener;
import Logico.Tutor;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;


public class MenuTutor extends MenuFrame {
    private JButton informacion,
                    ninios,
                    salir;
    private JPanel menu,
                   fondo,
                   supermenu;
    private InformacionTutorPanel informacionTutor;
    private InformacionNinioPanel informacionNinio;
    private Tutor tutor;
    
    public MenuTutor(Tutor tutor){
        super();
        this.tutor=tutor;
        initComponents();
    }
    
    private void initComponents(){
        crearFondo();
        informacionTutor = new InformacionTutorPanel(tutor);
        informacionNinio = new InformacionNinioPanel(tutor);
        supermenu = new JPanel();
        supermenu.setLayout(new CardLayout());
        supermenu.add(fondo, "fondo");
        supermenu.add(informacionTutor, "informacion");
        supermenu.add(informacionNinio, "ninio");
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
        informacion.setIcon(
                new ImageIcon(
                        getClass().getResource("Iconos/Informacion.png")
                )
        );
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
        ninios.setIcon(
                new ImageIcon(
                        getClass().getResource("Iconos/Progreso.png")
                )
        );
        ninios.setBackground(new Color(56, 87, 35));
        ninios.setForeground(new Color(255, 255, 255));
        ninios.setBorder(null);
        ninios.addActionListener(
                new SeleccionarMenuTutorActionListener(
                        supermenu, 2
                )
        );
        menu.add(ninios);
        salir = new JButton("Salir");
        salir.setIcon(
                new ImageIcon(
                        getClass().getResource("Iconos/Salir.png")
                )
        );
        salir.setBackground(new Color(56, 87, 35));
        salir.setForeground(new Color(255, 255, 255));
        salir.setBorder(null);
        salir.addActionListener(
                new SeleccionarMenuTutorActionListener(
                        supermenu, 3
                )
        );
        menu.add(salir);
        super.agregarMenu(menu);
    }
    
    @Override
    public void destruir(){
        if(informacion!=null){
            informacion=null;
        }
        if(ninios!=null){
            ninios=null;
        }
        if(salir!=null){
            salir=null;
        }
        if(menu!=null){
            menu=null;
        }
        if(fondo!=null){
            fondo=null;
        }
        if(supermenu!=null){
            supermenu=null;
        }
        if(informacionTutor!=null){
            informacionTutor.destruir();
            informacionTutor=null;
        }
        if(informacionNinio!=null){
            informacionNinio.destruir();
            informacionNinio=null;
        }
        System.gc();
    }
    
}
