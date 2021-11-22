	import java.util.*;
	
	/*Tendo como entrada a altura e o sexo (codificado da seguinte forma:
1:feminino 2:masculino) de uma pessoa, construa um programa que
calcule e imprima seu peso ideal, utilizando as seguintes
Fórmulas:
- para homens: (72.7 * Altura) – 58
- para mulheres: (62.1 * Altura) – 44.7*/
	
	
public class Ex6 {
	
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Digite o sexo:\n[1] Masculino  \n[2] feminino ");
		int sexo = scan.nextInt();
		
		System.out.print("Digite altura: ");
		double altura = scan.nextDouble();
		
		double pesoIdeal = 0.0;
		
		if (sexo == 1) {
		 pesoIdeal = (72.7 * altura) - 58;
			System.out.println("Seu peso ideal é de: " + pesoIdeal + "kg");
		}else if (sexo == 2) {
			pesoIdeal = (62.1 * altura) - 44.7;
			System.out.println("Seu peso ideal é de: " + pesoIdeal + "kg");
		}
		
		
		scan.close();
	}

}
