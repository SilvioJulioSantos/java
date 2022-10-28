package generation.meliSilvioJulioExercicios;

import java.util.Scanner;

public class Atividade1 {


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int salario, abono =0;

        //Entrada de dados
        System.out.println("Informe o seu salário:");
        salario = entrada.nextInt();

        System.out.println("Informe o seu abono :");
        abono = entrada.nextInt();

        //Processamento de dados
        int salarioAtualizado = salario+ abono;

        //Saida dos dados processados
        System.out.printf("Salário atualizado R$ %d ", salarioAtualizado);
    }
}
