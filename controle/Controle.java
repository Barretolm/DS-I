package controle;
import java.util.Scanner;

public class Controle {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Documento [] doc = new Documento [3];
       
        
        for(int i =0; i < doc.length; i++){
           

            System.out.println("------ Documento " + (i+1) + " ------");
            
            System.out.println("Digite o titulo:");
            String titulo = teclado.nextLine();
            
            System.out.println("Digite o valor:");
            double valor = teclado.nextDouble();
           
            System.out.println("Digite o numero");
            int numero = teclado.nextInt();
            
            teclado.nextLine();
            
             doc[i] = new Documento(numero, titulo, valor);
        }
        
        int maior = 0, menor = 0;
        
        double vtotal = 0, media;
        
        for(int i = 1; i < doc.length; i++){
            if(doc[i].getValor() < doc[menor].getValor()){
                menor = i;
            }
            if(doc[i].getValor() > doc[maior].getValor()){
                maior = i;
            }
        }
        
        for(int i = 0; i < doc.length; i++){
            vtotal += doc[i].getValor();
            
        }
        
            media = vtotal / doc.length;
           
        System.out.println("O maior valor foi: " + doc[menor].getValor() + "/nTitulo: " + doc[menor].getTitulo());
        System.out.println("O maior valor foi: " + doc[maior].getValor() + "/nTitulo: " + doc[menor].getTitulo());
        
        System.out.println("O total dos valores foi: " + vtotal);
        System.out.println("A media foi: " + media);
        
        teclado.close();
        
    }
    
}
