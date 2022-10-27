package generation.meliSilvioJulioExercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        DecimalFormat dt = new DecimalFormat("#.##");
        double nota1, nota2,nota3,nota4;

        System.out.println("Por favor, informe a primeira nota:");
        nota1 = entrada.nextDouble();

        System.out.println("Segunda nota:");
        nota2 = entrada.nextDouble();

        System.out.println("Terceira nota:");
        nota3 = entrada.nextDouble();

        System.out.println("Quarta nota:");
        nota4 = entrada.nextDouble();

        double media = (nota1+ nota2 + nota3 + nota4) /4;

        System.out.println("Média final: "+ dt.format(media));

    }
}
