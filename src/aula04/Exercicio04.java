package aula04;
        //Exercício 04
        //Exibir números impares de 0 a 1000; se número = 567 interromper programa
public class Exercicio04 {
    public static void main(String[] args) {

        int i = 1;

        while (i <= 1000) {
            i = i + 2;
            System.out.println(i);
            if (i == 567) {
                break;
            }
        }
    }
}
