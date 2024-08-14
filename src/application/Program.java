package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		Product p = new Product();
		
		System.out.println("Enter product data: ");
		System.out.println("Name:");
		
		String name = sc.next();
		
		System.out.println("Price:");
		double price = sc.nextDouble();
		
		p = new Product(name, price);
		
		p.setName("Computar"); // Usando o Set para mudar mudar sem quebrar o sistema com Encapsulamento
		System.out.println("Name uptaded:" + p.getName()); // Usando Get para pegar o name 
		p.setPrice(1200);
		System.out.println("Price uptaded: " + p.getPrice());
		
		
		System.out.println();
		System.out.println("Product data: ");
		
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock:");
		int quantity = sc.nextInt();
		p.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: "+ p);
		
		
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock:");
		quantity = sc.nextInt();
		p.removeProducts(quantity);

		System.out.println();
		System.out.println("Updated data: "+ p);
		
		sc.close();

	}

}
