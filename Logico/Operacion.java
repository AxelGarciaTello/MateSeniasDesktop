
package Logico;


public class Operacion {
    private int numero1,
                numero2,
                respuesta;
    private char signo;
    
    public Operacion(){
        numero1=0;
        numero2=0;
        respuesta=0;
    }
    
    public Operacion(int numero1, int numero2, char signo){
        this.numero1=numero1;
        this.numero2=numero2;
        this.signo=signo;
    }
    
    public int getNumero1(){
        return numero1;
    }
    
    public int getNumero2(){
        return numero2;
    }
    
    public int getRespuesta(){
        calcularRespuesta();
        return respuesta;
    }
    
    private void calcularRespuesta(){
        switch(signo){
            case '+':
                respuesta=numero1+numero2;
            break;
            case '-':
                respuesta=numero1-numero2;
            break;
            case 'x':
                respuesta=numero1*numero2;
            break;
            case '/':
                respuesta=numero1/numero2;
            break;
        }
    }
    
}
