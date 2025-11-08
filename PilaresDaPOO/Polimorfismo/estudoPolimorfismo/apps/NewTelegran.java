package estudoPolimorfismo.apps;

public class NewTelegran extends ServisoDeMensagem {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo TElegram");
    }


    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo TElegram");

    }
}
