package com.banco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Java-Banco!");
        System.out.println("Informe a opção desejada");
        System.out.println("1. Criaçao de conta");
        System.out.println("2. Entrar");
        System.out.println("3. Fale Conosco");
        System.out.println("4. Informações Institucionais");
        System.out.println("5. Sair");

        int option = scanner.nextInt(); // TODO: validar se o usuário está informando uma opção válida.

        // TODO: converter para estrutura SWITCH
        
        if (option == 1) {
            int numeroConta = (int) (Math.random() * 90000) + 10000;
            System.out.println("Informe seu nome completo:");
            String nomeCliente = scanner.nextLine(); 
            Conta conta = new Conta( numeroConta, nomeCliente, 10, 5);
            System.out.println("Bem vindo, " + conta.nomeCliente);
        } else 
            System.out.println("Volte Sempre!");
        
    }
}