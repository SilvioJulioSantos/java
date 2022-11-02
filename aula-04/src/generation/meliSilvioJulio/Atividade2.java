package generation.meliSilvioJulio;

import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int [] vetor = new int[10];
        int soma =0, contador =0, numero=0;

        while (contador <10) {
            System.out.println("Informe o "+ (contador+1) + "° número inteiro:");
            vetor[contador]= entrada.nextInt();
            contador++;

            System.out.println();
        }
        System.out.println("Elementos nos índices ímpares:");
        contador=0;
        while (contador < 10) {

            if (vetor[contador] %2==1) {

                System.out.println(vetor[contador]+" \n");
           }
            contador++;

        }

        System.out.println("Elementos pares:");
        contador=0;

        while (contador <10) {

            if (vetor[contador] %2==0) {

                System.out.println(vetor[contador]);
            }
            contador++;

        }


        contador=0;

        while (contador <10) {

            soma += vetor[contador];

            contador++;
        }

        System.out.println("Resultado so cálculo:");
        System.out.println("Soma total: "+ soma);
        System.out.println("Média: "+ (soma/10));

        System.out.println("Programa finalizado !");
        //entrada.close();
        System.exit(contador);
    }

}
