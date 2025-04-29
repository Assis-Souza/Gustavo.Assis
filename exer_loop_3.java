public class SomaVetor {
    public static void main(String[] args) {
        // Vetor pré-definido
        int[] numeros = {5, 8, 2, 10, 4, 7, 1, 9, 3, 6};
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        System.out.println("A soma de todos os elementos do vetor é: " + soma);
    }
}
