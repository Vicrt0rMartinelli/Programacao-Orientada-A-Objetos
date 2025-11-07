package newEscola;

public class Escola {
    static void main(String[] args) {
        Aluno felipe = new Aluno();
        felipe.setNome("Felipe");
        felipe.setIdade(1);
        felipe.setSexo("Masculino");

        System.out.println("O aluno "+felipe.getNome() +" tem "+felipe.getIdade()+" anos.");
        System.out.println("E o sexo dele é: "+ felipe.getSexo());
    }
}