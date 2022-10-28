package generation.meliSilvioJulioExercicios2;

import java.util.Scanner;

public class Exerciocio1 {

    public static void main(String[] args) {

        //Leitor do teclado
        Scanner entrada = new Scanner(System.in);

        //Variáveis do tipo inteiro
        int numero1, numero2, numero3;

        //Entrada de dados
        System.out.println("Por favor,o primeira número:");
        numero1 = entrada.nextInt();

        System.out.println("Segunda número:");
        numero2 = entrada.nextInt();

        System.out.println("Terceira número:");
        numero3 = entrada.nextInt();

        // Se número for igual a zero não ser executado o programa
         if (numero1 ==0 && numero2 ==0 && numero3 ==0) {
             System.out.println("Por favor, informe um numero maior que zero=[0]!");
         }

        //Processamento de dados com estrutura de decisão
        else if (numero1 > numero2 && numero1 > numero3) {
            //Saída dos dados
            System.out.println("Numero " +numero1+ " é o maior.");

        } else if (numero2 > numero1 && numero2 > numero3) {
            //Saída dos dados
            System.out.println("Numero " +numero2+ " é o maior.");

        }else {
            //Saída dos dados
            System.out.println("Numero " +numero3+ " é o maior.");
        }

        System.out.println("Programa finalizado !");
        entrada.close();
    }
}
