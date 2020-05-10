
package Logico;


public class Juego {
    private String tema;
    private String[][] simbolos;
    
    public Juego(String[][] simbolos, String tema){
        this.simbolos=simbolos;
        this.tema=tema;
    }
    
    public void destruir(){
        if(simbolos!=null){
            simbolos=null;
        }
        if(tema!=null){
            tema=null;
        }
        System.gc();
    }
    
    public String getSimbolo(int x, int visible){
        return simbolos[x][visible];
    }
    
    public String getTema(){
        return tema;
    }
    
    public boolean[] calificar(String[] respuestas,
            Progreso progreso){
        int tamanio=respuestas.length,
            x=0,
            nuevoProgreso=0;
        boolean[] aciertos = new boolean[tamanio];
        for(x=0; x<tamanio; x++){
            if(simbolos[x][0].equals(respuestas[x])){
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
