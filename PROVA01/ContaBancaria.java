class ContaBancaria {
    private String numeroDaConta;
    private double saldo;

    public ContaBancaria(String numeroDaConta, double saldoInicial) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado. Saldo atual: R$" + saldo);
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para saque de R$" + valor + ". Saldo atual: R$" + saldo);
        } else {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado. Saldo atual: R$" + saldo);
        }
    }

    public void verSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("707070", 1000.0);

        conta.verSaldo(); 
        conta.depositar(500.0); 
        conta.sacar(200.0); 
        conta.sacar(1500.0); 
        conta.depositar(300);
        conta.sacar(1500);
        conta.verSaldo();
    }
}
