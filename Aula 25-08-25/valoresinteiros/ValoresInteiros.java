
package valoresinteiros;
import java.util.Scanner;

public class ValoresInteiros {

    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       int [] pins = { 9, 3, 7, 2};
       
        System.out.println("Digite o numero que desja buscar: ");
        int procurar = teclado.nextInt();
        boolean achou = false;
        
        for(int i = 0; i < pins.length; i++){
            if(pins [i] == procurar){
                achou = true;
                break;
            }
        }
        
        if(achou){
            System.out.println("O numero que você procura está no array!");
        }else{
            System.out.println("O numero que você procura não está no array");
        }
           
       
    }
    
}
