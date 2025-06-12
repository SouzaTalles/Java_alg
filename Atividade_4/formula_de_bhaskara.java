package Atividade_4;

import java.util.Scanner;
import java.lang.Math;

public class formula_de_bhaskara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite o valor de a: ");
        int a = scanner.nextInt();

        System.out.print("Digite o valor de b: ");
        int b = scanner.nextInt();

        System.out.print("Digite o valor de c: ");
        int c = scanner.nextInt();

        float delta = (b * b) - (4 * a * c);
        if (delta < 0) {
            System.out.println("Não existem raízes reais para a equação.");
        }else {
            float raiz1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
            float raiz2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));

            System.out.println("As raíizes da equação são: ");
            System.out.println("Raiz 1: " + raiz1);
            System.out.println("Raiz 2: "  + raiz2);
        }

        scanner.close();
    }
}
