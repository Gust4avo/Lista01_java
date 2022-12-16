package lista01;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Digite o valor da Diagonal maior: ");
		int diagMaior =sc.nextInt();
		System.out.println("Digite o valor da Diagoinal menor: ");
		int diagMenor = sc.nextInt();
		int area = diagMaior * diagMenor / 2;
		System.out.println("A area do losango é " + area);
		
	}
}
