
package Logico;


public class Ejemplo {
    private Operacion[] operaciones;
    
    public Ejemplo(){
        int x;
        operaciones = new Operacion[6];
        for(x=0; x<6; x++){
            operaciones[0] = new Operacion();
        }
    }

    public Ejemplo(Operacion[] operaciones) {
        this.operaciones=operaciones;
    }
    
    public void destruir(){
        int tamanio=operaciones.length,
            x;
        for(x=0; x<tamanio; x++){
            if(operaciones[x]!=null){
                operaciones[x]=null;
            }
        }
        System.gc();
    }
    
}
