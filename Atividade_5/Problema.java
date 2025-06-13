package Atividade_5;

import java.util.Scanner;
// import estava incorreto

public class Problema {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nome = entrada.nextLine();
        
        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();
        //Apenas troquei a ordem da entrada de dados
        System.out.println("Nome: " + nome + ", Idade: " + idade);

        entrada.close();
    }
}


