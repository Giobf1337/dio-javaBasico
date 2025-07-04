import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        iPhone iphone = new iPhone();
        Scanner scan = new Scanner(System.in);
        int opt = 0;
        do {
            System.out.println("\n===========================\nTestando novas features!\n===========================");
            System.out.println("Selecione uma ação:");
            System.out.println("1. Pesquisar musica\n2. Reproduzir musica\n3. Pausar musica\n4. Fazer uma ligação");
            System.out.println("5. Atender ligação\n6. Correio de Voz\n7. Pesquisar na web\n8. Abrir nova aba");
            System.out.println("9. Atualizar pagina\n10. Sair");
            opt = scan.nextInt();
            switch (opt){
                case 1 -> {
                    System.out.println("Qual musica deseja ouvir?");
                    scan.nextLine();
                    String musica = scan.nextLine();
                    iphone.selecionarMusica(musica);
                }
                case 2 ->iphone.tocar();
                case 3 ->iphone.pausar();
                case 4 -> {
                    System.out.println("Digite o numero para qual deseja ligar:");
//                    String numero = scan.nextLine();
                    scan.nextLine();
                    iphone.ligar(scan.nextLine());

                }
                case 5 ->iphone.atender();
                case 6 ->iphone.iniciarCorreioDeVoz();
                case 7 -> {
                    System.out.println("Insira url desejada:");
                    scan.nextLine();
                    String url = scan.nextLine();
                    iphone.exibirPagina(url);
                }
                case 8 ->iphone.adicionarNovaAba();
                case 9 ->iphone.atualizarPagina();
                case 10 -> System.out.println("Saindo do sistema..");
            }
        } while (opt != 10);
    }
}
