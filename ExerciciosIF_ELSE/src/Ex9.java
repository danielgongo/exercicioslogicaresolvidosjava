import java.util.Scanner;

public class Ex9 {
	
	/*Escreva um programa para ler 3 valores inteiros e escrever o maior deles.
Considere que o usuário não informará valores iguais.*/

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Digite primeiro número: ");
		int num1 = input.nextInt();
		
		System.out.print("Digite segundo número: ");
		int num2 = input.nextInt();
		
		System.out.print("Digite terceiro número: ");
		int num3 = input.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("Primeiro número é o maior dos três. " + num1);
		}else if (num2 > num1 && num2 > num3) {
			System.out.println("Segundo número é o maior dos três. " + num2);
		}else {
			System.out.println("Terceiro número é o maior dos três. " + num3);
		}
		
		
		input.close();

	}

}
