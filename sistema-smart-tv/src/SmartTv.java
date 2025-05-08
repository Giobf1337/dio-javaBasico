public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 20;

    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
}
