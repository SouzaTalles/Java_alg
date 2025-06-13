package Atividade_5;

import java.util.Scanner; 
// import estava incorreto
// Scanner estava com o "S" minúsculo

public class Teste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int numero = entrada.nextInt(); 
        // O tipo de dado estava incorreto, deve ser int para ler um número inteiro
        
        System.out.println("Número digitado: " + numero);

        entrada.close(); // Estava faltando fechar o scanner
    }
}
