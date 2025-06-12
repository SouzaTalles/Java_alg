package Atividade_4;

import java.util.Scanner;

public class media_4_numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o 1º número: ");
        float num1 = scanner.nextFloat();

        System.out.print("Digite o 2º número: ");
        float num2 = scanner.nextFloat();

        System.out.print("Digite o 3º número: ");
        float num3 = scanner.nextFloat();

        System.out.print("Digite o 4º número: ");
        float num4 = scanner.nextFloat();

        float media = (num1 + num2 + num3 + num4) / 4;
        System.out.println("A média é " + media);

        scanner.close();
    }
}
