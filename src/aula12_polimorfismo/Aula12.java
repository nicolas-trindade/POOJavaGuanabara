package aula12_polimorfismo;

public class Aula12 {
    public static void main(String[] args) {
        //Animal n = new Animal();

        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        Canguru canguru = new Canguru();

        m.setPeso(35.3f);
        m.setCorPelo("Marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();

        m.locomover();
        a.locomover();
        p.locomover();
        r.locomover();

        canguru.locomover();
    }
}
