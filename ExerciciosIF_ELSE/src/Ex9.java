import java.util.Scanner;

public class Ex9 {
	
	/*Escreva um programa para ler 3 valores inteiros e escrever o maior deles.
Considere que o usu�rio n�o informar� valores iguais.*/

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Digite primeiro n�mero: ");
		int num1 = input.nextInt();
		
		System.out.print("Digite segundo n�mero: ");
		int num2 = input.nextInt();
		
		System.out.print("Digite terceiro n�mero: ");
		int num3 = input.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("Primeiro n�mero � o maior dos tr�s. " + num1);
		}else if (num2 > num1 && num2 > num3) {
			System.out.println("Segundo n�mero � o maior dos tr�s. " + num2);
		}else {
			System.out.println("Terceiro n�mero � o maior dos tr�s. " + num3);
		}
		
		
		input.close();

	}

}
