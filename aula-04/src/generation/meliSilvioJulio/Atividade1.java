package generation.meliSilvioJulio;

import java.util.Scanner;

public class Atividade1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
        int numero;

        System.out.println("Informe um número a ser localizado sua posição no vetor: ");
        numero = entrada.nextInt();

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {

                System.out.println("Número digitado foi o => [" + numero + "] localizado na posição: [" + i + "] do vetor:");
                break;

            } else if (i == vetor.length - 1) {

                System.out.println("O número digitado " + numero + " não foi licalizado!");
            }
        }

        System.out.println("Programa finalizado !!");
        entrada.close();
    }
}
