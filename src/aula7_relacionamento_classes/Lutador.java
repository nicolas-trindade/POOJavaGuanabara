package aula7_relacionamento_classes;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int empates;
    private int derrotas;

    public Lutador(String no, String na, int id, double al, double pe,
                   int vi, int em, int de){
        nome = no;
        nacionalidade = na;
        idade = id;
        altura = al;
        this.setPeso(pe);
        vitorias = vi;
        empates = em;
        derrotas = de;
    }
    public void apresentar(){
        System.out.println("-----------------------------");
        System.out.println("Lutador "+getNome());
        System.out.println("Nacionalidade: "+getNacionalidade());
        System.out.println("Idade: "+getIdade());
        System.out.println("Altura: "+getAltura());
        System.out.println("Peso: "+getPeso());
        System.out.println("Vitórias: "+getVitorias());
        System.out.println("Empates: "+getEmpates());
        System.out.println("Derrotas: "+getDerrotas());

    }

    public void status(){
        System.out.println("-----------------------------");
        System.out.println("Lutador: "+getNome());
        System.out.println("Idade: "+getIdade());
        System.out.println("Categoria: "+getCategoria());
        System.out.println("Vitórias: "+getVitorias());
        System.out.println("Empates: "+getEmpates());
        System.out.println("Derrotas: "+getDerrotas());;
    }

    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
    }

    public void empatarLuta(){
        this.setEmpates(this.getEmpates()+1);
    }

    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+1);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Inválido";
        }
        else if (this.peso <= 70.3){
            this.categoria = "Leve";
        }
        else if (this.peso <=83.9){
            this.categoria = "Médio";
        }
        else if (this.peso <=120.2){
            this.categoria = "Pesado";
        }
        else
            this.categoria = "Inválido";
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
}
