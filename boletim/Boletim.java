
package boletim;

import java.util.Scanner;

public class Boletim {

    
    public static void main(String[] args) {
       
        Scanner teclado = new Scanner(System.in);
        
        Nota[] b = new Nota[4];
        
        int media = 0;
        int total = 0;
        int contador = 0;
        
        for(int i = 0; i < b.length; i++){
            b[i] = new Nota();
            
            System.out.println("Digite a nota do " + (i + 1) + " bimestre");
            int nota = teclado.nextInt();
            b[i].setNota(nota);
            
            total += nota;
            
            contador += 1;
            
            media = total / contador;
        }
           System.out.println("A media das notas é " + media);
    }    
    
    

