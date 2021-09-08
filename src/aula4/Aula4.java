package aula4;

public class Aula4 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("BIC", "Preto", 0.7f); //cria o objeto caneta (c1)
        //como estou fazendo o construtor e chamando parametros la no construtor
        //preciso enviar parametros para o construtor
/*
        c1.setModelo("BIC"); //Os dois modos funcionam porque a variavel modelo
        c1.modelo = "BIC"; // é publica e pode ser acessada

        c1.setPonta(0.5f);//aqui nao vai funcionar porque só o metodo set é
        //c1.ponta = 0.5f;//publico e a variavel ponta é privada
*/
        c1.status();

        //System.out.println("Tenho uma caneta "+c1.getModelo() + " de ponta "+ c1.getPonta());
    }
}
