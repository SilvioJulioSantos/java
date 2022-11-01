package generation.meliSilvioJulio;

import java.util.Scanner;

public class AtividadeFor1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        //Vetor que armazena 3 números
        int numeros=0;
        int coontador = 10 ;

        int quantidadeNumeroImpar = 0,quantidadeNumeroPares=0;


        for (int i = 0; i < coontador; i++ ) {

            //Entrada de dados
            System.out.println("Digite "+ (i+1 )+ "º número");
            numeros = entrada.nextInt();

            //Processamento dos dados
            if (numeros %2==0) {
                quantidadeNumeroPares++;

            }if (numeros% 2 == 1) {
                quantidadeNumeroImpar++;
            }

        }
        //Saída de dados
        System.out.println("======================== Resultado final   =========================\n ");
        System.out.println("Total de números pares: " + quantidadeNumeroPares);
        System.out.println("Total de números ímpares: "+ quantidadeNumeroImpar);

        System.out.println("\nPrograma finalizado!!");
        entrada.close();
    }
}
