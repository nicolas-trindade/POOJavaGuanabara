package aula6_encapsulamento;

public class Aula6 {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.abrirMenu();
        c.maisVolume();
        c.maisVolume();
        c.abrirMenu();
        c.ligarMudo();
        c.abrirMenu();
        c.desligarMudo();
        c.abrirMenu();
        c.play();
        c.abrirMenu();
        c.pause();
        c.abrirMenu();
        c.desligar();
        c.abrirMenu();
    }
}
