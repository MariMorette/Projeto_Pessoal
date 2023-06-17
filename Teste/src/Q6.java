import java.util.*;
public class Q6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome");
		String nome;
		nome = sc.nextLine();
		System.out.println("Nota:");
		int n1;
		n1 = sc.nextInt();
		System.out.println("Nota:");
		int n2;
		n2 = sc.nextInt();
		System.out.println("Nota:");
		int n3;
		n3 = sc.nextInt();
		System.out.println("Nota:");
		int n4;
		n4 = sc.nextInt();
		
		
		
		
		int media = (n1 + n2 + n3 + n4) / 4;
		if(media <= 6) {
			System.out.println(nome + " " + "sua média é: " + media + "......Reprovado");
		} else if(media > 6) {
			System.out.println(nome + " " + "sua média é: " + media + "......Aprovado");
		}
	}

}
