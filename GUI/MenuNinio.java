
package GUI;

import Control.AbrirVideoActionListener;
import Control.IrEjemploActionListener;
import Control.IrEjercicioActionListener;
import Control.IrJuegoActionListener;
import Control.SeleccionarMenuNinioActionListener;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MenuNinio extends MenuFrame {
    private JButton video;
    private JButton ejemplo;
    private JButton ejercicio;
    private JButton juego;
    private JButton salir;
    private JButton[] temasVideo;
    private JButton[] temasEjemplo;
    private JButton[] temasEjercicio;
    private JButton[] temasJuego;
    private JPanel menu;
    private JPanel menuVideo;
    private JPanel menuEjemplo;
    private JPanel menuEjercicio;
    private JPanel menuJuego;
    private JPanel fondo;
    private JPanel supermenu;
    
    public MenuNinio(){
        super();
        initComponents();
    }
    
    private void initComponents(){
        crearFondo();
        crearMenuVideo();
        crearMenuEjemplo();
        crearMenuEjercicio();
        crearMenuJuego();
        supermenu = new JPanel();
        supermenu.setLayout(new CardLayout());
        supermenu.add(fondo, "fondo");
        supermenu.add(menuVideo, "video");
        supermenu.add(menuEjemplo, "ejemplo");
        supermenu.add(menuEjercicio, "ejercicio");
        supermenu.add(menuJuego, "juego");
        super.agregarFondo(supermenu);
        crearMenu();
    }
    
    private void crearMenu(){
        menu = new JPanel();
        menu.setLayout(new GridLayout(5,1));
        menu.setBackground(new Color(56, 87, 35));
        video = new JButton("1. Aprende: con videos");
        video.setIcon(
                new ImageIcon(
                        getClass().getResource("Iconos/Video.png")
                )
        );
        video.setBackground(new Color(56, 87, 35));
        video.setForeground(new Color(255, 255, 255));
        video.setBorder(null);
        ejemplo = new JButton("2. Sigue: los ejemplos");
        ejemplo.setIcon(
                new ImageIcon(
                        getClass().getResource("Iconos/Ejemplos.png")
                )
        );
        ejemplo.setBackground(new Color(56, 87, 35));
        ejemplo.setForeground(new Color(255, 255, 255));
        ejemplo.setBorder(null);
        ejercicio = new JButton("3. Práctica: con ejercicios");
        ejercicio.setIcon(
                new ImageIcon(
                        getClass().getResource("Iconos/Problemas.png")
                )
        );
        ejercicio.setBackground(new Color(56, 87, 35));
        ejercicio.setForeground(new Color(255, 255, 255));
        ejercicio.setBorder(null);
        juego = new JButton("4. Juega y diviertete");
        juego.setIcon(
                new ImageIcon(
                        getClass().getResource("Iconos/Juegos.png")
                )
        );
        juego.setBackground(new Color(56, 87, 35));
        juego.setForeground(new Color(255, 255, 255));
        juego.setBorder(null);
        salir = new JButton("5. Salir");
        salir.setBackground(new Color(56, 87, 35));
        salir.setForeground(new Color(255, 255, 255));
        salir.setBorder(null);
        menu.add(video);
        menu.add(ejemplo);
        menu.add(ejercicio);
        menu.add(juego);
        menu.add(salir);
        video.addActionListener(
                new SeleccionarMenuNinioActionListener(supermenu,1)
        );
        ejemplo.addActionListener(
                new SeleccionarMenuNinioActionListener(supermenu,2)
        );
        ejercicio.addActionListener(
                new SeleccionarMenuNinioActionListener(supermenu,3)
        );
        juego.addActionListener(
                new SeleccionarMenuNinioActionListener(supermenu,4)
        );
        salir.addActionListener(
                new SeleccionarMenuNinioActionListener(supermenu,5)
        );
        super.agregarMenu(menu);
    }
    
    private void crearMenuVideo(){
        menuVideo = new JPanel();
        menuVideo.setLayout(new GridLayout(6,2));
        menuVideo.setBackground(new Color(56, 87, 35));
        temasVideo = new JButton[12];
        temasVideo[0] = new JButton("1. Introducción ¿Qué es la artimética?");
        temasVideo[1] = new JButton("2. Concepto de unidad y números");
        temasVideo[2] = new JButton("3. Concepto de decena");
        temasVideo[3] = new JButton("4. Concepto de centena");
        temasVideo[4] = new JButton("5. Concepto de suma");
        temasVideo[5] = new JButton("6. Concepto de resta");
        temasVideo[6] = new JButton("7. Concepto de multiplicación");
        temasVideo[7] = new JButton("8. Concepto de división");
        temasVideo[8] = new JButton("9. Ejemplos de sumar");
        temasVideo[9] = new JButton("10. Ejemplos de restar");
        temasVideo[10] = new JButton("11. Ejemplos de multiplicar");
        temasVideo[11] = new JButton("12. Ejemplos de dividir");
        for(int x=0; x<12; x++){
            temasVideo[x].setBackground(new Color(56, 87, 35));
            temasVideo[x].setForeground(new Color(255, 255, 255));
            temasVideo[x].setBorder(null);
            temasVideo[x].addActionListener(
                    new AbrirVideoActionListener("")
            );
            menuVideo.add(temasVideo[x]);
        }
    }
    
    private void crearMenuEjemplo(){
        int x=0;
        String[] simbolo={"+","+","+","+","-","-","-","x","x","x","/","/","/"};
        menuEjemplo = new JPanel();
        menuEjemplo.setLayout(new GridLayout(7,2));
        menuEjemplo.setBackground(new Color(56, 87, 35));
        temasEjemplo = new JButton[13];
        temasEjemplo[0] = new JButton("Sistema Numérico: Decimal");
        temasEjemplo[1] = new JButton("Sumar con unidades");
        temasEjemplo[2] = new JButton("Sumar con decenas");
        temasEjemplo[3] = new JButton("Sumar con centenas");
        temasEjemplo[4] = new JButton("Restar con unidades");
        temasEjemplo[5] = new JButton("Restar con decenas");
        temasEjemplo[6] = new JButton("Restar con centenas");
        temasEjemplo[7] = new JButton("Multiplicar con unidades");
        temasEjemplo[8] = new JButton("Multiplicar con decenas");
        temasEjemplo[9] = new JButton("Multiplicar con centenas");
        temasEjemplo[10] = new JButton("Dividir con unidades");
        temasEjemplo[11] = new JButton("Dividir con decenas");
        temasEjemplo[12] = new JButton("Dividir con centenas");
        for(x=0; x<13; x++){
            temasEjemplo[x].setBackground(new Color(56, 87, 35));
            temasEjemplo[x].setForeground(new Color(255, 255, 255));
            temasEjemplo[x].setBorder(null);
            temasEjemplo[x].addActionListener(
                    new IrEjemploActionListener(
                            temasEjemplo[x].getText(), simbolo[x]
                    )
            );
            menuEjemplo.add(temasEjemplo[x]);
        }
    }
    
    private void crearMenuEjercicio(){
        int x=0;
        String[] simbolo={"+","+","+","-","-","-","x","x","x","/","/","/"};
        menuEjercicio = new JPanel();
        menuEjercicio.setLayout(new GridLayout(6,2));
        menuEjercicio.setBackground(new Color(56, 87, 35));
        temasEjercicio = new JButton[12];
        temasEjercicio[0] = new JButton("Sumar con unidades");
        temasEjercicio[1] = new JButton("Sumar con decenas");
        temasEjercicio[2] = new JButton("Sumar con centenas");
        temasEjercicio[3] = new JButton("Restar con unidades");
        temasEjercicio[4] = new JButton("Restar con decenas");
        temasEjercicio[5] = new JButton("Restar con centenas");
        temasEjercicio[6] = new JButton("Multiplicar con unidades");
        temasEjercicio[7] = new JButton("Multiplicar con decenas");
        temasEjercicio[8] = new JButton("Multiplicar con centenas");
        temasEjercicio[9] = new JButton("Dividir con unidades");
        temasEjercicio[10] = new JButton("Dividir con decenas");
        temasEjercicio[11] = new JButton("Dividir con centenas");
        for(x=0; x<12; x++){
            temasEjercicio[x].setBackground(new Color(56, 87, 35));
            temasEjercicio[x].setForeground(new Color(255, 255, 255));
            temasEjercicio[x].setBorder(null);
            temasEjercicio[x].addActionListener(
                    new IrEjercicioActionListener(
                            temasEjercicio[x].getText(), simbolo[x]
                    )
            );
            menuEjercicio.add(temasEjercicio[x]);
        }
    }
    
    private void crearMenuJuego(){
        int x=0;
        menuJuego = new JPanel();
        menuJuego.setLayout(new GridLayout(6,2));
        menuJuego.setBackground(new Color(56, 87, 35));
        temasJuego = new JButton[12];
        temasJuego[0] = new JButton("Sumas");
        temasJuego[1] = new JButton("Restas");
        temasJuego[2] = new JButton("Sumas y restas");
        temasJuego[3] = new JButton("Sumas y restas");
        temasJuego[4] = new JButton("Multiplicaciones");
        temasJuego[5] = new JButton("Divisones");
        temasJuego[6] = new JButton("Multiplicaciones y divisiones");
        temasJuego[7] = new JButton("Multiplicaciones y divisiones");
        temasJuego[8] = new JButton("Sumas, restas, multiplicaciones y"
                + " divisiones");
        temasJuego[9] = new JButton("Sumas, restas, multiplicaciones y"
                + " divisiones");
        temasJuego[10] = new JButton("Sumas, restas, multiplicaciones y"
                + " divisiones");
        temasJuego[11] = new JButton("Sumas, restas, multiplicaciones y"
                + " divisiones");
        for(x=0; x<12; x++){
            temasJuego[x].setBackground(new Color(56, 87, 35));
            temasJuego[x].setForeground(new Color(255, 255, 255));
            temasJuego[x].setBorder(null);
            temasJuego[x].addActionListener(
                    new IrJuegoActionListener(temasJuego[x].getText())
            );
            menuJuego.add(temasJuego[x]);
        }
    }
    
    private void crearFondo(){
        fondo = new JPanel();
        fondo.setLayout(new GridLayout(1,1));
        fondo.setBackground(new Color(56, 87, 35));
        fondo.add(super.icono);
    }
    
    @Override
    public void destruir(){
        int x;
        super.destruir();
        if(video!=null){
            video=null;
        }
        if(ejemplo!=null){
            ejemplo=null;
        }
        if(ejercicio!=null){
            ejercicio=null;
        }
        if(juego!=null){
            juego=null;
        }
        if(salir!=null){
            salir=null;
        }
        for(x=0; x<12; x++){
            if(temasVideo[x]!=null){
                temasVideo[x]=null;
            }
            if(temasEjemplo[x]!=null){
                temasEjemplo[x]=null;
            }
            if(temasEjercicio[x]!=null){
                temasEjercicio[x]=null;
            }
            if(temasJuego[x]!=null){
                temasJuego[x]=null;
            }
        }
        if(temasEjemplo[12]!=null){
            temasEjemplo[12]=null;
        }
        if(menu!=null){
            menu=null;
        }
        if(menuVideo!=null){
            menuVideo=null;
        }
        if(menuEjemplo!=null){
            menuEjemplo=null;
        }
        if(menuEjercicio!=null){
            menuEjercicio=null;
        }
        if(menuJuego!=null){
            menuJuego=null;
        }
        if(fondo!=null){
            fondo=null;
        }
        if(supermenu!=null){
            supermenu=null;
        }
        System.gc();
    }
    
}
