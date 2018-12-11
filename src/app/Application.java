package app;

import app.decorators.*;

public class Application {
    
    public static void main (String [] args){
        MessageBox WorkMsg = new MessageBox();
        
        WorkMsg.addMsg("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
        WorkMsg.addMsg("Nulla faucibus, mauris eget ultricies suscipit.");
        WorkMsg.addMsg("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
        WorkMsg.addMsg("Lectus ligula cursus metus, non fringilla lectus ex convallis ligula.");
        WorkMsg.addMsg("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
        WorkMsg.addMsg("Nulla faucibus, mauris eget ultricies suscipit.");
        WorkMsg.addMsg("Lectus ligula cursus metus, non fringilla lectus ex convallis ligula.");
        WorkMsg.addMsg("Nulla faucibus, mauris eget ultricies suscipit.");
        WorkMsg.addMsg("Aenean tincidunt pretium turpis, sed vestibulum sem tincidunt vitae.");
        WorkMsg.addMsg("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
        WorkMsg.addMsg("Lectus ligula cursus metus, non fringilla lectus ex convallis ligula.");
        WorkMsg.addMsg("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
        WorkMsg.addMsg("Nulla faucibus, mauris eget ultricies suscipit.");        
        System.out.println("MESSAGEBOX: Lista wiadomości bezpośrednio po ich wprowadzeniu");
        WorkMsg.showMsg();
        WorkMsg = new TimestampSent(WorkMsg);
        System.out.println("DEKORATOR: czas wysłania wiadomości");
        WorkMsg.showMsg();        
        WorkMsg = new TimestampReceived(WorkMsg);
        System.out.println("DEKORATOR: czas odebrania wiadomości");
        WorkMsg.showMsg();       
        WorkMsg = new Numbered(WorkMsg);
        System.out.println("DEKORATOR: unikalne numerowanie wiadomości");
        WorkMsg.showMsg();
        WorkMsg = new Filtr(WorkMsg, "ligula");
        System.out.println("DEKORATOR: filtr - usuwa wiadomości zawierające ciąg znaków \"ligula\"");
        WorkMsg.showMsg();
        WorkMsg = new Censor(WorkMsg, "dolor");
        System.out.println("DEKORATOR: cenzor - zastępuje ciąg znaków \"dolor\" ciągiem znaków \"*****\"");
        WorkMsg.showMsg();
        WorkMsg = new Encoder(WorkMsg, 5);
        System.out.println("DEKORATOR: szyfrowanie wiadomości - Szyfr Cezara - klucz szyfru: 5");
        WorkMsg.showMsg();
    }
}
