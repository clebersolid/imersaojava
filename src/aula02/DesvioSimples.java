package aula02;

import java.util.Scanner;

public class DesvioSimples {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int idade;
        System.out.println("Por favor, digite a sua idade!");
        idade = leitor.nextInt();
        System.out.println("Deixe-me verificar sua idade...");

        if (idade >= 12) {
            System.out.println("Você pode jogar!");
        } else {
            System.out.println("Você não pode jogar!");
        }

        leitor.close();

    }

}