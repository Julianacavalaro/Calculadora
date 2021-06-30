import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int valorInvestido;
		float visualizaramAnuncioOriginal;
		float clicam;
		float compartilham;
		float novasVisualicoes;
		float maxVisualizacao;
		
		// 30 pessoas visualizam o an�ncio original (n�o compartilhado) a cada R$ 1,00 investido.
		// a cada 100 pessoas que visualizam o an�ncio 12 clicam nele.
		// a cada 20 pessoas que clicam no an�ncio 3 compartilham nas redes sociais.
		// cada compartilhamento nas redes sociais gera 40 novas visualiza��es.
		// o mesmo an�ncio � compartilhado no m�ximo 4 vezes em sequ�ncia
		// (1� pessoa -> compartilha -> 2� pessoa -> compartilha - > 3� pessoa -> compartilha -> 4� pessoa)
		
		System.out.println("Digite o valor investido:");
		valorInvestido = entrada.nextInt();
		
		visualizaramAnuncioOriginal = valorInvestido * 30;
		System.out.println( visualizaramAnuncioOriginal + " pessoas visualizaram o an�ncio original");

		clicam = (float) (visualizaramAnuncioOriginal*(0.12));
		System.out.println("Clicam "+clicam);
		
		compartilham = (float) (clicam * (0.15));
		System.out.printf("Compartilham: %.2f %n" ,compartilham);
		
		novasVisualicoes = (float) (compartilham * (40*40*40*40));
		System.out.printf("Novas vizualiza��es: %.2f %n" ,novasVisualicoes);

		maxVisualizacao = novasVisualicoes + visualizaramAnuncioOriginal;
		
		System.out.println();
		System.out.printf("Valor investido R$ %d %nN�mero estimado de visualiza��es: %.2f", valorInvestido, maxVisualizacao);
	}

}
