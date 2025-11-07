package pacote_dois;

import pacote_um.ClasseMae; // Precisamos importar

public class Estranha {

    public void main(String[] args) {
        System.out.println("--- Teste da classe Estranha (sem relação) ---");
        ClasseMae mae = new ClasseMae(); // Criamos uma instância

        // O que uma classe aleatória em outro pacote vê?
        System.out.println(mae.variavelPublica);   // ✅ OK (Pública é sempre visível)

        // 🔴 ERRO! O IntelliJ vai sublinhar todas abaixo.
        // System.out.println(mae.variavelProtegida);
        // Motivo: Não estamos no mesmo pacote E não somos uma subclasse.

        // System.out.println(mae.variavelDefault);
        // Motivo: Não estamos no mesmo pacote.

        // System.out.println(mae.variavelPrivada);
        // Motivo: Não somos a ClasseMae.
    }
}