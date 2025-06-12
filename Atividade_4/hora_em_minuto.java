package Atividade_4;

import java.util.Scanner;

public class hora_em_minuto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de horas: ");
        int horas = scanner.nextInt();

        int minutos = horas * 60;
        System.out.println("A quantidade de minutos em " + horas + " horas é: " + minutos + " minutos");

        scanner.close();
    }
}
