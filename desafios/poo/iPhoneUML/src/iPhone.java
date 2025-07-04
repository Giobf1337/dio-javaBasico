public class iPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

    private String imei;
    private String model;
    private String color;
    private boolean isOn;

    public void homeButton(){
        System.out.println("Voltando à tela inicial.");
    }

    @Override
    public void ligar(String numero) {
        System.out.printf("ligando para +55 %s", numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação...");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.printf("acessando o endereço: > https://%s",url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba aberta!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Pagina..");
    }

    @Override
    public void tocar() {
        System.out.println("Reproduzindo musica..");
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.printf("Musica selecionada:\n[%s]", musica);
    }
}
