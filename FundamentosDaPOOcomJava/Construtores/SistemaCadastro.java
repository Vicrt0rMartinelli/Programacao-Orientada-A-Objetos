/*Se não rodas, limpe o cache (*__-)
 */

public class SistemaCadastro {
    public static void main(String[] args) {
        //Criando uma pessoa no sistema
        Pessoa marcos = new Pessoa("113","Maqrquinhos");

        //Definindo o endereço de marcos
        marcos.setEndereco("Ruas dos banzeiros");

        System.out.println(marcos.getNome()+" - "+marcos.getCpf());
    }
}