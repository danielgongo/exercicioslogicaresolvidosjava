import java.util.Scanner;

/*As ma��s custam R$ 0,30 cada se forem compradas menos do que uma
d�zia, e R$ 0,25 se forem compradas pelo menos doze. Escreva um
programa que leia o n�mero de ma��s compradas, calcule e escreva o
valor total da compra. */

public class Ex4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Quantas ma��s deseja? ");
		double qtdMacas = scan.nextDouble();
		
		double totalMacas = 0.0;
		
		if (qtdMacas >= 12) {
			totalMacas = 0.25;
			totalMacas = totalMacas * qtdMacas;
			System.out.println("Total R$ " + totalMacas);
		}else if (qtdMacas < 12) {
			totalMacas = 0.30;
			totalMacas = totalMacas * qtdMacas;
			System.out.println("Valor total R$ " + totalMacas);
		}
		
		

		
		scan.close();
	}

}
