package lista2;
import java.util.Scanner;

public class Exercicio4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = sc.nextLine();

        System.out.println("Digite um numero");
        int numeroUsuario = sc.nextInt();

        System.out.println("Digite uma quantidade de vezes para exibir seu nome");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Seu nome é: " + nome + ", e seu ID: " + numeroUsuario);
        }
    }
}
