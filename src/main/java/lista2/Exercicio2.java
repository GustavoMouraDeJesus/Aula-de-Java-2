package lista2;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Exercicio2 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro numero entre 1 e 15");
        int n1 = input.nextInt();

        System.out.println("Digite o segundo numero entre 1 e 15");
        int n2 = input.nextInt();

        int soma = n1 + n2;

        System.out.println("A soma dos numeros é: " + soma);
    }
}

