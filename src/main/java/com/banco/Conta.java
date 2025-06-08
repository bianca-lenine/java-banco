package com.banco;

public class Conta {
    public int numero;
    public String nomeCliente;
    public int saldo;
    public int limiteCredito;

    public Conta(int numero, String nomeCliente, int saldo, int limiteCredito) {
        this.numero = numero;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
        this.limiteCredito = limiteCredito;
    }

}

