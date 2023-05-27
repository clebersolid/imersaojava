package aula02;

import java.util.Scanner;

public class DesvioComposto {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double doacao, investimento = 0, usoImediato = 0;
        System.out.println("Por favor, digite o valor da doação: ");
        doacao = leitor.nextDouble();

        if (doacao < 1) {
            System.out.println("Valor inválido!");

        } else if (doacao >= 1 && doacao < 1000.00) {
            investimento = doacao * 0.05;
            usoImediato = doacao - investimento;
            System.out.println("A doação de R$" + doacao + " implica em um investimento de R$" + investimento + " , restando R$" + usoImediato + " para uso imediato");
        } else {
            investimento = doacao * 0.15;
            usoImediato = doacao - investimento;
            System.out.println("A doação de R$" + doacao + " implica em um investimento de R$" + investimento + " , restando R$" + usoImediato + " para uso imediato");
        }



    }
}
