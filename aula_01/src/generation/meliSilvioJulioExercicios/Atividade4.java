package generation.meliSilvioJulioExercicios;

import java.util.Scanner;

public class Atividade4 {

//    inteiro numero1, numero2, numero3, numero4
//
//
//    escreva("Digite numero 1: ")
//    leia(numero1)
//
//    escreva("Digite numero 2: ")
//    leia(numero2)
//
//    escreva("Digite numero 3: ")
//    leia(numero3)
//
//    escreva("Digite numero 4: ")
//    leia(numero4)
//
//    inteiro diferenca = (numero1 * numero2)- (numero3 * numero4)
//
//    escreva("\nResultado: ", diferenca)
//
//    se (diferenca > 0)
//    escreva("\nResultado positivo : ", diferenca)
//    senao
//    escreva("\nResultado negativo : ", diferenca)


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero1, numero2, numero3, numero4 = 0;


        System.out.println("Por favor, informe o primeiro numero: ");
        numero1 = entrada.nextInt();

        System.out.println("Informe o segundo numero: ");
        numero2 = entrada.nextInt();

        System.out.println("Informe o terceiro numero: ");
        numero3 = entrada.nextInt();

        System.out.println("Informe o quarto numero: ");
        numero4 = entrada.nextInt();

        int diferenca = (numero1 * numero2) - (numero3 * numero4);


        if (diferenca > 0) {
            System.out.printf("Diferença poditivo: %d ", diferenca);
        }else {
            System.out.printf("Diferença negativo: %d ", diferenca);
        }
    }
}
