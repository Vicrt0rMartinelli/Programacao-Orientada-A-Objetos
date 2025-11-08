package equipamentos.multiFuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impresora.Impresora;

public class EquipamentoMultiFuncional implements Copiadora, Digitalizadora, Impresora {
    public void copiando() {
        System.out.println("Copiando via equipamento multi funcional");
    }

    public void digitalizando() {
        System.out.println("Digitalizando via equipamento multi funcional");
    }

    public void imprimir() {
        System.out.println("Imprimindo via equipamento multi funcional");
    }
}
