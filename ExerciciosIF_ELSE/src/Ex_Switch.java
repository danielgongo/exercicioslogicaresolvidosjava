
	import java.util.*;
public class Ex_Switch {

	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("----------CALCULADORA B�SICA----------");
		
		System.out.print("Digite um n�mero: ");
		double num1 = input.nextDouble();
		
		System.out.print("Digite outro n�mero: ");
		double num2 = input.nextDouble();
		
		System.out.println("Qual opera��o deseja usar: \n + = soma; \n - = subtra��o; \n / = divis�o; \n * = multiplica��o");
		String operacao = input.next();
		
		double resultado = 0;
		
		switch (operacao) {
		case "+": resultado = num1 + num2; break;
		case "-": resultado = num1 - num2; break;
		case "/": resultado = num1 / num2; break;
		case "*": resultado = num1 * num2; break;
		default: System.out.println("Opera��o inv�lida!");
		}
		
		System.out.println("Resultado da opera��o: " + resultado);
		input.close();
	}
}
