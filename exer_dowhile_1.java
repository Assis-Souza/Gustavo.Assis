package exercicios_dowhile; 
import  java.util.Scanner;
public class exer_dowhile_1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int numero; 

        do{
            System.out.println("Digite um número entre 1 e 100: ");
            numero  = scanner.nextInt();

            if (numero <1 || numero > 100){
                System.out.println("Número fora do intervalo! Tente novamente. ");

            }
        } while (numero <1 || numero >100); 

        System.out.println("Número validado: "+ numero);
        
        scanner.close();
    }
}
