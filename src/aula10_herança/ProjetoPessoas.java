package aula10_herança;

public class ProjetoPessoas {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p1.setIdade(20);
        p1.setSexo("M");
     //   p2.setNome("Maria");
        //   p3.setNome("Cláudio");
        //p4.setNome("Fabiana");

        System.out.println(p1.toString());
        //p2.toString();
        //p3.toString();
        //p4.toString();
    }
}
