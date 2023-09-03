package algoritmos;

public class BuscaQuadratica {

	
		
	public static void main(String[] args) {

		int vet[] = { 2, 4, 5, 6, 2, 4, 9, 4, 5, 6 };
		int numeroProcurado = 2;
		int contador = 0;
		int posicao = -1;
		boolean entrou = false;

		for (int i = 0; i < vet.length; i++) {
			for (int j = i; j < vet.length; j++) {
				if (vet[i] == numeroProcurado) {
					if (!entrou) {
						posicao = i;
						if (vet[j] == numeroProcurado) {
							contador++;
						}
					}
				}
			}
			if (contador > 0)
				entrou = true;
		}
		if (entrou)
			System.out.println("Posicao: " + posicao + " - contador de repeticao: " + contador);
	}
}
