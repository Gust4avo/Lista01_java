package lista01;

import java.util.Scanner;

public class Ex06 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Digite o primeiro valor: ");
		int valor1 = sc.nextInt();
		System.out.println("Digite o segundo valor: ");
		int valor2 =sc.nextInt();
		int div = valor1 / valor2;
		
		System.out.println(valor1 + " / " + valor2 + "=" + div);		
	}

}
