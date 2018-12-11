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
        WorkMsg.showMsg();
        WorkMsg = new TimestampSent(WorkMsg);
        WorkMsg.showMsg();        
        WorkMsg = new TimestampReceived(WorkMsg);        
        WorkMsg.showMsg();       
        WorkMsg = new Numbered(WorkMsg);       
        WorkMsg.showMsg();
        WorkMsg = new Filtr(WorkMsg, "ligula");
        WorkMsg.showMsg();
    }
}
