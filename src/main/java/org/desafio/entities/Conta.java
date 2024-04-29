package org.desafio.entities;

public class Conta {
    private int numConta;
    private int agencia;
    private String nomeCliente;
    private float saldo = 0.0f;

    public Conta(int agencia) {
        super();
    }

    public Conta(int agencia, String nomeCliente, int numConta) {
        setAgencia(agencia);
        setNomeCliente(nomeCliente);
        setNumConta(numConta);
    }

    public void adicionarSaldo(float valor) {
        saldo += valor;
        setSaldo(valor);
        atualizarValorSaldo(saldo);
    }

    private String atualizarValorSaldo(float valor) {
        return "Novo valor atualizado: " + valor;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getAgencia() {
        return agencia;
    }

    protected void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumConta() {
        return numConta;
    }

    protected void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public float getSaldo() {
        return saldo;
    }

    protected void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Dados da conta: \n" +
                "Agência=" + agencia + "\n" +
                "Número da conta=" + numConta + "\n" +
                "Nome do cliente=" + nomeCliente + "/n" +
                "saldo=" + saldo + "/n";
    }
}
