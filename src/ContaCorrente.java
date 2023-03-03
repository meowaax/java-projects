import javax.swing.*;

public class ContaCorrente {

    private String senha;
    private double saldo;

    private int numConta;

    private String titular;

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public ContaCorrente(double saldo) {
        this.saldo = saldo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor){
        if (saldo < valor){
            JOptionPane.showMessageDialog(null, "Saldo insuficiente.", "Erro", 0);
        } else {
            saldo -= valor;
            JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo: " + saldo, "Sucesso", 1);
        }
    }

    public void depositar(double valor){
        saldo += valor;
        JOptionPane.showMessageDialog(null, "Depósito realizado com sucesso! \nSaldo: " + saldo);
    }
}
