
package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JOptionPane;


public class AbrirVideoActionListener implements ActionListener {
    private String video;
    
    public AbrirVideoActionListener(String video){
        this.video=video;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try{
            String so=System.getProperty("os.name");
            if(so.equals("Linux")){
                video="firefox "+video;
                Runtime.getRuntime().exec(video);
            }
            else if(so.equals("Windows 10") ||
                    so.equals("Windows 8.1") ||
                    so.equals("Windows 7")){
                video="rundll32 url.dll,FileProtocolHandler "+video;
                Runtime.getRuntime().exec(video);
            }
            else{
                JOptionPane.showMessageDialog(
                        null,
                        "Este apartado no es compatible con su sistema "
                                + "operativo.\nEsperelo proximamente.",
                        "Video",
                        0
                );
            }
        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
    
}
