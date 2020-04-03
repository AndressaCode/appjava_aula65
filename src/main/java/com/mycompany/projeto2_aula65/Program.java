package com.mycompany.projeto2_aula65;

import entities.Product;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Andressa Silva
 */
public class Program {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Product product = new Product();
        
        System.out.println("--DADOS DO PRODUTO--");
        System.out.println("Nome: ");
        product.name = sc.nextLine();
        System.out.println("Preço: ");
        product.price = sc.nextDouble();
        System.out.println("Quantidade em estoque: ");
        product.quantity = sc.nextInt();
        
        System.out.println("Product data " + product);
        
        System.out.print("Informe quantidade do produto para ser adicionado "
                + "ao estoque: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        
        System.out.println();
        System.out.println("Updated data " + product);
        
        System.out.println();
        System.out.print("Informe numero de produtos para remover do estoque:");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        
        System.out.println();
        System.out.println("Updated data: " + product);
        
        sc.close();
    }
}