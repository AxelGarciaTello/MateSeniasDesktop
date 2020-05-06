
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
import Logico.Ninio;
import Logico.Opcion;
import Logico.Operacion;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
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
    private Ninio ninio;
    private Ejemplo[] ejemplos;
    private Ejercicio[] ejercicios;
    
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
                    new AbrirVideoActionListener("")
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
        crearEjemplos();
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
        crearEjercicios();
        for(x=0; x<12; x++){
            temasEjercicio[x].setBackground(new Color(56, 87, 35));
            temasEjercicio[x].setForeground(new Color(255, 255, 255));
            temasEjercicio[x].setBorder(null);
            temasEjercicio[x].setFont(new Font("Ubuntu", 0, 20));
            temasEjercicio[x].addActionListener(
                    new IrEjercicioActionListener(
                            ejercicios[x], ninio.getProgreso(x)
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
            temasJuego[x].setFont(new Font("Ubuntu", 0, 20));
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
        fondo.add(super.getIcono());
    }
    
    private void crearEjemplos(){
        ejemplos = new Ejemplo[12];
        Operacion[][] operaciones = new Operacion[12][6];
        operaciones[0][0] = new Operacion(1, 3, '+');
        operaciones[0][1] = new Operacion(2, 0, '+');
        operaciones[0][2] = new Operacion(5, 6, '+');
        operaciones[0][3] = new Operacion(9, 1, '+');
        operaciones[0][4] = new Operacion(2, 3, '+');
        operaciones[0][5] = new Operacion(8, 4, '+');
        operaciones[1][0] = new Operacion(11, 3, '+');
        operaciones[1][1] = new Operacion(22, 5, '+');
        operaciones[1][2] = new Operacion(35, 16, '+');
        operaciones[1][3] = new Operacion(90, 9, '+');
        operaciones[1][4] = new Operacion(46, 33, '+');
        operaciones[1][5] = new Operacion(58, 10, '+');
        operaciones[2][0] = new Operacion(111, 23, '+');
        operaciones[2][1] = new Operacion(822, 137, '+');
        operaciones[2][2] = new Operacion(305, 216, '+');
        operaciones[2][3] = new Operacion(964, 49, '+');
        operaciones[2][4] = new Operacion(587, 197, '+');
        operaciones[2][5] = new Operacion(444, 333, '+');
        operaciones[3][0] = new Operacion(6, 3, '-');
        operaciones[3][1] = new Operacion(2, 0, '-');
        operaciones[3][2] = new Operacion(9, 2, '-');
        operaciones[3][3] = new Operacion(5, 5, '-');
        operaciones[3][4] = new Operacion(2, 3, '-');
        operaciones[3][5] = new Operacion(8, 4, '-');
        operaciones[4][0] = new Operacion(11, 3, '-');
        operaciones[4][1] = new Operacion(22, 5, '-');
        operaciones[4][2] = new Operacion(35, 16, '-');
        operaciones[4][3] = new Operacion(90, 9, '-');
        operaciones[4][4] = new Operacion(46, 33, '-');
        operaciones[4][5] = new Operacion(58, 10, '-');
        operaciones[5][0] = new Operacion(111, 23, '-');
        operaciones[5][1] = new Operacion(822, 137, '-');
        operaciones[5][2] = new Operacion(305, 216, '-');
        operaciones[5][3] = new Operacion(964, 49, '-');
        operaciones[5][4] = new Operacion(587, 197, '-');
        operaciones[5][5] = new Operacion(444, 333, '-');
        operaciones[6][0] = new Operacion(6, 3, 'x');
        operaciones[6][1] = new Operacion(2, 0, 'x');
        operaciones[6][2] = new Operacion(9, 2, 'x');
        operaciones[6][3] = new Operacion(5, 5, 'x');
        operaciones[6][4] = new Operacion(2, 3, 'x');
        operaciones[6][5] = new Operacion(8, 4, 'x');
        operaciones[7][0] = new Operacion(11, 3, 'x');
        operaciones[7][1] = new Operacion(22, 5, 'x');
        operaciones[7][2] = new Operacion(35, 16, 'x');
        operaciones[7][3] = new Operacion(90, 9, 'x');
        operaciones[7][4] = new Operacion(46, 33, 'x');
        operaciones[7][5] = new Operacion(58, 10, 'x');
        operaciones[8][0] = new Operacion(111, 23, 'x');
        operaciones[8][1] = new Operacion(822, 137, 'x');
        operaciones[8][2] = new Operacion(305, 216, 'x');
        operaciones[8][3] = new Operacion(964, 49, 'x');
        operaciones[8][4] = new Operacion(587, 197, 'x');
        operaciones[8][5] = new Operacion(444, 333, 'x');
        operaciones[9][0] = new Operacion(6, 3, '/');
        operaciones[9][1] = new Operacion(2, 1, '/');
        operaciones[9][2] = new Operacion(4, 2, '/');
        operaciones[9][3] = new Operacion(7, 7, '/');
        operaciones[9][4] = new Operacion(9, 3, '/');
        operaciones[9][5] = new Operacion(8, 2, '/');
        operaciones[10][0] = new Operacion(21, 3, '/');
        operaciones[10][1] = new Operacion(90, 45, '/');
        operaciones[10][2] = new Operacion(35, 7, '/');
        operaciones[10][3] = new Operacion(24, 6, '/');
        operaciones[10][4] = new Operacion(56, 8, '/');
        operaciones[10][5] = new Operacion(56, 7, '/');
        operaciones[11][0] = new Operacion(842, 421, '/');
        operaciones[11][1] = new Operacion(800, 200, '/');
        operaciones[11][2] = new Operacion(150, 50, '/');
        operaciones[11][3] = new Operacion(300, 60, '/');
        operaciones[11][4] = new Operacion(400, 100, '/');
        operaciones[11][5] = new Operacion(624, 208, '/');
        for(int x=0; x<12; x++){
            ejemplos[x] = new Ejemplo(
                    operaciones[x], temasEjemplo[x+1].getText()
            );
        }
    }
    
    private void crearEjercicios(){
        ejercicios = new Ejercicio[12];
        Operacion[][] operaciones = new Operacion[12][6];
        operaciones[0][0] = new Operacion(1, 3, '+');
        operaciones[0][1] = new Operacion(2, 0, '+');
        operaciones[0][2] = new Operacion(5, 6, '+');
        operaciones[0][3] = new Operacion(9, 1, '+');
        operaciones[0][4] = new Operacion(2, 3, '+');
        operaciones[0][5] = new Operacion(8, 4, '+');
        operaciones[1][0] = new Operacion(11, 3, '+');
        operaciones[1][1] = new Operacion(22, 5, '+');
        operaciones[1][2] = new Operacion(35, 16, '+');
        operaciones[1][3] = new Operacion(90, 9, '+');
        operaciones[1][4] = new Operacion(46, 33, '+');
        operaciones[1][5] = new Operacion(58, 10, '+');
        operaciones[2][0] = new Operacion(111, 23, '+');
        operaciones[2][1] = new Operacion(822, 137, '+');
        operaciones[2][2] = new Operacion(305, 216, '+');
        operaciones[2][3] = new Operacion(964, 49, '+');
        operaciones[2][4] = new Operacion(587, 197, '+');
        operaciones[2][5] = new Operacion(444, 333, '+');
        operaciones[3][0] = new Operacion(6, 3, '-');
        operaciones[3][1] = new Operacion(2, 0, '-');
        operaciones[3][2] = new Operacion(9, 2, '-');
        operaciones[3][3] = new Operacion(5, 5, '-');
        operaciones[3][4] = new Operacion(2, 3, '-');
        operaciones[3][5] = new Operacion(8, 4, '-');
        operaciones[4][0] = new Operacion(11, 3, '-');
        operaciones[4][1] = new Operacion(22, 5, '-');
        operaciones[4][2] = new Operacion(35, 16, '-');
        operaciones[4][3] = new Operacion(90, 9, '-');
        operaciones[4][4] = new Operacion(46, 33, '-');
        operaciones[4][5] = new Operacion(58, 10, '-');
        operaciones[5][0] = new Operacion(111, 23, '-');
        operaciones[5][1] = new Operacion(822, 137, '-');
        operaciones[5][2] = new Operacion(305, 216, '-');
        operaciones[5][3] = new Operacion(964, 49, '-');
        operaciones[5][4] = new Operacion(587, 197, '-');
        operaciones[5][5] = new Operacion(444, 333, '-');
        operaciones[6][0] = new Operacion(6, 3, 'x');
        operaciones[6][1] = new Operacion(2, 0, 'x');
        operaciones[6][2] = new Operacion(9, 2, 'x');
        operaciones[6][3] = new Operacion(5, 5, 'x');
        operaciones[6][4] = new Operacion(2, 3, 'x');
        operaciones[6][5] = new Operacion(8, 4, 'x');
        operaciones[7][0] = new Operacion(11, 3, 'x');
        operaciones[7][1] = new Operacion(22, 5, 'x');
        operaciones[7][2] = new Operacion(35, 16, 'x');
        operaciones[7][3] = new Operacion(90, 9, 'x');
        operaciones[7][4] = new Operacion(46, 33, 'x');
        operaciones[7][5] = new Operacion(58, 10, 'x');
        operaciones[8][0] = new Operacion(111, 23, 'x');
        operaciones[8][1] = new Operacion(822, 137, 'x');
        operaciones[8][2] = new Operacion(305, 216, 'x');
        operaciones[8][3] = new Operacion(964, 49, 'x');
        operaciones[8][4] = new Operacion(587, 197, 'x');
        operaciones[8][5] = new Operacion(444, 333, 'x');
        operaciones[9][0] = new Operacion(6, 3, '/');
        operaciones[9][1] = new Operacion(2, 1, '/');
        operaciones[9][2] = new Operacion(4, 2, '/');
        operaciones[9][3] = new Operacion(7, 7, '/');
        operaciones[9][4] = new Operacion(9, 3, '/');
        operaciones[9][5] = new Operacion(8, 2, '/');
        operaciones[10][0] = new Operacion(21, 3, '/');
        operaciones[10][1] = new Operacion(90, 45, '/');
        operaciones[10][2] = new Operacion(35, 7, '/');
        operaciones[10][3] = new Operacion(24, 6, '/');
        operaciones[10][4] = new Operacion(56, 8, '/');
        operaciones[10][5] = new Operacion(56, 7, '/');
        operaciones[11][0] = new Operacion(842, 421, '/');
        operaciones[11][1] = new Operacion(800, 200, '/');
        operaciones[11][2] = new Operacion(150, 50, '/');
        operaciones[11][3] = new Operacion(300, 60, '/');
        operaciones[11][4] = new Operacion(400, 100, '/');
        operaciones[11][5] = new Operacion(624, 208, '/');
        Opcion[][] opciones = new Opcion[12][6];
        opciones[0][0] = new Opcion(4, 3, 5);
        opciones[0][1] = new Opcion(0, 2, 20);
        opciones[0][2] = new Opcion(-1, 30, 11);
        opciones[0][3] = new Opcion(8, 10, 9);
        opciones[0][4] = new Opcion(7, 1, 5);
        opciones[0][5] = new Opcion(6, 4, 12);
        opciones[1][0] = new Opcion(14, 13, 15);
        opciones[1][1] = new Opcion(20, 25, 27);
        opciones[1][2] = new Opcion(11, 53, 51);
        opciones[1][3] = new Opcion(88, 90, 99);
        opciones[1][4] = new Opcion(79, 10, 57);
        opciones[1][5] = new Opcion(61, 68, 12);
        opciones[2][0] = new Opcion(233, 134, 234);
        opciones[2][1] = new Opcion(959, 958, 914);
        opciones[2][2] = new Opcion(511, 521, 111);
        opciones[2][3] = new Opcion(1000, 1013, 1029);
        opciones[2][4] = new Opcion(784, 171, 775);
        opciones[2][5] = new Opcion(666, 777, 888);
        opciones[3][0] = new Opcion(4, 3, 5);
        opciones[3][1] = new Opcion(0, 2, 20);
        opciones[3][2] = new Opcion(-1, 30, 7);
        opciones[3][3] = new Opcion(8, 0, 9);
        opciones[3][4] = new Opcion(7, -1, 5);
        opciones[3][5] = new Opcion(6, 4, 12);
        opciones[4][0] = new Opcion(4, 8, 5);
        opciones[4][1] = new Opcion(0, 17, 20);
        opciones[4][2] = new Opcion(19, 30, 7);
        opciones[4][3] = new Opcion(81, 0, 91);
        opciones[4][4] = new Opcion(17, 13, 15);
        opciones[4][5] = new Opcion(68, 48, 58);
        opciones[5][0] = new Opcion(88, 34, 234);
        opciones[5][1] = new Opcion(685, 958, 914);
        opciones[5][2] = new Opcion(89, 21, 111);
        opciones[5][3] = new Opcion(915, 917, 913);
        opciones[5][4] = new Opcion(380, 390, 490);
        opciones[5][5] = new Opcion(109, 111, 110);
        opciones[6][0] = new Opcion(14, 18, 15);
        opciones[6][1] = new Opcion(0, 2, 1);
        opciones[6][2] = new Opcion(11, 18, 28);
        opciones[6][3] = new Opcion(25, 30, 29);
        opciones[6][4] = new Opcion(6, 7, 5);
        opciones[6][5] = new Opcion(36, 24, 32);
        opciones[7][0] = new Opcion(88, 33, 34);
        opciones[7][1] = new Opcion(110, 120, 111);
        opciones[7][2] = new Opcion(530, 550, 540);
        opciones[7][3] = new Opcion(810, 917, 913);
        opciones[7][4] = new Opcion(1518, 1519, 4908);
        opciones[7][5] = new Opcion(580, 590, 510);
        opciones[8][0] = new Opcion(2553, 2554, 2555);
        opciones[8][1] = new Opcion(112714, 112614, 112514);
        opciones[8][2] = new Opcion(65880, 66880, 67880);
        opciones[8][3] = new Opcion(47236, 37236, 27236);
        opciones[8][4] = new Opcion(115640, 115639, 115638);
        opciones[8][5] = new Opcion(147852, 147832, 147812);
        opciones[9][0] = new Opcion(4, 8, 2);
        opciones[9][1] = new Opcion(0, 2, 1);
        opciones[9][2] = new Opcion(2, 1, 8);
        opciones[9][3] = new Opcion(5, 0, 1);
        opciones[9][4] = new Opcion(3, 7, 5);
        opciones[9][5] = new Opcion(6, 4, 2);
        opciones[10][0] = new Opcion(7, 8, 2);
        opciones[10][1] = new Opcion(0, 2, 1);
        opciones[10][2] = new Opcion(2, 5, 8);
        opciones[10][3] = new Opcion(5, 4, 1);
        opciones[10][4] = new Opcion(3, 7, 5);
        opciones[10][5] = new Opcion(6, 4, 8);
        opciones[11][0] = new Opcion(7, 8, 2);
        opciones[11][1] = new Opcion(0, 4, 1);
        opciones[11][2] = new Opcion(3, 5, 8);
        opciones[11][3] = new Opcion(5, 4, 1);
        opciones[11][4] = new Opcion(3, 4, 5);
        opciones[11][5] = new Opcion(3, 4, 8);
        for(int x=0; x<12; x++){
            ejercicios[x] = new Ejercicio(
                    operaciones[x], opciones[x], temasEjercicio[x].getText()
            );
        }
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
        System.gc();
    }
    
}
