package app.decorators;

import app.MessageBox;

public class Numbered extends Decorator {
    private static int msgID = 0;
    
    public Numbered(MessageBox msg){
        this.msgList = msg.getMsg();
        for(String m:this.msgList){
            StringBuilder sb = new StringBuilder();
            sb.append("MSG_");
            if(msgID < 10){
                sb.append("0").append(msgID++);
            } else {
                sb.append(msgID++);
            }
            sb.append(" ").append(m);
            this.msgList.set(this.msgList.indexOf(m), sb.toString());
        }
    }
}
