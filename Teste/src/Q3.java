import java.util.*;
public class Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número");
		int n, soma;
		soma=0;
		n = sc.nextInt();
		for(int i = 0; i <= n; i++) {
			 soma = soma + i; 
		}
		System.out.println(soma);
	}

}
