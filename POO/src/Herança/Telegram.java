package Herança;

public non-sealed class Telegram extends ServicoMensagemInstantanea{
    public void enviarMensagem(){
        System.out.println("Mensagem enviada pelo Telegram");
    }

    public void receberMensagem(){
        System.out.println("Mensagem recebida pelo Telegram");
    }
}
