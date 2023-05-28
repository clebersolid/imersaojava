package aula04;

import java.util.Scanner;

public class LoopWhile {

    public static void main(String[] args) {

        double somaAlturas = 0, media;
        int i = 0 , quantidadeDeAlunos;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a quantidade de alunos da turma: ");
        quantidadeDeAlunos = leitor.nextInt();

        while (i < quantidadeDeAlunos) {
            System.out.println("Digite o valor da altura do " + (i+1) + ".o aluno!");
            somaAlturas = somaAlturas + leitor.nextDouble();
            i++;
        }
        media = somaAlturas/quantidadeDeAlunos;
        System.out.println("A média da soma das alturas é de: " + String.format("%.2f", media));
        leitor.close();
    }
}
