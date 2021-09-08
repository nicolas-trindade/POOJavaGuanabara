package aula11_herança2;

public class aula11 {
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa(); não pode ser estanciada classe abstrata
        /*Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(65);
        v1.setSexo("M");
        System.out.println(v1.toString());*/

        Aluno a1 = new Aluno();
        a1.setNome("Cláudio");
        a1.setIdade(25);
        a1.setSexo("M");
        a1.setMatricula(1111);
        a1.setCurso("Informática");
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setNome("Pedro");
        b1.setMatricula(2222);
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();
    }
}
