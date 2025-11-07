package pacote_um;

public class Vizinha {
    public static void main(String[] args) {
        System.out.println("--- Teste da classe Vizinha (mesmo pacote) ---");
        ClasseMae mae = new ClasseMae(); // Criamos uma instância

        // O que a Vizinha consegue ver?
        System.out.println(mae.variavelPublica);   //  OK (Pública)
        System.out.println(mae.variavelProtegida); //  OK (Mesmo pacote)
        System.out.println(mae.variavelDefault);   //  OK (Mesmo pacote)

        //  ERRO! O IntelliJ vai sublinhar esta linha.
        //System.out.println(mae.variavelPrivada);
        // Descomente a linha acima e veja o erro:
        // "'variavelPrivada' has private access in 'pacote_um.ClasseMae'"
    }
}