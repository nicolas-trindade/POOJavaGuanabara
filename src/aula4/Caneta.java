package aula4;

public class Caneta {
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;

    public Caneta(String m, String c, float p){ //este é o método construtor
        //o construtor é o método que quando criamos um objeto na classe principal
        //ele ja define como será o modelo adotado.
        //neste construtor estamos passando já os parametros e caracteristicas da caneta
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampar();//construtor nao vai void
        // e ele pode receber parametros como está passando a cima
    }

    public String getModelo(){ //como ta retornando algum valor, nao pode ser void
        return this.modelo;
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
    public void setModelo(String m) { //set recebe sempre um parametro
        this.modelo = m;
    }

    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }

    public void status(){
        System.out.println("SOBRE A CANETA: ");
        //System.out.println("Modelo: "+ this.modelo);// da para fazer assim
        //System.out.println("PONTA: "+ this.ponta);// desse jeito OU
        System.out.println("Modelo: "+ this.getModelo());
        System.out.println("Ponta: "+ this.getPonta());//desse jeito
        System.out.println("Cor: "+this.cor);
        System.out.println("Tampada: "+this.tampada);
    }
}
