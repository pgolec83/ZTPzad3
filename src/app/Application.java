package app;

import app.decorators.TimestampReceived;
import app.decorators.TimestampSent;

public class Application {
    
    public static void main (String [] args){
        MessageBox WorkMsg = new MessageBox();
        
        WorkMsg.addMsg("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
        WorkMsg.addMsg("Nulla faucibus, mauris eget ultricies suscipit.");
        WorkMsg.addMsg("Lectus ligula cursus metus, non fringilla lectus ex convallis ligula.");
        WorkMsg.addMsg("Aenean tincidunt pretium turpis, sed vestibulum sem tincidunt vitae.");
        
        WorkMsg.showMsg();

        WorkMsg = new TimestampSent(WorkMsg);

        WorkMsg.showMsg();
        
        WorkMsg = new TimestampReceived(WorkMsg);
        
        WorkMsg.showMsg();
    }
}
