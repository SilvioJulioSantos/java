package generation.meliSilvioJulioExercicios2;
import java.util.Arrays;
import java.util.Scanner;

public class Exerciccio2 {

    public static void main(String[] args) {

        //Leitor do teclado
        Scanner entrada = new Scanner(System.in);

        //Faça um programa que entre com três números e coloque em ordem crescente.
        //Vetor que armazena 3 números
        int [] numeros = new int[3];

        //Entrada de dados
        for (int i = 0; i < numeros.length; i++ ) {
            System.out.println("Digite "+(i+1)+ "º número");
            numeros[i] = entrada.nextInt();
        }

        //Usando a biblioteca sort para organizar os números
        Arrays.sort(numeros);

        //Saida dos números em ordem
        System.out.print("Ordem crescente:   ");
        for (int j = 0; j < numeros.length; j++) {

            System.out.print(numeros[j]+ "  ");
        }

    }
}
