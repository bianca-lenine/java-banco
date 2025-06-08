package com.banco;

public class Conta {
    private int numero;
    private String nomeCliente;
    private int saldo;
    private int limiteCredito;

    public Conta(int numero, String nomeCliente, int saldo, int limiteCredito) {
        this.numero = numero;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
        this.limiteCredito = limiteCredito;
    }

}

