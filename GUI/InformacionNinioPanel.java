
package GUI;

import Control.EliminarNinioActionListener;
import Control.IrEditadoNinioActionListener;
import Control.IrRegistroNinioActionListener;
import Control.VerProgresoNinioListSelectionListener;
import Logico.Ninio;
import Logico.Tutor;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;


public class InformacionNinioPanel extends JPanel {
    private JLabel nombre;
    private JLabel[] etiquetas;
    private JList ninios;
    private JButton nuevo,
                    editar,
                    eliminar;
    private JProgressBar[] progresos;
    private Tutor tutor;
    private VerProgresoNinioListSelectionListener lista;
    
    
    public InformacionNinioPanel(Tutor tutor){
        this.tutor=tutor;
        initComponents();
    }
    
    private void initComponents(){
        int x=0,
            tamanio=0;
        this.setBackground(new Color(56, 87, 35));
        this.setLayout(new BorderLayout());
        nombre = new JLabel("Niños");
        nombre.setFont(new Font("Ubuntu", 0, 35));
        nombre.setForeground(new Color(255, 255, 255));
        nombre.setHorizontalAlignment(SwingConstants.CENTER);
        nombre.setVerticalAlignment(SwingConstants.CENTER);
        etiquetas = new JLabel[24];
        for(x=0; x<24; x++){
            etiquetas[x] = new JLabel();
            etiquetas[x].setFont(new Font("Ubuntu", 0, 20));
            etiquetas[x].setForeground(new Color(255, 255, 255));
            etiquetas[x].setHorizontalAlignment(SwingConstants.CENTER);
            etiquetas[x].setVerticalAlignment(SwingConstants.CENTER);
        }
        progresos = new JProgressBar[24];
        for(x=0; x<24; x++){
            progresos[x] = new JProgressBar();
            if(x<12){
                progresos[x].setMaximum(6);
            }
            else{
                progresos[x].setMaximum(24);
            }
            progresos[x].setValue(0);
        }
        JPanel ventana = new JPanel();
        ventana.setBackground(new Color(56, 87, 35));
        ventana.setLayout(new GridLayout(49,1));
        ventana.add(nombre);
        for(x=0; x<24; x++){
            ventana.add(etiquetas[x]);
            ventana.add(progresos[x]);
        }
        JScrollPane principal = new JScrollPane();
        principal.setViewportView(ventana);
        principal.setBorder(null);
        this.add(principal, BorderLayout.CENTER);
        Ninio[] listaNinios = tutor.getNinios();
        DefaultListModel model = new DefaultListModel<>();
        if(listaNinios!=null){
            tamanio=listaNinios.length;
            for(x=0; x<tamanio; x++){
                model.addElement("     "+listaNinios[x].getNombre()+"     ");
            }
        }
        ninios = new JList();
        ninios.setModel(model);
        ninios.setBackground(new Color(56, 87, 35));
        ninios.setForeground(new Color(255, 255, 255));
        ninios.setFont(new Font("Ubuntu", 0, 20));
        lista=new VerProgresoNinioListSelectionListener(
                        ninios, tutor.getNinios(), nombre, etiquetas, progresos
                );
        ninios.addListSelectionListener(lista);
        JScrollPane menu = new JScrollPane();
        menu.setViewportView(ninios);
        menu.setBorder(null);
        this.add(menu, BorderLayout.WEST);
        nuevo = new JButton("Nuevo");
        nuevo.setFont(new Font("Ubuntu", 0 ,20));
        nuevo.setBorder(null);
        nuevo.setBackground(new Color(47, 55, 74));
        nuevo.setForeground(new Color(255, 255, 255));
        nuevo.addActionListener(
                new IrRegistroNinioActionListener(this, tutor)
        );
        editar = new JButton("Editar");
        editar.setFont(new Font("Ubuntu", 0 ,20));
        editar.setBorder(null);
        editar.setBackground(new Color(47, 55, 74));
        editar.setForeground(new Color(255, 255, 255));
        editar.addActionListener(
                new IrEditadoNinioActionListener(this, tutor, ninios)
        );
        eliminar = new JButton("Eliminar");
        eliminar.setFont(new Font("Ubuntu", 0 ,20));
        eliminar.setBorder(null);
        eliminar.setBackground(new Color(227, 66, 51));
        eliminar.setForeground(new Color(255, 255, 255));
        eliminar.addActionListener(
                new EliminarNinioActionListener(
                        this, ninios, tutor
                )
        );
        JPanel gestion = new JPanel();
        gestion.setBackground(new Color(56, 87, 35));
        gestion.setLayout(new GridLayout(1,3));
        gestion.add(nuevo);
        gestion.add(editar);
        gestion.add(eliminar);
        this.add(gestion, BorderLayout.NORTH);
    }
    
    public void destruir(){
        int tamanio=0,
            x=0;
        if(nombre!=null){
            nombre=null;
        }
        if(etiquetas!=null){
            tamanio=etiquetas.length;
            for(x=0; x<tamanio; x++){
                if(etiquetas[x]!=null){
                    etiquetas[x]=null;
                }
            }
        }
        if(ninios!=null){
            ninios=null;
        }
        if(nuevo!=null){
            nuevo=null;
        }
        if(editar!=null){
            editar=null;
        }
        if(eliminar!=null){
            eliminar=null;
        }
        if(progresos!=null){
            tamanio=progresos.length;
            for(x=0; x<tamanio; x++){
                if(progresos[x]!=null){
                    progresos[x]=null;
                }
            }
        }
        if(lista!=null){
            lista=null;
        }
        System.gc();
    }
    
    public void actualizar(){
        int tamanio=0,
            x=0;
        Ninio[] listaNinios = tutor.getNinios();
        DefaultListModel model = new DefaultListModel<>();
        if(listaNinios!=null){
            tamanio=listaNinios.length;
            for(x=0; x<tamanio; x++){
                model.addElement(
                        "     "+listaNinios[x].getNombre()+"     "
                );
            }
        }
        ninios.setModel(model);
        ninios.removeListSelectionListener(lista);
        nombre.setText("Niños");
        tamanio=etiquetas.length;
        for(x=0; x<tamanio; x++){
            etiquetas[x].setText(" ");
            progresos[x].setValue(0);
        }
        lista=new VerProgresoNinioListSelectionListener(
                        ninios, tutor.getNinios(), nombre, etiquetas, progresos
        );
        ninios.addListSelectionListener(lista);
    }
    
}
