package Atividade_4;

import java.util.Scanner;

public class minutos_em_horas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de minutos: ");
        float minutos = scanner.nextInt();

        float horas = minutos / 60;
        System.out.println("A quantidade de horas em " + minutos + " minutos é: " + horas + " horas");

        scanner.close();
    }
}
    