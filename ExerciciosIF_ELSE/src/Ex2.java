
	import java.util.*;
public class Ex2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Idade do candidato: ");
		int idade = scan.nextInt();
		
		if(idade >= 16) {
			System.out.println("O mesmo poderá votar");
		}else {
			System.out.println("Não poderá votar");
		}
		
		
		scan.close();
	}

}
