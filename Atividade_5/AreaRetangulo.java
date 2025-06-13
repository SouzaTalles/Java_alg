package Atividade_5;

import java.util.Scanner;
// import estava incorreto

public class AreaRetangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a largura: ");
        float largura = entrada.nextFloat();
        // O metodo estava incorreto, deve ser Float 
        
        System.out.print("Digite a altura: ");
        float altura = entrada.nextFloat();
        // O metodo estava incorreto, deve ser Float
        
        float area = largura * altura;
        // O tipo de dado estava incorreto, deve ser o float
        System.out.println("A área do retângulo é: " + area + " metros");
        
        entrada.close();
    }
}


