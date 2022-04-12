package beans;

public class Televisor {
    // atributos
    private int canal = 0 ;
    private int volume;
    private boolean ligado;

    // getters + setters

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        if (canal <= 16 & canal >= 0 ) {
            this.canal = canal;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    // metodos (operações)
    public void mostrarStatus(){
        System.out.println("Canal:" + this.canal + " / Vol: " + getVolume() + " Ligado: " + isLigado()) ;
    }

    public void aumentarVolume(){
        if (this.volume < 10 & this.isLigado()) {
            this.volume++;
            System.out.println("vol++");
        }
    }

    public void diminuirVolume(){
        if (this.volume > 0 & this.isLigado()) {
            this.volume--;
            System.out.println("vol--");
        }
    }

    public void ligar(){
        this.setLigado(true);
    }
    public void desligar(){
        this.setLigado(false);
    }

    public void aumentarCanal(){
        int valor = getCanal()+1;
        setCanal( valor );
        System.out.println("canal++");
    }

    public void diminuirCanal(){
        int valor =  getCanal() -1;
        setCanal(valor);
        System.out.println("canal--");
    }
}
