
package GUI;

import Control.AbrirSistemaNumericoActionListener;
import Control.AbrirVideoActionListener;
import Control.IrEjemploActionListener;
import Control.IrEjercicioActionListener;
import Control.IrJuegoActionListener;
import Control.IrMultiplicarCentenasActionListener;
import Control.IrMultiplicarDecenasActionListener;
import Control.SeleccionarMenuNinioActionListener;
import Logico.Ejemplo;
import Logico.Ejercicio;
import Logico.Juego;
import Logico.Ninio;
import Persistencia.Informacion;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MenuNinio extends MenuFrame {
    private JButton video,
                    ejemplo,
                    ejercicio,
                    juego,
                    salir;
    private JButton[] temasVideo,
                      temasEjemplo,
                      temasEjercicio,
                      temasJuego;
    private JPanel menu,
                   menuVideo,
                   menuEjemplo,
                   menuEjercicio,
                   menuJuego,
                   fondo,
                   supermenu;
    private Ninio ninio;
    private Ejemplo[] ejemplos;
    private Ejercicio[] ejercicios;
    private Juego[] juegos;
    
    public MenuNinio(Ninio ninio){
        super();
        this.ninio=ninio;
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
        menu.setLayout(new GridLayout(5,1, 10, 10));
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
        salir.setIcon(
                new ImageIcon(
                        getClass().getResource("Iconos/Salir.png")
                )
        );
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
        String[] video={
                        "https://youtu.be/qI461yZRnzA",
                        "https://youtu.be/UMSxkbjseuA",
                        "https://youtu.be/GW7tddqTJrg",
                        "https://youtu.be/Rb4mZ9iu5jQ",
                        "https://youtu.be/dA_YYtJoEH8",
                        "https://youtu.be/_hI5g9Qgk88",
                        "https://youtu.be/6E79UxPlGcQ",
                        "https://youtu.be/THYVpJVpILo",
                        "https://youtu.be/dpWv-eKXLWs",
                        "https://youtu.be/5pHSby10klE",
                        "https://youtu.be/3dbWbMLVvcA",
                        "https://youtu.be/C_83UW4UVPE"};
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
            temasVideo[x].setFont(new Font("Ubuntu", 0, 20));
            temasVideo[x].addActionListener(
                    new AbrirVideoActionListener(video[x])
            );
            menuVideo.add(temasVideo[x]);
        }
    }
    
    private void crearMenuEjemplo(){
        int x=0;
        IrEjemploActionListener[] irEjemplo = new IrEjemploActionListener[13];
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
        ejemplos=Informacion.crearEjemplos();
        for(x=0; x<13; x++){
            temasEjemplo[x].setBackground(new Color(56, 87, 35));
            temasEjemplo[x].setForeground(new Color(255, 255, 255));
            temasEjemplo[x].setBorder(null);
            temasEjemplo[x].setFont(new Font("Ubuntu", 0, 20));
            if(x!=0){
                irEjemplo[x] = new IrEjemploActionListener(ejemplos[x-1]);
                temasEjemplo[x].addActionListener(irEjemplo[x]);
            }
            else{
                temasEjemplo[0].addActionListener(
                    new AbrirSistemaNumericoActionListener()
                );
            }
            menuEjemplo.add(temasEjemplo[x]);
        }
        temasEjemplo[8].removeActionListener(irEjemplo[8]);
        temasEjemplo[8].addActionListener(
                new IrMultiplicarDecenasActionListener()
        );
        temasEjemplo[9].removeActionListener(irEjemplo[9]);
        temasEjemplo[9].addActionListener(
                new IrMultiplicarCentenasActionListener()
        );
    }
    
    private void crearMenuEjercicio(){
        int x=0;
        menuEjercicio = new JPanel();
        menuEjercicio.setLayout(new GridLayout(6,2));
        menuEjercicio.setBackground(new Color(56, 87, 35));
        temasEjercicio = new JButton[12];
        ejercicios=Informacion.crearEjercicios();
        for(x=0; x<12; x++){
            temasEjercicio[x] = new JButton(ejercicios[x].getTema());
            temasEjercicio[x].setBackground(new Color(56, 87, 35));
            temasEjercicio[x].setForeground(new Color(255, 255, 255));
            temasEjercicio[x].setBorder(null);
            temasEjercicio[x].setFont(new Font("Ubuntu", 0, 20));
            temasEjercicio[x].addActionListener(
                    new IrEjercicioActionListener(
                            ejercicios[x], ninio, x
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
        juegos=Informacion.crearJuegos();
        for(x=0; x<12; x++){
            temasJuego[x] = new JButton(juegos[x].getTema());
            temasJuego[x].setBackground(new Color(56, 87, 35));
            temasJuego[x].setForeground(new Color(255, 255, 255));
            temasJuego[x].setBorder(null);
            temasJuego[x].setFont(new Font("Ubuntu", 0, 20));
            temasJuego[x].addActionListener(
                    new IrJuegoActionListener(
                            juegos[x], ninio, (x+12)
                    )
            );
            menuJuego.add(temasJuego[x]);
        }
    }
    
    private void crearFondo(){
        fondo = new JPanel();
        fondo.setLayout(new GridLayout(1,1));
        fondo.setBackground(new Color(56, 87, 35));
        fondo.add(super.getIcono());
    }
    
    @Override
    public void destruir(){
        int tamanio=0,
            x=0;
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
        if(temasVideo!=null){
            tamanio=temasVideo.length;
            for(x=0; x<tamanio; x++){
                if(temasVideo[x]!=null){
                    temasVideo[x]=null;
                }
            }
        }
        if(temasEjemplo!=null){
            tamanio=temasEjemplo.length;
            for(x=0; x<tamanio; x++){
                if(temasEjemplo[x]!=null){
                    temasEjemplo[x]=null;
                }
            }
        }
        if(temasEjercicio!=null){
            tamanio=temasEjercicio.length;
            for(x=0; x<tamanio; x++){
                if(temasEjercicio[x]!=null){
                    temasEjercicio[x]=null;
                }
            }
        }
        if(temasJuego!=null){
            tamanio=temasJuego.length;
            for(x=0; x<tamanio; x++){
                if(temasJuego[x]!=null){
                    temasJuego[x]=null;
                }
            }
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
        if(ninio!=null){
            ninio=null;
        }
        if(ejemplos!=null){
            tamanio=ejemplos.length;
            for(x=0; x<tamanio; x++){
                if(ejemplos[x]!=null){
                    ejemplos[x]=null;
                }
            }
        }
        if(ejercicios!=null){
            tamanio=ejemplos.length;
            for(x=0; x<tamanio; x++){
                if(ejemplos[x]!=null){
                    ejemplos[x]=null;
                }
            }
        }
        if(juegos!=null){
            tamanio=juegos.length;
            for(x=0; x<tamanio; x++){
                if(juegos[x]!=null){
                    juegos[x]=null;
                }
            }
        }
        System.gc();
    }
    
}
