import java.util.ArrayList;

public class cotidiano {
public static void main(String[] args) {
	
	// ARRAY-POSIÇÕES CONHECIDAS
	String[] nomes = new String[3];
	nomes[0] = "Marina";
	nomes[1] = "Gabriel";
	nomes[2] = "Davi";
	
	// ARRAYLIST-POSIÇOES NÃO CONHECIDAS
	ArrayList<String> nomes2 = new ArrayList<>();
	nomes2.add("Marina2");
	nomes2.add("Gabriel2");
	nomes2.add("Davi2");
	
	// FOR VARIAÇÃO
	for (String nome : nomes2) 
	{
		System.out.println(nome);
	}
	
	// IF VARIAÇÃO
	String resultado = 2 == 2 ? "OI" : "TCHAU";
	System.out.println(resultado);
	
	// CONVERSÕES STRING -> INT
	String numero = "3";
	int num1 = Integer.parseInt(numero);
	// CONVERSÕES INT -> STRING
	int num2 = 2;
	String numero2 = String.valueOf(num2);
}
}
