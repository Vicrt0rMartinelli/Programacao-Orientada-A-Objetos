package estudoPolimorfismo.apps;

public class NewFacebooki extends ServisoDeMensagem {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Facebook ");
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook");

    }
}
