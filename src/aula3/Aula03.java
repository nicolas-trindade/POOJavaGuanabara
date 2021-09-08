package aula3;

public class Aula03 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "BIC Cristal";
        c1.cor = "Preto";
        //c1.ponta = 0.5f; DANDO ERRO POIS SE TRATA DE UMA VARIAVEL PRIVADA, OU SEJA NAO TEM ACESSO
        c1.carga = 80; //AQUI ACEITA POIS A CLASSE INSTANCIADA CANETA ESTÁ SENDO USADA DENTRO DO MÉTODO MAIN, UMA CLASSE ESTÁ DENTRO DA OUTRA POR ISSO FUNCIONA
        //c1.tampada = true; //TAMPADA ESTÁ PRIVADO PORÉM
        c1.tampar();// O MÉTODO TAMPAR É PUBLICO, LOGO, CONSIGO USAR
        c1.status();// E TAMPAR OU DESTAMPAR A CANETA
        c1.rabiscar();
    }
}
