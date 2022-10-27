package generation.meliSilvioJulioExercicios;

import java.util.Scanner;

public class Atividade1 {


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int salario, abono =0;

        System.out.println("Informe o seu salário:");
        salario = entrada.nextInt();

        System.out.println("Informe o seu abono :");
        abono = entrada.nextInt();

        int salarioAtualizado = salario+ abono;

        System.out.printf("Salário atualizado R$ %d ", salarioAtualizado);
    }
}
