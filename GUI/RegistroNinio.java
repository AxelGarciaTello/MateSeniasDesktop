
package GUI;

import Control.AgregarNinioActionListener;
import Control.CerrarVentanaActionListener;
import Logico.Tutor;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;


public class RegistroNinio extends RegistroFrame {
    private JButton guardar,
                    cancelar;
    private InformacionNinioPanel ventana;
    private Tutor tutor;
    
    public RegistroNinio(InformacionNinioPanel ventana,
            Tutor tutor){
        super();
        this.ventana=ventana;
        this.tutor=tutor;
        initComponents();
        super.bloquearCorreo();
        super.getCorreo().setText(tutor.getCorreo());
    }
    
    private void initComponents(){
        guardar = new JButton("Guardar");
        guardar.setSize(240, 30);
        guardar.setLocation(30, 365);
        guardar.setFont(new Font("Ubuntu", 0, 20));
        guardar.setBorder(null);
        guardar.setBackground(new Color(47, 55, 74));
        guardar.setForeground(new Color(255, 255, 255));
        guardar.addActionListener(
                new AgregarNinioActionListener(
                        ventana, tutor,super.getNombre(), super.getCorreo(),
                        super.getContrasenia(), super.getConfirmacion(), this
                )
        );
        super.agregar(guardar);
        cancelar = new JButton("Cancelar");
        cancelar.setSize(240, 30);
        cancelar.setLocation(30, 400);
        cancelar.setFont(new Font("Ubuntu", 0, 20));
        cancelar.setBorder(null);
        cancelar.setBackground(new Color(227, 66, 51));
        cancelar.setForeground(new Color(255, 255, 255));
        cancelar.addActionListener(
                new CerrarVentanaActionListener(this)
        );
        super.agregar(cancelar);
    }
    
    @Override
    public void destruir(){
        super.destruir();
        if(guardar!=null){
            guardar=null;
        }
        if(cancelar!=null){
            cancelar=null;
        }
    }
    
}
