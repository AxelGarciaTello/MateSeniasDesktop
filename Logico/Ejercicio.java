
package Logico;


public class Ejercicio extends Ejemplo {
    private Opcion[] opciones;
    
    public Ejercicio(Operacion[] operaciones,
            Opcion[] opciones, String tema){
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
    
    public boolean[] calificar(int[] respuestas,
            Progreso progreso){
        int tamanio=opciones.length,
            x=0,
            nuevoProgreso=0;
        boolean[] aciertos = new boolean[tamanio];
        for(x=0; x<tamanio; x++){
            if(super.getRespuesta(x)==respuestas[x]){
                aciertos[x]=true;
                nuevoProgreso++;
            }
            else{
                aciertos[x]=false;
            }
        }
        if(nuevoProgreso>progreso.getValor()){
            progreso.setValor(nuevoProgreso);
        }
        return aciertos;
    }
    
}
