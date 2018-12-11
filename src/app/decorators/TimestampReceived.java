package app.decorators;

import app.MessageBox;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimestampReceived extends Decorator{
    
    public TimestampReceived(MessageBox msg){
        this.msgList = msg.getMsg();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        for(String m:this.msgList){
            StringBuilder sb = new StringBuilder();
            sb.append("[odebrano: ").append(dateFormat.format(new Date())).append("] ").append(m);
            this.msgList.set(this.msgList.indexOf(m), sb.toString());
        }
    }
}
