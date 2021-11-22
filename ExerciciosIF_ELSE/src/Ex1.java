import java.util.Scanner;

public class Ex1 {

	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Escreva primeiro número: ");
		int num1 = input.nextInt();
		
		System.out.print("Escreva segundo número: ");
		int num2 = input.nextInt();
		
		if (num1 > num2) {
			System.out.println("Primeiro númedo é maior que o segundo. " + num1);
		}else {
			System.out.println("Segundo número é maior que o primeiro. " + num2);
		}
		
		input.close();
	}
}
