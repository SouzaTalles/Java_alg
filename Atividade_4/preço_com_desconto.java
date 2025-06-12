package Atividade_4;

 import java.util.Scanner;

public class preço_com_desconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor do produto: ");
        float valor = scanner.nextFloat();

        System.out.print("Valor do desconto: ");
        float desconto = scanner.nextFloat();

        float valorfinal = valor - desconto;
        System.out.println("O valor final do produto é: " + valorfinal);

        scanner.close();
    }
}
