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
		
		// 30 pessoas visualizam o anúncio original (não compartilhado) a cada R$ 1,00 investido.
		// a cada 100 pessoas que visualizam o anúncio 12 clicam nele.
		// a cada 20 pessoas que clicam no anúncio 3 compartilham nas redes sociais.
		// cada compartilhamento nas redes sociais gera 40 novas visualizações.
		// o mesmo anúncio é compartilhado no máximo 4 vezes em sequência
		// (1ª pessoa -> compartilha -> 2ª pessoa -> compartilha - > 3ª pessoa -> compartilha -> 4ª pessoa)
		
		System.out.println("Digite o valor investido:");
		valorInvestido = entrada.nextInt();
		
		visualizaramAnuncioOriginal = valorInvestido * 30;
		System.out.println( visualizaramAnuncioOriginal + " pessoas visualizaram o anúncio original");

		clicam = (float) (visualizaramAnuncioOriginal*(0.12));
		System.out.println("Clicam "+clicam);
		
		compartilham = (float) (clicam * (0.15));
		System.out.printf("Compartilham: %.2f %n" ,compartilham);
		
		novasVisualicoes = (float) (compartilham * (40*40*40*40));
		System.out.printf("Novas vizualizações: %.2f %n" ,novasVisualicoes);

		maxVisualizacao = novasVisualicoes + visualizaramAnuncioOriginal;
		
		System.out.println();
		System.out.printf("Valor investido R$ %d %nNúmero estimado de visualizações: %.2f", valorInvestido, maxVisualizacao);
	}

}
