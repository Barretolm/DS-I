
package testaarrayaluno;
import java.util.Scanner;

public class TestaArrayAluno {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Aluno [] turma = new Aluno [1];
        
        for(int i = 0; i < turma.length; i++){
        turma[i] = new Aluno();
        
        System.out.println("Digite o nome do " + (i + 1) + " aluno: ");
        turma[i].setNome(teclado.nextLine());
        
        System.out.println("Digite a primeira nota do aluno: ");
        turma[i].setNota1(teclado.nextDouble());
        
        System.out.println("Digite a segunda nota do aluno:");
        turma[i].setNota2(teclado.nextDouble());
        
        teclado.nextLine();
    }
        for(int i = 0; i < turma.length; i++){
           double total = turma[i].getNota1() + turma[i].getNota2();

            System.out.println("Aluno: "+turma[i].getNome() + "Nota media:"+turma[i].CalculaMedia());
            
        }
        
        
    }
    
}
