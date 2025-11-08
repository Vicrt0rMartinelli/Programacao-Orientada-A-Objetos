package estudoHeranca;

public class ComputadorDoMarcos {
    static void main(String[] args) {

        System.out.println("\nMsn");
        MSN msn = new MSN();
        msn.enviarMensagem();
        msn.receberMensagem();


        System.out.println("\nFacebook");
        Facebook face = new Facebook();
        face.enviarMensagem();
        face.receberMensagem();

        System.out.println("\nTelegram");
        Telegram tele = new Telegram();
        tele.enviarMensagem();
        tele.receberMensagem();


}
}
