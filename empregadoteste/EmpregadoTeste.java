
package empregadoteste;

import java.util.Scanner;

public class EmpregadoTeste {

    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int codigo;
        String nome;
        String sobrenome;
        double salario;
        
        Empregado[] empregado = new Empregado [2];
        
        for(int i =0; i < empregado.length; i++){
            empregado[i] = new Empregado();
            
            System.out.println("Empregado " + (i + 1));
            
            System.out.println("Digite o codigo do " + (i + 1) + "empregado: ");
            codigo = teclado.nextInt();
            teclado.nextLine(); 
            empregado[i].setCodigo(codigo);
            
            System.out.println("Digite o nome do " + (i + 1) + " empregado");
            nome = teclado.nextLine();
            empregado[i].setNome(nome);
            
            System.out.println("Digite o sobrenome");
            sobrenome = teclado.nextLine();
            empregado[i].setSobrenome(sobrenome);
            
            System.out.println("Digite o salario do " + (i + 1) + "empregado");
            salario = teclado.nextDouble();
            teclado.nextLine();
            empregado[i].setSalariomensal(salario);
            
            
        }
        
  System.out.println("\n--- Salário Anual dos Empregados ---");
for (int i = 0; i < empregado.length; i++) {
    System.out.println("Empregado " + (i + 1) + ": " + empregado[i].getNome());
    System.out.println("Salário mensal: R$" + empregado[i].getSalariomensal());
    System.out.println("Salário anual: R$" + empregado[i].getSalarioanual());
    System.out.println("-----------------------------");
}
        
    }
}
