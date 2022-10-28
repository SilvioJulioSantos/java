package generation.meliSilvioJulioExercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {

        //Leitura do teclado ===
        Scanner entrada = new Scanner(System.in);

        DecimalFormat dt = new DecimalFormat("#.##");

        // Variaveis do tioo double
        double nota1, nota2,nota3,nota4;

        //Entrada e leitura de dados digitado pelo usuario
        System.out.println("Por favor, informe a primeira nota:");
        nota1 = entrada.nextDouble();

        System.out.println("Segunda nota:");
        nota2 = entrada.nextDouble();

        System.out.println("Terceira nota:");
        nota3 = entrada.nextDouble();

        System.out.println("Quarta nota:");
        nota4 = entrada.nextDouble();

        //Calculando media e atribuindo o valor a variavel media
        double media = (nota1+ nota2 + nota3 + nota4) /4;

        System.out.println("Média final: "+ dt.format(media));

    }
}
