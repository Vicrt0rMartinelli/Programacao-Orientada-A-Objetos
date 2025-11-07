package estado;

public class Sistemaibge {
    static void main(String[] args) {
        for(EstadoBrasileiro e: EstadoBrasileiro.values()){
            System.out.println(e.getNome()+" - "+e.getSigla()+" - "+ e.getIbge());
        }

        EstadoBrasileiro eb = EstadoBrasileiro.PARANÁ;

        System.out.println("\n"+eb.getNome());
        System.out.println(eb.getSigla());
        System.out.println(eb.getNomeMaiusculo());
        System.out.println(eb.getIbge());
    }
}