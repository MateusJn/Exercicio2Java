package Exercicio2Java;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double primeiroValor, segundoValor, resultado;

        do {
            System.out.print("Digite o primeiro valor: ");
            primeiroValor = scanner.nextDouble();

            System.out.print("Digite o segundo valor (não pode ser zero): ");
            segundoValor = scanner.nextDouble();

            if (segundoValor == 0) {
                System.out.println("O segundo valor não pode ser zero. Tente novamente.");
            }
        } while (segundoValor == 0);

        resultado = primeiroValor / segundoValor;
        System.out.println("O resultado da divisão é: " + resultado);

        scanner.close();
    }
}
