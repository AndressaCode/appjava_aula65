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
        
        System.out.println(product.name + ", " + product.price + ", " + product.quantity);
        
        sc.close();
    }
}