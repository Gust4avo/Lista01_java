package lista01;

import java.util.Scanner;

public class Ex12 {
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		 
		System.out.println("Digite o raio do circulo: ");
		int raio = sc.nextInt();
		double area = Math.PI * Math.pow(raio, 2);
		System.out.println("A area do circulo e: "+ area);
		
		
		
	}

}
