package aula04;
        //Exercício 3
        //Exibir a soma dos números de 0 a 100
public class Exercicio03 {
    public static void main(String[] args) {

        int i = 0, soma = 0;

        while (i <= 100) {
            soma = soma + i;
            i++;
        }
            System.out.println("Soma: " + soma);
    }
}
