

package com.mycompany.venda;

import java.util.Scanner;

public class Venda {

    public static void main(String[] args) {
      
        Scanner teclado = new Scanner(System.in);
        
        Produto item1 = new Produto();
        Produto item2 = new Produto();
        Produto item3 = new Produto();
        Produto item4 = new Produto();
        Produto item5 = new Produto();
        
        
        System.out.println("Produto 1");
        System.out.println("Numero do produto: ");
        int numero = teclado.nextInt();
        item1.setNumero(numero);
        teclado.nextLine();//limpa o enter
        
        System.out.println("Descrição do produto: ");
        String descricao = teclado.nextLine();
        item1.setDescricao(descricao);
        
        System.out.println("Digite o preço do produto: ");
        double preco = teclado.nextDouble();
        item1.setPreco(preco);
        teclado.nextLine();

        
                System.out.println("\n Produto 2");
        System.out.println("Numero do produto: ");
        numero = teclado.nextInt();
        item2.setNumero(numero);
        teclado.nextLine();//limpa o enter
        
        System.out.println("Descrição do produto: ");
        descricao = teclado.nextLine();
        item2.setDescricao(descricao);
        
        System.out.println("Digite o preço do produto: ");
        preco = teclado.nextDouble();
        item2.setPreco(preco);
        teclado.nextLine();

                        System.out.println("\n Produto 3");
        System.out.println("Numero do produto: ");
        numero = teclado.nextInt();
        item3.setNumero(numero);
        teclado.nextLine();//limpa o enter
        
        System.out.println("Descrição do produto: ");
        descricao = teclado.nextLine();
        item3.setDescricao(descricao);
        
        System.out.println("Digite o preço do produto: ");
        preco = teclado.nextDouble();
        item3.setPreco(preco);
        teclado.nextLine();

        
                        System.out.println("\n Produto 4");
        System.out.println("Numero do produto: ");
        numero = teclado.nextInt();
        item4.setNumero(numero);
        teclado.nextLine();//limpa o enter
        
        System.out.println("Descrição do produto: ");
        descricao = teclado.nextLine();
        item4.setDescricao(descricao);
        
        System.out.println("Digite o preço do produto: ");
        preco = teclado.nextDouble();
        item4.setPreco(preco);
        teclado.nextLine();
        
        
                        System.out.println("\n Produto 5");
        System.out.println("Numero do produto: ");
        numero = teclado.nextInt();
        item5.setNumero(numero);
        teclado.nextLine();//limpa o enter
        
        System.out.println("Descrição do produto: ");
        descricao = teclado.nextLine();
        item5.setDescricao(descricao);
        
        System.out.println("Digite o preço do produto: ");
        preco = teclado.nextDouble();
        item5.setPreco(preco);
        teclado.nextLine();
        
        
        double total = item1.getPreco() + item2.getPreco() + item3.getPreco()
                + item4.getPreco() + item5.getPreco();
        
        System.out.println("O preço total da compra foi R$" + total);
    }
}
