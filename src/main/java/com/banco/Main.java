package com.banco;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao Java-Banco!");
        System.out.println("Informe a opção desejada");
        System.out.println("1. Criaçao de conta");
        System.out.println("2. Sair");

        Conta conta = new Conta(1, "Teste", 10, 5);

        System.out.println(conta.nomeCliente);
    }
} 