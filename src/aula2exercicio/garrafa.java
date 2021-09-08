package aula2exercicio;

public class garrafa {
    String tamanho;
    int quantidade;
    String liquido;
    String tipo;
    boolean tampada;

    void status(){
        System.out.println("Tipo de garrafa: " + this.tipo);
        System.out.println("Tamanho da garrafa: " + this.tamanho);
        System.out.println("Liquido: " + this.liquido);
        System.out.println("Quantidade de líquido: " + this.liquido);
        System.out.println("Está tampada? " + this.tampada);
    }

    void abrir(){
        this.tampada = false;
    }

    void tomar(){
        if (this.quantidade == 0 || this.tampada == true){
            System.out.println("A garrafa está vazia ou fechada");
        }
        else{
            System.out.println("Você está tomando "+ this.liquido);
        }
    }
    void fechar(){
        this.tampada = true;
        System.out.println("Garrafa fechada");
    }
}
