package Atividade_4;

import java.util.Scanner;

public class Area_do_triangulo {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.print("Digite a base do triângulo: ");
        int base = scanner.nextInt();

        System.out.print("Digite a altura do triângulo: ");
        int altura = scanner.nextInt();
        
        int area = (base * altura) / 2;
        System.out.println("A área do triângulo é: " + area);

        scanner.close();
    }
}
