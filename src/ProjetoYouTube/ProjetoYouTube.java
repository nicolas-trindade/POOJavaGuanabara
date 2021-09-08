package ProjetoYouTube;

public class ProjetoYouTube {
    public static void main(String[] args) {

        Video[] v = new Video[5];
        Gafanhoto g[] = new Gafanhoto[2];

        g[0] = new Gafanhoto("Joao", 11, "M", "patutinhas");
        g[1] = new Gafanhoto("Doria", 45, "M", "canalmeio");

        v[0] = new Video("O novo sucesso da GFT");
        v[1] = new Video("Como ser um sucesso em você mesmo");
        v[2] = new Video("Como ser feliz sem usar ninguém como meio");
        v[3] = new Video("Comer bem pagando pouco: é possível?");
        v[4] = new Video("Amazonia: Proteja");

        /*

        System.out.println(v[0].toString());
        System.out.println(g[0].toString());

         */

        Visualizacao visu[] = new Visualizacao[5];
        visu[0] = new Visualizacao(g[0], v[1]); // joao assiste video como ser um sucesso
        visu[0].avaliar();
        System.out.println(visu[0].toString());


        visu[1] = new Visualizacao(g[0], v[3]);// joao assiste comer bem pagando pouco
        visu[1].avaliar(87f);
        System.out.println(visu[1].toString());


    }
}
