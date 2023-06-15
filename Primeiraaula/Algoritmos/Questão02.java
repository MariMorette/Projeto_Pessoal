import java.util.Scanner;

public class Questão02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome");
		String nome= sc.nextLine();
		
		System.out.println("Digite um número");
	    int n1 = sc.nextInt();
	    	
	    System.out.println("Digite outro número");
	    int n2 = sc.nextInt();
	    	
	    int resultado = n1 * n2;
	    	
	    System.out.println(nome + " " + resultado);
	    	
	}
}
