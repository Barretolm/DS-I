package vetores;
import java.util.Scanner;

public class Vetores {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Quantos valores você ira digitar?");
        int tamanho = teclado.nextInt();
        int [] numeros = new int [tamanho];
        
        

        
        for(int i = 0; i < tamanho; i++ ){
            System.out.println("Digite o " + (i + 1) + "° valor: ");
            numeros [i] = teclado.nextInt();

        }
        int [] par = new int [tamanho];
        int [] impar = new int [tamanho];
        
        System.out.println("Valores:");
        for(int i = 0; i < numeros.length; i++)
            
        {   if(numeros [i] % 2 == 0 || numeros [i] == 0){
            par [i] = numeros [i];
            System.out.println("Valor: " + par [i]+ "é par e esta no indice" + i);
        }else if (numeros [i] % 2 != 0){
            impar [i] = numeros [i];
            System.out.println("Valor: " + impar [i] + "é impar e esta no indice " + i);
        }
        }
    }
    
}
