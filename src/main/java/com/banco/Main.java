package com.banco;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao Banco!");

        Conta conta = new Conta(1, "Teste", 10, 5);

        System.out.println(conta.nomeCliente);
    }
} 