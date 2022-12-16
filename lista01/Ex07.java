package lista01;

import java.util.Scanner;

public class Ex07 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Digite a base do retangulo: ");
		int base = sc.nextInt();
		System.out.println("Digite a altura do retangulo: ");
		int altura = sc.nextInt();
		int result = base * altura;
		
		System.out.println("A area do retangulo e: " + result);
		
	}

}
