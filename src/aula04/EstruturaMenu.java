package aula04;

import java.util.Scanner;

public class EstruturaMenu {
    public static void main(String[] args) {

        int opcao = 0;
        Scanner leitor = new Scanner(System.in);
        while (opcao != 4) {


            System.out.println("ESTRUTURA DE MENUS");
            System.out.println("Suas opçoes são:\n1-Opção \n2-Opção \n3-Opção \n4-Sair");
            opcao = leitor.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu a opção 1");
                    break;
                case 2:
                    System.out.println("Você escolheu a opção 2");
                    break;
                case 3:
                    System.out.println("Você escolheu a opção 3");
                    break;
                case 4:
                    System.out.println("Ok! Saindo do sistema!");
                    break;
                default:
                    System.out.println("Essa opção não existe!");

            }
        }
        leitor.close();
    }
}
