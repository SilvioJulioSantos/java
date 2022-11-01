package generation.meliSilvioJulio;

import java.util.Scanner;

public class AtividadeDoWhile3 {
    /**
     *
     * Escreva um algoritmo em Java, que leia números inteiros via
     * teclado, até que o número zero seja digitado. Ao final,
     * mostre na tela a soma de todos os números digitados,
     * que sejam positivos. Veja o exemplo abaixo:
     *
     * @param args
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        //Vetor que armazena 3 números
        //int [] numeros = new int[10];
        int numeros =0 ;
        int somaNumerosPositivoa = 0 , totalSoma = 0;
        int contador = 1;

        do {
            //Entrada de dados
            System.out.println("Digite " + contador + "º número");
             numeros = entrada.nextInt();
             contador++;
             //somaNumerosPositivoa = numeros;



            if (numeros > 0) {

              somaNumerosPositivoa =+numeros;

            }


        } while (numeros != 0);

        System.out.println("======================== Resultado final   =========================\n ");
        //System.out.println("A soma dos números positivos é: " + somaNumerosPositivoa);
        System.out.println("A soma dos números positivos é: " + somaNumerosPositivoa);
        System.out.println("\nPrograma finalizado!!");
        entrada.close();
    }
}
