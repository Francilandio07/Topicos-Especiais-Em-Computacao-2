package algoritmos;

public class BuscaTernaria {

	public static int bt(int vet[], int n, int x) {
		int inicio = 0, fim = n - 1;

		while (inicio <= fim) {
			int meio_esquerdo = inicio + (fim - inicio) / 3;
			int meio_direito = fim - (fim - inicio) / 3;

			if (vet[meio_esquerdo] == x) {
				return meio_esquerdo;
			} else if (vet[meio_direito] == x) {
				return meio_direito;
			} else if (vet[meio_esquerdo] > x) {
				fim = meio_esquerdo - 1;
			} else if (vet[meio_direito] < x) {
				inicio = meio_direito + 1;
			} else {
				inicio = meio_esquerdo + 1;
				fim = meio_direito - 1;
			}
		}

		return -1;
	}

	public static void main(String[] args) {

		int vet[] = { 1, 2, 8, 10, 20, 40, 90, 99, 100, 106 };

		System.out.println(bt(vet, 10, 40));
	}
}
