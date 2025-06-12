package Atividade_4;

import java.util.Scanner;

public class conversor_de_dolares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de dólares: ");
        float dolares = scanner.nextFloat();

        float reais = dolares * 5.64f;
        System.out.println(dolares + " dólares equivale a " + reais + " reais.");

        scanner.close();
    }
}
