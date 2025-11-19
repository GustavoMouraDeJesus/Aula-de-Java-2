package lista2;
import java.util.Scanner;

public class Exercicio9 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nomeMaisNovo = "";
        int idadeMaisNova = Integer.MAX_VALUE;
        for (int i = 1; i <= 10 ; i++) {
            System.out.println("Digite o nome da " + i + "ª pessoa: ");
            String nome = sc.nextLine();
            System.out.println("Digite a idade da " + i + "ª pessoa: ");
            int idade = sc.nextInt();
            sc.nextLine();
            if(idade < idadeMaisNova){
                idadeMaisNova = idade;
                nomeMaisNovo = nome;
            }
        }
        System.out.println("A pessoa mais nova é: " + nomeMaisNovo + " (" + idadeMaisNova + " anos)");
    }
}
