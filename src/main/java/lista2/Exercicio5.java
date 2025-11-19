package lista2;
import java.util.Scanner;

public class Exercicio5 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int soma = 0;

        for(int i = 1; i<=10; i++){
            System.out.println("Digite o " + i + "º número ");
            int num = input.nextInt();
            soma += num;
        }
        System.out.println("O resultado da soma é: " + soma);
    }
}
