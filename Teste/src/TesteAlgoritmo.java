import java.util.*;
public class TesteAlgoritmo {
	public static void main(String[] args) {
		
		int n1;
		int quero=0;
		for(int i = 0; i < 2; i++) {
			System.out.println("Digite um número");
			Scanner sc = new Scanner(System.in);
			n1 = sc.nextInt();
			
			if(n1>quero) {
				quero=n1;
			}
		}
		System.out.println(quero);
		
	}

}
