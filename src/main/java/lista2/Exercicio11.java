package lista2;
import java.util.Scanner;

public class Exercicio11 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numeroUsuario = 0;
        int maiores = 0;

        for (int i = 1; i <= 20; i++){
            System.out.println("Digite o " + i + "º número: ");
            int num = input.nextInt();
            if(num > 8){
                maiores++;
            }
            System.out.println("A quatidade de números maiores que 8 é: " + maiores);
        }
    }
}
