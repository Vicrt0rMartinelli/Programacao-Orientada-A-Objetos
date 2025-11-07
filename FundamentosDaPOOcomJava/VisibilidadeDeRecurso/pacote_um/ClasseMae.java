package pacote_um;

public class ClasseMae {
    //  1. PUBLIC (Público)
    // Visível para TODOS, em qualquer pacote.
    public String variavelPublica = "Eu sou pública! (Todos podem me ver)";

    // 👨‍👩👧 2. PROTECTED (Protegido)
    // Visível dentro da própria classe, no mesmo pacote, E para subclasses em outros pacotes.
    protected String variavelProtegida = "Eu sou protegida. (Classe, Pacote e Subclasses)";

    //  3. Default (Padrão/Pacote)
    // (Sem palavra-chave) Visível apenas dentro da própria classe e no mesmo pacote.
    String variavelDefault = "Eu sou default. (Apenas Classe e Pacote)";

    //  4. PRIVATE (Privado)
    // Visível APENAS dentro desta classe. Ninguém mais pode ver.
    private String variavelPrivada = "Eu sou privada. (SÓ esta classe)";

    // Metodo para provar que a própria classe vê tudo:
    public void testarAcessoInterno() {
        System.out.println("--- Teste dentro da ClasseMae ---");
        System.out.println(this.variavelPublica);   // ✅
        System.out.println(this.variavelProtegida); // ✅
        System.out.println(this.variavelDefault);   // ✅
        System.out.println(this.variavelPrivada);   // ✅ (Único lugar onde esta é visível)
        System.out.println("---------------------------------");
    }
}