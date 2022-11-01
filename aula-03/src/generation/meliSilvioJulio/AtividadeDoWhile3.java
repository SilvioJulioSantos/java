package generation.meliSilvioJulio;

import java.util.Scanner;

public class AtividadeDoWhile3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numeros = 0,contador=1;
        int somaNumerosPositivo =0;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Digite o " + contador + "° numero: ");
            numeros = scanner.nextInt();
            contador++;
            if (numeros > 0) {
                somaNumerosPositivo += numeros;
            }

        } while (numeros != 0);

        System.out.println("======================== Resultado final   =========================\n ");
        System.out.println("================================================================");
        System.out.println("A soma dos números positivos é: " + somaNumerosPositivo);
        System.out.println("================================================================");

        System.out.println("\nPrograma finalizado!!");
        entrada.close();

    }
}
