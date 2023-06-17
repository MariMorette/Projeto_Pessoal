import java.util.*;
public class Q4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número");
		int n1=0;
		n1= sc.nextInt();
	
		if(n1 < 0) {
			System.out.println("Negativo");
		} else if (n1 == 0) {
			System.out.println("Zero");
		} else {
			System.out.println("Positivo");
		}
		
	}

}
