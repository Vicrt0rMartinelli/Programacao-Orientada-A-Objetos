//metodos do msn porem agora emcapsulados
public class NewMSN{
    public void enviarMensagem(){
        validarConectadoInternte();
        System.out.println("Enviando mensagem");
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        System.out.println("Recebendo mendagem");
    }
    private void validarConectadoInternte(){
        System.out.println("Validando se está conectado a internet");
    }
    private void salvarHistoricoMensagem(){
        System.out.println("Salvando histórico de mensagens");
    }
}