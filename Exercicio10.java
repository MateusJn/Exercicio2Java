package Exercicio2Java;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um valor N maior que zero: ");
        int N = scanner.nextInt();
        
        if (N <= 0) {
            System.out.println("O valor de N deve ser maior que zero.");
        } else {
            System.out.println("Números entre 1 e " + N + ":");
            for (int i = 1; i <= N; i++) {
                System.out.println(i);
            }
        }
        
        scanner.close();
    }
}
