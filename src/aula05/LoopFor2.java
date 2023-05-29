package aula05;

import java.util.Scanner;

public class LoopFor2 {
    public static void main(String[] args) {

        int qtdeAlunos, qtdePares = 0, qtdeImpares = 0;
        double notaAluno, mediaAlunosPares = 0, mediaAlunosimpares = 0;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Para calcularmos a média das notas dos alunos é preciso saber, primeiramente, quantos alunos estão na turma: ");
        qtdeAlunos = leitor.nextInt();

        for (int i = 0; i < qtdeAlunos; i++) {
            System.out.println("Digite a nota do " + (i + 1) + ".o aluno: ");
            notaAluno = leitor.nextDouble();
            if ((i + 1) % 2 == 0) {
                mediaAlunosPares = mediaAlunosPares + notaAluno;
                qtdePares++;
            } else {
                mediaAlunosimpares = mediaAlunosimpares + notaAluno;
                qtdeImpares++;
            }


        }

        mediaAlunosPares = mediaAlunosPares / qtdeImpares;
        mediaAlunosimpares = mediaAlunosimpares / qtdePares;
        System.out.println("A média de notas dos alunos pares desta turma é de: " + String.format("%.2f", mediaAlunosPares));
        System.out.println("A média das notas dos alunos impares desta turma é de: " + String.format("%.2f", mediaAlunosimpares));
        leitor.close();
    }
}
