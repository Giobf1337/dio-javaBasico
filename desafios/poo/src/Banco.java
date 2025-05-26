import java.util.Scanner;

//Exec.1 - Escreva um codigo onde temos uma conta bancaria capaz de realizar:
//         consultar saldo; consultar cheque especial; Depositar dinheiro;
//         Sacar dinheiro; Pagar um boleto; Verificar uso do cheque esp.

// Seguindo as seguintes regras:
// > A conta bancária deve ter um limite de cheque somado ao saldo da conta;
// > O valor do cheque é definido no momento de criação da conta, de acordo com o valor incial;
// > Se o valor descrito na criação for de R$500 ou menos, o cheque deve ser de R$ 50;
// > Para valores acima de R$ 500,00 o cheque deve ser de 50% do valor depositado;
public class Banco {
    public static void main(String[] args) {
        Conta cliente = new Conta();
        Scanner scan = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("Bem vindo ao INTJ BNK!\nComo podemos ajudar?");
        System.out.println("1 - Abrir nova conta\n2 - Sair");
        int opt = scan.nextInt(); // 1- criar nova conta; 2- sair
        switch (opt) {
            case 1:
                System.out.println("===== Abrir Nova Conta =====");
                System.out.println("Insira o saldo da nova conta:");
                cliente.setSaldo(scan.nextDouble());
                cliente.criarConta(cliente.getSaldo());
                break;

            case 2:
                System.out.println("Agredecemos a preferencia!\nTenha um dia INTJ!");
        }
        if (cliente.getSaldo()>0){
            do {
                System.out.println("====================================\nComo deseja prosseguir?");
                // 1- Consultar saldo; 2- Consultar ChequeEsp; 3- Deposito; 4- Saque; 5- Pagamento de Contas;
                System.out.println("1 - Consultar saldo\n2 - Consultar Cheque Especial\n3 - Despositos\n4 - Saques\n5 - Pagamento de Contas\n0 - Sair");
                opt = scan.nextInt();
                switch (opt) {
                    case 1:
                        cliente.consultarSaldo();
                        break;
                    case 2:
                        cliente.consultarCheque();
                        break;
                    case 3:
                        System.out.println("Qual quantia gostaria de depositar?");
                        cliente.montante = scan.nextDouble();
                        cliente.depositar(cliente.montante);
                        break;
                    case 4:
                        System.out.println("Insira quantia a ser sacada:");
                        cliente.montante = scan.nextDouble();
                        cliente.sacar(cliente.montante);
                        break;
                    case 5:
                        System.out.println("Informe o valor da conta a ser paga:");
                        cliente.montante = scan.nextDouble();
                        cliente.pagarConta(cliente.montante);
                        break;
                    case 0:
                        System.out.println("Agredecemos a preferencia!\nTenha um dia INTJ!");
                        break;
                    default:
                        System.out.println("Opção inexistente.\nTente novamente mais tarde!");
                        System.out.println("==============INTJ BNK==============");

                }
            } while (opt != 0);
        }
    }
}
