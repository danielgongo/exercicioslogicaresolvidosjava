
	import java.util.*;
public class Ex_Switch {

	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("----------CALCULADORA BÁSICA----------");
		
		System.out.print("Digite um número: ");
		double num1 = input.nextDouble();
		
		System.out.print("Digite outro número: ");
		double num2 = input.nextDouble();
		
		System.out.println("Qual operação deseja usar: \n + = soma; \n - = subtração; \n / = divisão; \n * = multiplicação");
		String operacao = input.next();
		
		double resultado = 0;
		
		switch (operacao) {
		case "+": resultado = num1 + num2; break;
		case "-": resultado = num1 - num2; break;
		case "/": resultado = num1 / num2; break;
		case "*": resultado = num1 * num2; break;
		default: System.out.println("Operação inválida!");
		}
		
		System.out.println("Resultado da operação: " + resultado);
		input.close();
	}
}
