package aula01;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        double real, conversor = 5.4;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor em dólares: ");
        double dolar = leitor.nextDouble();
        leitor.close();

        real = dolar * conversor;
        System.out.println("O valor da conversão em reais é de: " + String.format("%.2f" , real)  + "R$");


    }
}
