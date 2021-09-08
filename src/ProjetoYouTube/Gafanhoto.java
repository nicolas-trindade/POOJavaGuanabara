package ProjetoYouTube;

public class Gafanhoto extends Pessoa{

    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    /* também da para fazer assim, adicionando o toString com o super.toString que pega
    o toString da classe Pessoa e adiciona junto ao toString do gafanhoto.
    se nao adicionar o super, vai sobreescrever o método e adicionar apenas o login e
    totassistido no método.*/
    @Override
    public String toString() {
        return "Gafanhoto{" +super.toString()+
                "login='" + login + '\'' +
                ", totAssistido=" + totAssistido +
                '}';
    }

}
