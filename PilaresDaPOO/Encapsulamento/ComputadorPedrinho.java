//Metodo antes do emcapsulamento
public class ComputadorPedrinho {
    static void main(String[] args) {
        MSN msn = new MSN();

        msn.validarConectadoInternte();
        msn.enviarMensagem();
        msn.salvarHistoricoMensagem();

        msn.receberMensagem();
    }
}
