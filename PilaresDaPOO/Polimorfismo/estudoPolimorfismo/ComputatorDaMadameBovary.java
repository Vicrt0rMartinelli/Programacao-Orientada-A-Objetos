package estudoPolimorfismo;

import estudoPolimorfismo.apps.MSNmensagens;
import estudoPolimorfismo.apps.NewFacebooki;
import estudoPolimorfismo.apps.NewTelegran;
import estudoPolimorfismo.apps.ServisoDeMensagem;

public class ComputatorDaMadameBovary {
    static void main(String[] args) {
        ServisoDeMensagem smi = null;
        /* não se sebae qual app
        mas qualquer um devera enviar e receber mensagem
         */
        String appEscolhido = "tele";

        if(appEscolhido.equals("msn"))
            smi = new MSNmensagens();
        else if(appEscolhido.equals("face"))
            smi = new NewFacebooki();
        else if(appEscolhido.equals("tele"))
            smi = new NewTelegran();

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
