package exemplo.vetor;
import java.util.Scanner;

public class ExemploVetor {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int [] vetor = new int [5];
        
        for(int i = 0; i < 5; i++){
            System.out.println("vetor [" + i + "] =");
            vetor[i] = teclado.nextInt();
            
        }
        
        for(int i = 0; i < 5; i++){
            System.out.println("vetor[" + i + "] = " + vetor [i]);
        }
    }
    
}
