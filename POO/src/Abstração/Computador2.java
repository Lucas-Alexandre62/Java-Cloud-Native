package Abstração;

public class Computador2 {
    FacebookM fcb = new FacebookM();
    MSNM msnMSG = new MSNM();
    TelegramM tlg = new TelegramM();

    fcb.enviarM();
    fcb.receberM();

    msnMSG.enviarM();
    msnMSG.receberM();

    tlg.enviarM();
    tlg.receberM();
}
