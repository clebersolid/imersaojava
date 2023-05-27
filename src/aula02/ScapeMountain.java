package aula02;

import java.util.Scanner;

public class ScapeMountain {

    public static void main(String[] args) {

        int altura;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Por favor, insira a altura da criança em centimetros: ");
        altura = leitor.nextInt();

        if (altura >= 130) {
            System.out.println("A criança pode andar na Montanha Russa!");
        } else {
            System.out.println("A criança não pode andar na Montanha Russa!");
        }

    }
}
