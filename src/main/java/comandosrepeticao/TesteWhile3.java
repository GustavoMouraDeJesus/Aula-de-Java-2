package comandosrepeticao;
import java.util.Scanner;

public class TesteWhile3 {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int pares = 0;
        int impares = 0;
        int n = 1;

        while(n<=10){
            System.out.println("Digite um número: ");
            int numero = entrada.nextInt();

            if (numero%2 == 0){
                pares++;
            }else{
                impares++;
            }
            n++;
        }
        System.out.println("Qtde de números pares: " + pares);
        System.out.println("Qtde de números impares: " + impares);
    }
}
