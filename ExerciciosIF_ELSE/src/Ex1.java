import java.util.Scanner;

public class Ex1 {

	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Escreva primeiro n�mero: ");
		int num1 = input.nextInt();
		
		System.out.print("Escreva segundo n�mero: ");
		int num2 = input.nextInt();
		
		if (num1 > num2) {
			System.out.println("Primeiro n�medo � maior que o segundo. " + num1);
		}else {
			System.out.println("Segundo n�mero � maior que o primeiro. " + num2);
		}
		
		input.close();
	}
}
