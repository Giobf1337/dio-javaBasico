import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){

        int numero_conta;
        double saldo;
        String agencia;
        String nome_cliente;


        Scanner scan = new Scanner(System.in);

        System.out.println(" ============ AMG Banking ============ \n\n\t Bem vindo ao AMG BNK!");
        System.out.println("\n Para criar uma nova conta, informar: \n\t >Numero da conta:\t");
        numero_conta = scan.nextInt();
        System.out.println("\t >Numero da agencia:");
        agencia = scan.next();
        scan.nextLine();
        System.out.println("\t >Nome do Titular:");
        nome_cliente = scan.nextLine();
        System.out.println("\t Saldo atual:");
        saldo = scan.nextDouble();

        System.out.println("=====================================");
        System.out.println("\t Olá, "+nome_cliente+"! Obrigado por criar uma conta em nosso banco!\n");
        System.out.println("\t>Sua agência é: "+agencia+"\n\t>Conta: "+numero_conta+ "\n\t>Seu saldo atual: "+ saldo+ " já está disponível para saque.");
    }
}
