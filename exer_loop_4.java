public class NumerosImpares {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) { // Se o número não é divisível por 2, é ímpar
                System.out.println(i);
            }
        }
    }
}
