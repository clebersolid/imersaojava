package aula01;

import java.util.Scanner;

public class Saudacao {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = leitor.next();
        System.out.println("Seja bem vindo " + nome + "!!!");
        leitor.close();

    }
}
