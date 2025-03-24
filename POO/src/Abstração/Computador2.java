package Abstração;

public class Computador2 {
    FacebookM fcb = new FacebookM();
    MSNM msnMSG = new MSNM();
    TelegramM tlg = new TelegramM();

    fcb.enviarMensagem();
    fcb.receberMensagem();

    msnMSG.enviarMensagem();
    msnMSG.receberMensagem();

    tlg.enviarMensagem();
    tlg.receberMensagem();
}
