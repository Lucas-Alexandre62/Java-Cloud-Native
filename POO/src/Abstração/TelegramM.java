package Abstração;

public class TelegramM extends ServicoMensagem{
    public void enviarMensagem() {
        System.out.println("Mensagem enviada pelo Telegram");
    }
    public void receberMensagem() {
        System.out.println("Mensagem recebida pelo Telegram");
    }
}
