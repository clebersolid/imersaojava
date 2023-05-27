package aula02;

import java.util.Scanner;

public class Senha {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        String senha;
        System.out.println("Por favor, digite sua senha: ");
        senha = leitor.next();

        if (senha.equals("SECRETA")) {
            System.out.println("Você acertou a senha!");
        } else {
            System.out.println("Você errou a senha!");
        }

        leitor.close();

    }
}
