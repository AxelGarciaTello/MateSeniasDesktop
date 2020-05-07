
package Logico;


public class Juego {
    private String[][] simbolos;
    
    public Juego(String[][] simbolos){
        this.simbolos=simbolos;
    }
    
    public void destruir(){
        if(simbolos!=null){
            simbolos=null;
        }
        System.gc();
    }
    
    public String getSimbolo(int x, int visible){
        return simbolos[x][visible];
    }
    
}
