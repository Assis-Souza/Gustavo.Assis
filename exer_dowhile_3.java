public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numeroSorteado = random.nextInt(20) + 1; // Gera número entre 1 e 20
        int palpite;
        int tentativas = 0;

        System.out.println("Tente adivinhar o número entre 1 e 20!");

        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroSorteado) {
                System.out.println("O número é maior que " + palpite + ".");
            } else if (palpite > numeroSorteado) {
                System.out.println("O número é menor que " + palpite + ".");
            }
        } while (palpite != numeroSorteado);

        System.out.println("Parabéns! Você acertou o número " + numeroSorteado + " em " + tentativas + " tentativas.");

        scanner.close();
    }
}
