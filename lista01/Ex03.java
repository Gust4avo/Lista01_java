package lista01;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		
		System.out.println("Digite o primeiro valor: ");
		int valor=sc.nextInt();
		System.out.println("Digite o segundo valor: ");
		int valor2 = sc.nextInt();
		int soma = valor + valor2;
		System.out.println("A soma dos dois valores e: " + soma);
		
	}
}
