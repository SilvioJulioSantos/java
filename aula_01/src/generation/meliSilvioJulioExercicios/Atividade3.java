package generation.meliSilvioJulioExercicios;

import java.util.Scanner;

public class Atividade3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int salarioBruto, adicionalNoturno, horasExtras, descontos = 0;

        System.out.println("Por favor, informe o seu salário bruto: ");
        salarioBruto = entrada.nextInt();

        System.out.println("Informe o seu o adicional noturno: ");
        adicionalNoturno = entrada.nextInt();

        System.out.println("Informe suas horas extras : ");
        horasExtras = entrada.nextInt();

        System.out.println("Informe o valor do descontos : ");
        descontos = entrada.nextInt();

        int salarioLiquido = (salarioBruto+ adicionalNoturno + (horasExtras*5)) - descontos;

        System.out.printf(" Salário líquido R$ %d  ", salarioLiquido);

    }
}
