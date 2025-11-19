package lista2;
import java.util.Scanner;

public class Exercicio15 {
    static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numeroUsuario = 0;
        int soma = 0;

        while(numeroUsuario >= 0){
            System.out.println("Digite um numero: ");
            numeroUsuario = leitor.nextInt();
            soma = soma + numeroUsuario;

        }
        System.out.println("A soma dos numeros é: " + soma);
    }
}
