package exercicio1.guanabara;

public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Maria", 19, "F");

        l[0] = new Livro("Eu e você", "Nós", 240, p[0]);
        l[1] = new Livro ("My sunshine", "Aurora", 200, p[1]);
        l[2] = new Livro ("A espera de um milagre", "Stanley Kubrick", 286, null);

        System.out.println(l[0].detalhes());

    }
}
