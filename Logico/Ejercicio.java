
package Logico;


public class Ejercicio extends Ejemplo {
    private Opcion[] opciones;
    
    public Ejercicio(Operacion[] operaciones, Opcion[] opciones, String tema){
        super(operaciones, tema);
        this.opciones=opciones;
    }
    
    @Override
    public void destruir(){
        int tamanio=0,
            x=0;
        super.destruir();
        if(opciones!=null){
            tamanio=opciones.length;
            for(x=0; x<tamanio; x++){
                if(opciones[x]!=null){
                    opciones[x]=null;
                }
            }
        }
        System.gc();
    }
    
    public Opcion[] getOpciones(){
        return opciones;
    }
    
}
