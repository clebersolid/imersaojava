package aula01;

import javax.swing.*;

public class CalculadoraJop {
    public static void main(String[] args) {

        float v1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        float v2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo valor: "));

        float soma = v1 + v2;
        float sub = v1 - v2;
        float mult = v1 * v2;
        float div = v1 / v2;

        JOptionPane.showMessageDialog(null, "Os valores são: \nSoma: " + soma + "\nSubtração: " + sub + "\nMultiplicação: " + mult + "\nDivisão: " + div);
    }
}
