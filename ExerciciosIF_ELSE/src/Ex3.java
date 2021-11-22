	
	import java.util.*;

/*Escreva um programa que verifique a validade de uma senha fornecida
pelo usuário. A senha válida é o número 1234. Devem ser impressas as
seguintes mensagens:
ACESSO PERMITIDO caso a senha seja válida.
ACESSO NEGADO caso a senha seja inválida.*/
public class Ex3 {
	public static void main (String[] args) {
	Scanner input = new Scanner (System.in);
	
	System.out.print("Digite sua senha: ");
	int senha = input.nextInt();
	
	if (senha == 1234) {
		System.out.println("ACESSO PERMITIDO");
	}else {
		System.out.println("ACESSO NEGADO");
	}
		
		
		
		input.close();
	}

}
