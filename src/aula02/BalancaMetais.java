package aula02;

import java.util.Scanner;

public class BalancaMetais {

    public static void main(String[] args) {

        float ouro, prata, bronze;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor do Ouro: ");
        ouro = leitor.nextFloat();
        System.out.println("Digite o valor da Prata: ");
        prata = leitor.nextFloat();
        System.out.println("Digite o valor do Bronze: ");
        bronze = leitor.nextFloat();

        if (ouro > prata) {
            if (ouro > bronze) {
                System.out.println("Ouro é o matal mais pesado!");
            } else {
                System.out.println("Bronze é o metal mais pesado!");
            }
        } else {
            if (prata > bronze) {
                System.out.println("Prata é o metal mais pesado!");
            } else {
                System.out.println("Bronze é o metal mais pesado!");
            }
        }

    }
}
