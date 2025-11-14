package comandosrepeticao;
import  java.util.Scanner;

public class TestFor2 {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dgite a tabuada desejada: ");
        int tabuada = entrada.nextInt();
        for(int n = 1; n<=10; n++){
            int resultado = tabuada * n;
            System.out.println(tabuada + " x " + n + " = " + resultado);
        }
    }
}
