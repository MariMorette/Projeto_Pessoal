import java.util.*;
public class Q5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número");
		int n;
		n = sc.nextInt();
		for(int i = 0; i <= n; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		
	}

}
