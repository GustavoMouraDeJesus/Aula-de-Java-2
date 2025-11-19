package lista2;
import java.util.Scanner;

public class Exercicio6_7_8 {
    static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        int soma = 0;
        int maiores = 0;

        for(int i =1; i <=20; i++){
            System.out.println("Digite a idade da " + i + "º pessoa ");
            int num = imput.nextInt();
            soma += num;
            if(num >=18){
                maiores++;
            }
        }
        System.out.println("A soma das idades é: " + soma);
        System.out.println("A média das idade é: " + soma/20);
        System.out.println(maiores + " pessoas são maiores de idade.");
    }
}
