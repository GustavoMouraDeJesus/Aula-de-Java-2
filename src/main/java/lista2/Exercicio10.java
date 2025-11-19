package lista2;
import java.util.Scanner;

public class Exercicio10 {
    static void main(String[] args) {
        Scanner tabuada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = tabuada.nextInt();
        System.out.println("\nTabuada do " + numero + ":");

        for (int i = 1; i <= 10 ; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));

        }
        }
    }

