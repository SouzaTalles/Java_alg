package Atividade_4;

import java.util.Scanner;

public class anos_para_dias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de anos: ");
        float anos = scanner.nextFloat();

        float dias = anos * 365;
        System.out.println(anos + " anos equivalem a " + dias + " dias.");

        scanner.close();
    }  
}
