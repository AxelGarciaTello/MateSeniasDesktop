
package GUI;

import Control.IrIngresoTutorActionListener;
import Control.RegistrarTutorActionListener;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;


public class RegistroTutor extends RegistroFrame {
    private JButton guardar,
                    cancelar;
    
    public RegistroTutor(){
        super();
        initComponents();
    }
    
    private void initComponents(){
        guardar = new JButton("Registrate");
        guardar.setSize(240, 30);
        guardar.setLocation(30, 365);
        guardar.setFont(new Font("Ubuntu", 0, 20));
        guardar.setBorder(null);
        guardar.setBackground(new Color(47, 55, 74));
        guardar.setForeground(new Color(255, 255, 255));
        guardar.addActionListener(
                new RegistrarTutorActionListener(
                        this, super.getNombre(), super.getCorreo(),
                        super.getContrasenia(), super.getConfirmacion()
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
                new IrIngresoTutorActionListener(this)
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
