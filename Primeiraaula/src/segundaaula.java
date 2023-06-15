import java.util.Scanner;

import javax.swing.JOptionPane;

public class segundaaula {
	public static void main(String[] args) {
		float nota, nota1 = 0;
		JOptionPane.showMessageDialog(null, "melhorou?", "aviso", JOptionPane.INFORMATION_MESSAGE);
		System.out.println("oi");
		Scanner sc = new Scanner(System.in);
		int n1;
		System.out.println("Digite um número");
		n1 = sc.nextInt();
		if (n1 == 2) {
			System.out.println("é dois");
		} else {
			System.out.println("não é dois");

		}
		switch (n1) {

		case 1:
			System.out.println("é um");
			break;

		case 2:
			System.out.println("é dois");
			break;
		case 3:
			System.out.println("é tres");
			break;
		case 4:
			System.out.println("é quatro");
			break;
		case 5:
			System.out.println("é cinco");
			break;
		}
		for (int i = 1; i <= 10; i++) {
			System.out.println("não devo fazer baguncinha na aula do titio math");
		}

		for (int i = 1; i <= 4; i++) {
			System.out.println("Digite a nota");
			nota = sc.nextFloat();
			nota1 = nota1 + nota;

		}
		float media = nota1 / 4;
		System.out.println("Media igual a " + media);

		if (media >= 6) {
			System.out.println("Vc esta APROVADO");
		}

		else if (media >= 2 && media < 6) {
			System.out.println("Recuperação");
		}

		else {
			System.out.println("Reprovado");
		}
	}
}
