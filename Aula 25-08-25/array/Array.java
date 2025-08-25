
package array;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        String [] carros ={"ferrari", "fusca", "camaro", "uno"};
        System.out.println("Tamanho do array: " + carros.length);
        for (int i = 0; i < carros.length; i=i+1){
            System.out.println("carros ["+i+"] = " + carros[i]);
        }
    }
    
}
