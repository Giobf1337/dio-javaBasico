public class Conta {
//    String nome;
    private double saldo, cheque_especial;
    double montante;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getCheque_especial() {
        return cheque_especial;
    }

    public void setCheque_especial(double cheque_especial) {
        this.cheque_especial = cheque_especial;
    }

    public void criarConta(double saldo){
        this.saldo = saldo;
        definirCheque(saldo);
        System.out.println("Conta cadastrada com sucesso!");
    }

    public void consultarSaldo(){
        System.out.println("Saldo atual: R$ "+ saldo);
    }

    public void definirCheque(double saldo){
        if(saldo<=500){
            cheque_especial = 50;
        } else if(saldo>500) {
            cheque_especial = saldo/2;
        }
    }

    public void consultarCheque(){
        System.out.println("Cheque especial em: R$ "+ cheque_especial);
    }

    public void depositar(double montante){
        System.out.println("Você está depositando: R$ "+ montante);
        saldo += montante;
        consultarSaldo();
    }

    public void sacar(double montante){
        System.out.println("Você está sacando: R$ "+ montante);
        if(montante>saldo){
            double dif = Math.abs(montante-saldo);
            if(montante> (saldo + cheque_especial)){
                System.out.println("Fundos insuficientes.");
                return;
            }else{
            saldo += cheque_especial;
            double aux = cheque_especial;
            cheque_especial -= dif;
            verifyUseCheque(aux);
            return;
            }
        }
        saldo -= montante;
        consultarSaldo();
    }

    public void pagarConta(double valorBoleto) {
        if (valorBoleto > 0) {//validação de valor
            if(valorBoleto>saldo){
                double dif = Math.abs(montante-saldo);
                if(valorBoleto> (saldo + cheque_especial)){
                    System.out.println("Fundos insuficientes.");
                    return;
                }else{
                    saldo += cheque_especial;
                    double aux = cheque_especial;
                    cheque_especial -= dif;
                    verifyUseCheque(aux);
//                    System.out.println("Transação Concluída!\nConta Paga no valor de: R$ "+valorBoleto);
                }
            }
        saldo -= valorBoleto;
        System.out.println("Transacão concluída!\nValor pago: R$ " + valorBoleto);
        consultarSaldo();
        }
        else {
            System.out.println("Documento com valor incorreto.");
        }

    }

    public void verifyUseCheque(double cheque_especial){
        if (cheque_especial > this.cheque_especial){
            System.out.println(">>Cheque Especial foi acionado.<<");
            consultarCheque();
        }else {
            System.out.println("Cheque Especial ainda não foi usado, e está disponível para uso!");
        }

    }
}
