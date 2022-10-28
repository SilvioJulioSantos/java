package generation.meliSilvioJulioExercicios2;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        //Leitor do teclado
        Scanner entrada = new Scanner(System.in);

        int idade;

        //Entrada de dados
        System.out.println("Digite sua idade: ");
        idade = entrada.nextInt();

        if (idade < 10 || idade > 25) {
             System.out.println("Desculpas, a idade informada não está classificada na categoria de idades. \n");

             //Validação dos dados de entrada idade
         if (idade >= 10 && idade <= 14) {
                 System.out.println("Sua categoria é infantil:");

             } else if (idade >= 15 && idade <= 17) {

                 System.out.println("Sua categoria é juvenil:");

             } else if (idade >= 18 && idade <= 25) {

                 System.out.println("Sua categoria é adulto:");
             }
        }

        System.out.println("Programa finalizado !");
        entrada.close();

    }
}
