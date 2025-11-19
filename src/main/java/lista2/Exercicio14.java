package lista2;
import java.util.Scanner;

public class Exercicio14 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int Entre0100 = 0;
        int Entremeio = 0;
        int Entrefinal = 0;

        for (int i = 1; i <= 20; i++){
            System.out.println("Digite o " + i + "º número: ");
            int num = input.nextInt();
            if(num >= 0 && num <=100){
                Entre0100++;
            }if(num >= 101 && num <=200){
                Entremeio++;
            }if(num >= 201 && num <=300){
                Entrefinal++;
            }
        }
        System.out.println("A quatidade de números entre 0 e 100 é: " + Entre0100+".");
        System.out.println("A quatidade de números entre 101 e 200 é: " + Entremeio+".");
        System.out.println("A quatidade de números entre 201 e 300 é: " + Entrefinal+".");
    }
}