package aula5;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t.equals("CC")){
            this.setSaldo(50);
        }
        else if (t.equals("CP")){
            this.setSaldo(150);
        }
    }
    public void estadoAtual(){
        System.out.println("-------------------------------");
        System.out.println("Numero da conta: "+this.getNumConta());
        System.out.println("Tipo de conta: "+this.getTipo());
        System.out.println("Nome do dono: "+this.getDono());
        System.out.println("Saldo em conta: "+this.getSaldo());
        System.out.println("Status da conta: "+this.getStatus());
    }
    public void fecharConta(){
        System.out.println("-------------------------------");
        if (this.getSaldo() > 0){
            System.out.println("Conta não pode ser fechada pois há dinheiro ainda em conta");
        }
        else if (this.getSaldo() < 0){
            System.out.println("Contão não pode ser fechada pois há pendências.");
        }
        else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    public void depositar(float valor){
        System.out.println("-------------------------------");
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Depósito realizado na conta de "+this.getDono()+"\nno valor de: "+valor);
        }
        else
            System.out.println("Impossivel depositar em uma conta fechada!");
    }
    public void sacar(float valor){
        System.out.println("-------------------------------");
        if (this.getStatus()){
            if (this.getSaldo() >= valor){
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado na conta de "+this.getDono()+"\nno valor de: "+valor);
            }
            else
                System.out.println("Saldo insuficiente para realizar o saque");
        } else
            System.out.println("Conta não está aberta, impossível fazer o saque");
    }
    public void pagarMensal(){
        System.out.println("-------------------------------");
        int valor;
        if(this.getTipo().equals("CC")){
            valor = 12;
        }
        else {
            valor = 20;
        }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Mensalidade paga com sucesso por "+this.getDono()+"\nno valor de: "+valor);
        }
        else
            System.out.println("Impossível fazer o pagamento em uma conta fechada");
    }

    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
