package estudoAbstracao;

public class ComputadorDoJose {
    static void main(String[] args) {
        System.out.println("\nMSN");
        MSN msn = new MSN();
        msn.enviarMensagem();
        msn.receberMensagem();

        System.out.println("\nFACEBOOK");
        Face face = new Face();
        face.enviarMensagem();
        face.receberMensagem();

        System.out.println("\nTELEGRAM");
        Telegram tele = new Telegram();
        tele.enviarMensagem();
        tele.receberMensagem();
    }
}
