package aula2exercicio;

public class principal {
    public static void main(String[] args) {
        garrafa g1 = new garrafa();

        g1.tipo = "Garrafa de Plástico";
        g1.quantidade = 500;
        g1.liquido = "Água";
        g1.tamanho = "500 ml";
        g1.tampada = false;
        g1.status();
        g1.fechar();
        g1.tomar();
    }
}
