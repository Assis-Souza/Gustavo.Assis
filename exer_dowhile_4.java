import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double somaNotas = 0;
        int quantidadeNotas = 0;
        String resposta;

        do {
            System.out.print("Digite a nota (0 a 10): ");
            double nota = scanner.nextDouble();

            if (nota >= 0 && nota <= 10) {
                somaNotas += nota;
                quantidadeNotas++;
            } else {
                System.out.println("Nota inválida! Digite uma nota entre 0 e 10.");
            }

            System.out.print("Deseja inserir outra nota? (s/n): ");
            resposta = scanner.next();
        } while (resposta.equalsIgnoreCase("s"));

        if (quantidadeNotas > 0) {
            double media = somaNotas / quantidadeNotas;
            System.out.printf("Média das notas: %.2f%n", media);
        } else {
            System.out.println("Nenhuma nota válida foi inserida.");
        }

        scanner.close();
    }
}
