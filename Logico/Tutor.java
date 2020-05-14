
package Logico;


public class Tutor {
    private String nombre,
                   correo,
                   contrasenia;
    private Ninio[] ninios;
    
    public Tutor(String nombre, String correo,
            String contrasenia, Ninio[] ninios){
        this.nombre=nombre;
        this.correo=correo;
        this.contrasenia=contrasenia;
        this.ninios=ninios;
    }
    
    public void destruir(){
        int tamanio=0,
            x=0;
        if(nombre!=null){
            nombre=null;
        }
        if(correo!=null){
            correo=null;
        }
        if(contrasenia!=null){
            contrasenia=null;
        }
        if(ninios!=null){
            tamanio=ninios.length;
            for(x=0; x<tamanio; x++){
                if(ninios[x]!=null){
                    ninios[x]=null;
                }
            }
        }
        System.gc();
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getCorreo(){
        return correo;
    }
    
    public boolean compararContrasenia(String ingresado){
        if(ingresado.equals(contrasenia)){
            return true;
        }
        return false;
    }
    
    public Ninio getNinios(int x){
        return ninios[x];
    }
    
    public Ninio[] getNinios(){
        return ninios;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setCorreo(String correo){
        this.correo=correo;
    }
    
    public void setContrasenia(String contrasenia){
        this.contrasenia=contrasenia;
    }
    
    public void setNinio(Ninio nuevo){
        int tamanio=0,
            x=0;
        if(ninios!=null){
            tamanio=ninios.length;
            Ninio[] nuevos = new Ninio[tamanio+1];
            for(x=0; x<tamanio; x++){
                nuevos[x]=ninios[x];
            }
            nuevos[x]=nuevo;
            ninios=nuevos;
        }
        else{
            ninios = new Ninio[1];
            ninios[0]=nuevo;
        }
    }
    
    public void eliminarNinio(int posicion){
        int tamanio=ninios.length,
            x=0,
            y=0;
        Ninio[] nuevos = new Ninio[tamanio-1];
        while(x<(tamanio-1)){
            if(y==posicion){
                ninios[y]=null;
                y++;
            }
            else{
                nuevos[x]=ninios[y];
                x++;
                y++;
            }
        }
        ninios=nuevos;
    }
}
