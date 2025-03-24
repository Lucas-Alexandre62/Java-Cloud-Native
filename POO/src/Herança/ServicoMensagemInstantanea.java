package Herança;

public sealed class ServicoMensagemInstantanea permits FacebookMSG, MSN, Telegram{

    public void enviarMensagem(){
        validarConectadoInternet();

        System.out.println("Enviando mensagem");
        salvarHistoricoMensagem();
    }

    public void receberMensagem(){
        System.out.println("Recebendo mensagem");
    }

    private void validarConectadoInternet(){
        System.out.println("Validando conexão com a internet");
    }

    private void salvarHistoricoMensagem(){
        System.out.println("Salvando histórico de mensagem");
    }
}
