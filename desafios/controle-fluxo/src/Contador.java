import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int paramUm = scan.nextInt();
        int paramDois = scan.nextInt();

        try{
            // chamando metodo contendo a logica de contagem
            contar(paramUm, paramDois);

        } catch (ParametrosInvalidosException e) {
            // imprimir a msg: O segundo parametro deve ser maior que o primeiro #check
            System.out.println("O segundo parametro deve ser maior que o primeiro.");
        }

    }
    static void contar(int paramUm, int paramDois) throws ParametrosInvalidosException{
            //Validar ser parametroUm é MAIOR que parametroDois e lançar exceção #check
        int contagem = 0;
        if(paramUm<paramDois){
            contagem = paramDois - paramUm;
        }else if(paramUm>paramDois){
            throw new ParametrosInvalidosException();
        }
        for(int i = 0; i<=contagem;i++){
            System.out.println("Imprimindo o numero " + (i+1));
        }

        //realizar o for para imprimir os numeros com base na variavel contagem #check
    }

}
