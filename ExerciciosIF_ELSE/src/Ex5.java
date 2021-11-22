import java.util.Scanner;

/*Escreva um programa para ler 3 valores inteiros (considere que não
serão lidos valores iguais) e escrevê-los em ordem crescente.*/
public class Ex5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Escreva 1º número: ");
		int num1 = scan.nextInt();
		
		System.out.print("Escreva 2º Número: ");
		int num2 = scan.nextInt();
		
		System.out.print("Escreva 3º número: ");
		int num3 = scan.nextInt();
		
		if (num1 < num2 && num1 < num3) {
			System.out.println("Ordem crescente: " + num1 + ";" + num2 + ";" + num3);
		}else if (num2 < num1 && num2 < num3) {
			System.out.println("Ordem crescente: " + num2 + ";" + num1 + ";" + num3);
			
		}else if (num3 < num1 && num3 < num2) {
			System.out.println("Ordem crescente: " + num3 + ";" + num2 + ";" + num1);
		}

		scan.close();
	}

}
