package app.decorators;

import app.MessageBox;

public class Censor extends Decorator{
    
    public Censor(MessageBox msg, String censorText){
        this.msgList = msg.getMsg();
        for(String m:this.msgList){
            String replaced = m.replace(censorText, "*****");
            this.msgList.set(this.msgList.indexOf(m), replaced);
        }
    }
}
