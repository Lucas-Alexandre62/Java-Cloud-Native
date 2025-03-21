package Herança;

public class Computador {
    public static void main(String[] args) {
        MSN msn = new MSN();
        msn.enviarMensagem();
        msn.receberMensagem();
        
        Telegram telegram = new Telegram();
        telegram.enviarMensagem();
        telegram.receberMensagem();

        FacebookMSG facebook = new FacebookMSG();
        facebook.enviarMensagem();
        facebook.receberMensagem();
    }
}
