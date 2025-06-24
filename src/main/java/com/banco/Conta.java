package com.banco;

public class Conta {
    public int numero;
    public String nomeCliente;
    public int saldo;
    public int limiteCredito;

    public Conta(String nomeCliente, int saldo, int limiteCredito) {
        this.numero = (int) (Math.random() * 90000) + 10000;
        System.out.println("Numero da conta: " + this.numero);

        this.nomeCliente = nomeCliente;
        System.out.println("Bem vindo, " + this.nomeCliente);

        this.saldo = saldo;
        this.limiteCredito = limiteCredito;
    }
}
