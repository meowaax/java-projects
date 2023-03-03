import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        double valor;
        String nome;
        String senha;
        int conta;
        int op;

        ContaCorrente c = new ContaCorrente(2.0);

        nome = JOptionPane.showInputDialog(null, "Seja bem-vindo(a)\nQual o seu nome?", "Olá!", 1);
        c.setTitular(nome);

        conta = Integer.parseInt(JOptionPane.showInputDialog(null, "Olá, " + nome + "\nQual o número da sua conta? ", "Conta", 1));
        c.setNumConta(conta);

        senha = JOptionPane.showInputDialog(null, "Por favor, digite a sua senha: ", "Senhha", 1);
        c.setSenha(senha);

        op = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor, escolha uma das opções abaixo:\n[1] SACAR\n[2] DEPOSITAR\n[3] MOSTRAR INFORMAÇÕES DA CONTA\n[0] SAIR", "Opções", 1));

        switch (op){

            case 1:
                valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor:", "Sacar", 1));
                c.sacar(valor);
                break;

            case 2:
                valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor:", "Depositar", 1));
                c.depositar(valor);
                break;

            case 3:
                JOptionPane.showMessageDialog(null,
                        "Titular: " + c.getTitular() +
                                "\nNúmero da conta: " + c.getNumConta() +
                                "\nSenha: " + c.getSenha() +
                                "\nSaldo: " + c.getSaldo(),
                        "Informações da conta", 1);
                break;
            case 0:
                JOptionPane.showMessageDialog(null, "Foi ótimo ter você aqui! Até logo.", "Sair", 1);
                break;
        }

    }
}