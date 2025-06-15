package com.banco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao Java-Banco!");
        System.out.println("Informe a opção desejada");
        System.out.println("1. Criaçao de conta");
        System.out.println("2. Sair");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt(); // todo: validar se o usuário está informando uma opção válida.
        System.out.println(option);

        if (option == 1) {

            int numeroConta = (int) (Math.random() * 90000) + 10000;
            System.out.println("Informe seu nome completo:");
            String nomeCliente = scanner.nextLine(); 
            System.out.println(nomeCliente);

            Conta conta = new Conta( numeroConta, nomeCliente, 10, 5);
            System.out.println("Bem vindo, " + conta.nomeCliente);

        } else {
            System.out.println("Volte Sempre!");
        }

    }
}