package lista01;

import java.util.Scanner;

public class Ex11 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a base maior do trapezio: ");
		int Bmaior = sc.nextInt();
		System.out.println("Digite a base menor do trapezio: ");
		int Bmenor = sc.nextInt();
		System.out.println("Digite a altura do trapezio: ");
		int altura = sc.nextInt();
		int area = (Bmaior + Bmenor) * altura / 2;
		System.out.println("A area do trapezio e: " + area);
		
	}

}
