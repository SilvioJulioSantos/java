package generation.meliSilvioJulio;

import java.util.Scanner;

public class AtividadeWhile2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int idade =0;
        int idadeMenor=0, idadeMaior=0,idadeNaoInclusa=0;

        while (idade > -1) {

            System.out.println("Digite sua idade:");
            idade=entrada.nextInt();

            //Processamento dos dados
            if (idade >1 && idade <=21) {
                idadeMenor++;

            }
            if (idade > 51) {
                idadeMaior++;

            }else if (idade >21 && idade <=51 ){
                idadeNaoInclusa++;
                System.out.println();
            }


        }

        System.out.println("============ Contagem final idades ============");
        System.out.printf("Pessoas menores de 21 anos: %d\n", idadeMenor);
        System.out.printf("Pessoas maiores de 50 anos: %d\n", idadeMaior);
        System.out.printf("Iædades maior 21 anos e menores 51 anos, que não faz parte das idades válidas: %d\n", idadeNaoInclusa);




        System.out.println("\nPrograma finalizado!!");
        entrada.close();
    }
}
