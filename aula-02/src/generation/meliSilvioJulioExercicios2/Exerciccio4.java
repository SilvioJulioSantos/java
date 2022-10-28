package generation.meliSilvioJulioExercicios2;

import java.util.Scanner;

public class Exerciccio4 {

    public static void main(String[] args) {

        //Leitor do teclado
        Scanner entrada = new Scanner(System.in);

        int numero=0;

        //Entrada de dados
        System.out.println("Por favor, digite um número a ser verificado: ");
         numero   = entrada.nextInt();

        //Validação dos dados de entrada idade
        if (numero%2==0) {
            System.out.println(numero + " => é número par"+" e sua raiz => "+ Math.sqrt(numero));

        }else if (numero%2==1) {

            System.out.println(numero + " é número impar, elevado ao quadrado: "+ Math.pow(numero,2));
        }

        System.out.println("\nPrograma finalizado!!");
        entrada.close();

    }

}
