package estabelicimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.digitalizadora.Scanner;
import equipamentos.impresora.Deskjet;
import equipamentos.impresora.Impresora;
import equipamentos.impresora.Laserjet;
import equipamentos.multiFuncional.EquipamentoMultiFuncional;

public class Fabrica {
    static void main(String[] args) {
        EquipamentoMultiFuncional em = new EquipamentoMultiFuncional();

        Deskjet deskjet = new Deskjet();

        Scanner scanner = new Scanner();


        Copiadora copiadora = em;
        Impresora impresora = deskjet;
        Digitalizadora digitalizadora = scanner;

        impresora.imprimir();
        copiadora.copiando();
        digitalizadora.digitalizando();
    }
}
