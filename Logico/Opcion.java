
package Logico;


public class Opcion {
    private int opcion1,
                opcion2,
                opcion3;
    
    public Opcion(int opcion1, int opcion2, int opcion3){
        this.opcion1=opcion1;
        this.opcion2=opcion2;
        this.opcion3=opcion3;
    }
    
    public int getOpcion(int n){
        switch (n) {
            case 1:
                return opcion1;
            case 2:
                return opcion2;
            case 3:
                return opcion3;
            default:
                return 0;
        }
    }
    
}
