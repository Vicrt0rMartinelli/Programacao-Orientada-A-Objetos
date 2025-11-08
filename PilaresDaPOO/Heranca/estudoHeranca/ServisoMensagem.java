package estudoHeranca;

public class ServisoMensagem {public void enviarMensagem(){
    validarConectadoInternte();
    System.out.println("Enviando mensagem ");
    salvarHistoricoMensagem();
}
    public void receberMensagem(){
        System.out.println("Recebendo mensagem ");
    }
    public void validarConectadoInternte(){
        System.out.println("Validando se está conectado a internet");
    }
    public void salvarHistoricoMensagem(){
        System.out.println("Salvando histórico de mensagens");
    }
}
