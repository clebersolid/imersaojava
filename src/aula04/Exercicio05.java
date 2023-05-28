package aula04;
        //Exercício 05
        //Exibir números de 50 a 100, exceto os números 51 a 75
public class Exercicio05 {
    public static void main(String[] args) {
        int i = 49;
        while (i < 100) {
            i++;

            if (i > 50 && i <= 75) {
                continue;
            }
            System.out.println(i);
        }

    }
}
