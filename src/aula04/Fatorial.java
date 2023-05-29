package aula04;

public class Fatorial {

    public static void main(String[] args) {

        int n = 5, fatorial = 1, i = 1;

        while (i < n) {
            fatorial = fatorial * i;
            i++;
        }
        System.out.println(n + " ! = " + fatorial);
    }
}
