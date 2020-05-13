
package GUI;

import Control.CalificarEjercicioActionListener;
import Control.CerrarVentanaActionListener;
import Control.ReintentarEjercicioActionListener;
import Control.SeleccionarRespuestaActionListener;
import Logico.Ejercicio;
import Logico.Opcion;
import Logico.Progreso;
import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;

public class EjercicioFrame extends EjemploFrame {
    private JButton atras,
                    calificar,
                    reintentar;
    private JButton[] respuestas;
    private JTextField[] cajaRespuestas;
    private Container contenedor;
    private Ejercicio ejercicio;
    private Progreso progreso;
    
    public EjercicioFrame(Ejercicio ejercicio, Progreso progreso) {
        super(ejercicio);
        this.ejercicio=ejercicio;
        this.progreso=progreso;
        initComponents();
        super.ocultarRespuestas();
    }
    
    private void initComponents(){
        int a=0,
            b=0,
            c=0,
            d=1,
            e=2,
            x=60,
            y=200;
        contenedor = super.getContenedor();
        Opcion[] opciones = ejercicio.getOpciones();
        cajaRespuestas = new JTextField[6];
        respuestas = new JButton[18];
        for(a=0; a<18; a++){
            respuestas[a] = new JButton("000");
            respuestas[a].setSize(60, 25);
            respuestas[a].setLocation(x, y);
            y+=30;
            b++;
            if(b==3){
                y=200;
                x+=85;
                b=0;
            }
            respuestas[a].setBackground(new Color(47, 55, 74));
            respuestas[a].setForeground(new Color(255, 255, 255));
            respuestas[a].setBorder(null);
            respuestas[a].setText(String.valueOf(opciones[c].getOpcion(d)));
            cajaRespuestas[c] = super.getNumeros(e);
            respuestas[a].addActionListener(
                    new SeleccionarRespuestaActionListener(
                            respuestas[a].getText(), cajaRespuestas[c]
                    )
            );
            if(d==3){
                c++;
                d=1;
                e+=3;
            }
            else{
                d++;
            }
            contenedor.add(respuestas[a]);
        }
        reintentar = new JButton("Intentarlo otra vez");
        reintentar.setLocation(175, 300);
        reintentar.setSize(250,30);
        reintentar.setVisible(false);
        reintentar.setBackground(new Color(56, 87, 35));
        reintentar.setForeground(new Color(255, 255, 255));
        //reintentar.setBorder(null);
        reintentar.addActionListener(
                new ReintentarEjercicioActionListener(
                        cajaRespuestas, reintentar
                )
        );
        contenedor.add(reintentar);
        calificar = new JButton();
        calificar.setSize(50, 50);
        calificar.setIcon(
                new ImageIcon(
                        getClass().getResource("Iconos/Calificar.png")
                )
        );
        calificar.setLocation(540, 10);
        calificar.setBackground(new Color(56, 87, 35));
        calificar.setBorder(null);
        calificar.addActionListener(
                new CalificarEjercicioActionListener(
                        cajaRespuestas, progreso, ejercicio, reintentar
                )
        );
        contenedor.add(calificar);
        atras=super.getAtras();
        atras.addActionListener(
                new CerrarVentanaActionListener(this)
        );
    }
    
    @Override
    public void destruir(){
        int tamanio=0,
            x=0;
        super.destruir();
        if(atras!=null){
            atras=null;
        }
        if(respuestas!=null){
            tamanio=respuestas.length;
            for(x=0; x<tamanio; x++){
                if(respuestas[x]!=null){
                    respuestas[x]=null;
                }
            }
        }
        if(calificar!=null){
            calificar=null;
        }
        if(reintentar!=null){
            reintentar=null;
        }
        if(contenedor!=null){
            contenedor=null;
        }
        System.gc();
    }
    
}
