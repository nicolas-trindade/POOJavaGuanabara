package aula6_encapsulamento;

public class ControleRemoto implements Controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;
    private String linha = "----------------------------------";

    public ControleRemoto(){
        volume = 50;
        ligado = false;
        tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }


    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println(linha);
        System.out.println("---MENU---");
        System.out.println("Está ligado? "+ this.getLigado());
        System.out.println("Está tocando? "+ this.getTocando());
        System.out.println("Volume: " + this.getVolume());
        for (int i = 10; i <= this.getVolume(); i+=10){System.out.print("|");}
        System.out.println();
    }

    @Override
    public void fecharMenu() {
        System.out.println(linha);
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()) {
            System.out.println(linha);
            this.setVolume(this.getVolume() + 5);
            System.out.println("Volume está em: "+this.getVolume());
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()) {
            System.out.println(linha);
            this.setVolume(this.getVolume() - 5);
            System.out.println("Volume está em: "+this.getVolume());
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0){
            System.out.println(linha);
            this.setVolume(0);
            System.out.println("Volume no mudo!");
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0){
            System.out.println(linha);
            this.setVolume(50);
            System.out.println("Volume saiu do mudo e está em "+this.getVolume());
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }
    }
}
