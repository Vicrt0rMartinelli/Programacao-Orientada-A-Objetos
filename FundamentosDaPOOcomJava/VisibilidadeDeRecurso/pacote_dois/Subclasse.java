package pacote_dois;

import pacote_um.ClasseMae; // Precisamos importar, pois está em outro pacote

// A palavra-chave "extends" é a mais importante aqui!
public class Subclasse extends ClasseMae {

    public void main (String[] args) {
        System.out.println("--- Teste da Subclasse (pacote diferente) ---");

        // Como herdamos, podemos acessar os membros como se fossem nossos (usando "this")
        System.out.println(this.variavelPublica);   // ✅ OK (Pública)
        System.out.println(this.variavelProtegida); // ✅ OK (Protegida e somos uma Subclasse)

        // 🔴 ERRO! O IntelliJ vai sublinhar esta linha.
        //System.out.println(this.variavelDefault);
        // Motivo: 'default' SÓ é visível no pacote 'pacote_um'.

        // 🔴 ERRO!
        //System.out.println(this.variavelPrivada);
        // Motivo: 'private' SÓ é visível na 'ClasseMae.java'.
    }
}