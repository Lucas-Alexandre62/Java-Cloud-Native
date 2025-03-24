package Abstração;

public sealed abstract class ServicoMensagem permits FacebookM, MSNM, TelegramM{
    public abstract void enviarMensagem();
    public abstract void receberMensagem();
}
