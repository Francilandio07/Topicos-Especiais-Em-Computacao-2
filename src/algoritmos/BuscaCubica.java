package algoritmos;

public class BuscaCubica {

	public static void main(String[] args) {

		int vet[] = { 2, 4, 5, 6, 2, 4, 9, 4, 5, 6 };
		int numeroProcurado = 2;
		int posicao = -1;

		for (int i = 0; i < vet.length; i++) {
			for (int j = 0; j < vet.length; j++) {
				for (int l = 0; l < vet.length; l++) {
					if (vet[i] == numeroProcurado && 
							vet[j] == numeroProcurado && 
							    vet[l] == numeroProcurado)
						posicao = i;
				}
			}
		}
		if (posicao != -1)
			System.out.println("Posicao: " + posicao);
	}
}
