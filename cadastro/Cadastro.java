
package cadastro;


import java.util.Scanner;

public class Cadastro {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        Pessoa registro1 = new Pessoa();
        Pessoa registro2 = new Pessoa();
        Pessoa registro3 = new Pessoa();
        
        System.out.println("Registro 1 ");
        System.out.println("Digite o nome: ");
        String nome = teclado.nextLine();
        registro1.setNome(nome);

        
        System.out.println("Digite a idade: ");
        int idade = teclado.nextInt();
        registro1.setIdade(idade);
         teclado.nextLine();
       
        System.out.println("Codigo: ");
        int codigo = teclado.nextInt();
        registro1.setCodigo(codigo);
         teclado.nextLine();
        
        
        
        System.out.println("\n Registro 2 ");
        System.out.println("Digite o nome: ");
        nome = teclado.nextLine();
        registro2.setNome(nome);
        
        System.out.println("Digite a idade: ");
        idade = teclado.nextInt();
        registro2.setIdade(idade);
        teclado.nextLine();
        
        System.out.println("Codigo: ");
        codigo = teclado.nextInt();
        registro2.setCodigo(codigo);
         teclado.nextLine();
        
        
        System.out.println("\n Registro 3 ");
        System.out.println("Digite o nome: ");
        nome = teclado.nextLine();
        registro3.setNome(nome);

       
        System.out.println("Digite a idade: ");
        idade = teclado.nextInt();
        registro3.setIdade(idade);
         teclado.nextLine();
       
        System.out.println("Codigo: ");
        codigo = teclado.nextInt();
        registro3.setCodigo(codigo);
         teclado.nextLine();
        
        Pessoa MaisVelha = registro1;
        
        if(registro2.getIdade() > MaisVelha.getIdade()){
            MaisVelha = registro2;
        }
        
        if(registro3.getIdade() > MaisVelha.getIdade()){
            MaisVelha = registro3;
        }
        
        
                System.out.println("\nA pessoa com maior idade é: " + MaisVelha.getNome() +
                           " (" + MaisVelha.getIdade() + " anos)");
        
    }
    
}
