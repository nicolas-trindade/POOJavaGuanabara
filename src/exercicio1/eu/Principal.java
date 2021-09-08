package exercicio1.eu;

public class Principal {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[3];
        Livro[] l = new Livro[4];

        p[0] = new Pessoa("Pedro", 15, "M");
        p[1] = new Pessoa("JV", 11, "M");
        p[2] = new Pessoa("Maria", 53, "F");

        l[0] = new Livro("A incrível história do eu lirico", "José de Alencar", 200, p[0]);
        l[1] = new Livro("A arte de ser quem se é", "Noel Rosa", 232, p[1]);
        l[2] = new Livro("Perdendo tempo a doidado", "Morto muito loko", 420, p[1]);
        l[3] = new Livro("Como vencer a si mesmo", "Procrastinado da Silva", 200, p[2]);

        System.out.println(l[0].detalhes());

        l[0].avancarPag();
        System.out.println(l[0].detalhes());
        l[0].abrir();
        l[0].avancarPag();
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
        p[0].fazerAniver();
        p[0].apresentar();


    }
}
