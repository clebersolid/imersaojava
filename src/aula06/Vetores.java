import java.util.Scanner;

public class Vetores {
    public static final int qtdeAlunos = 10;

    public static void main(String[] args) {

        double[] alunos = new double[qtdeAlunos];
        double total = 0;
        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Por favor, digite o consumo do " + (i + 1) + ".o aluno!");
            alunos[i] = leitor.nextDouble();
            total = total + alunos[i];
        }
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("O aluno " + (i + 1) + " consumiu R$" + alunos[i]);
        }

        System.out.println("O total de consumo foi de R$" + total);

        leitor.close();


    }

}
