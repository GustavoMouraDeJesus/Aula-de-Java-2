package lista2;
import java.util.Scanner;

public class Exercicio13 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int Entre = 0;

        for (int i = 1; i <= 20; i++){
            System.out.println("Digite o " + i + "º número: ");
            int num = input.nextInt();
            if(num >= 0 && num <=100){
                Entre++;
            }
        }
        System.out.println("A quatidade de números entre 0 e 100 é: " + Entre);
    }
}
