package lista2;
import java.util.Scanner;

public class Exercicio12 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pares = 0;

        for (int i = 1; i <= 20; i++){
            System.out.println("Digite o " + i + "º número: ");
            int num = input.nextInt();
            if(num % 2 == 0){
                pares++;
            }
        }
        System.out.println("A quatidade de números pares é: " + pares);
    }
}

