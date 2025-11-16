package lista2;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();

        for(int i = 1; i <=10; i++){
            System.out.println("Seu nome é: " + nome);
        }
    }
}
