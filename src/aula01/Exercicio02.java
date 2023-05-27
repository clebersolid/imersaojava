package aula01;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        double kmInicial, kmFinal, abastecimento, consumo;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a quilimetragem do painel no momento da partida: ");
        kmInicial = leitor.nextDouble();
        System.out.println("Digite a quilometragem do painel no momento de chegada ao ponto: ");
        kmFinal = leitor.nextDouble();
        System.out.println("Digite quantos litros de combustível foram abastecidos: ");
        abastecimento = leitor.nextDouble();
        leitor.close();

        double kMpercorrido = kmFinal - kmInicial;
        consumo = kMpercorrido / abastecimento;

        System.out.println("O veículo faz a média de: " +consumo + "KM por litro!");


    }
}
