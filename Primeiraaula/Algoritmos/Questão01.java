import java.util.Scanner;

public class Questão01 {
	public static void main(String[] args) {
	
	    int n1 = 0;
	    for (int i = 0; i < 10; i++) {
	    	System.out.println("Digite um número");
	    	Scanner sc = new Scanner(System.in);
	    	int n2 = sc.nextInt();
	    	if (n2 > n1) {
	    		n1 = n2;
	    	}
		}
	    System.out.println("O valor maior é= " + n1);

}
}
