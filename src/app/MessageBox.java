package app;

import java.util.LinkedList;
import java.util.List;

public class MessageBox {
    protected List<String> msgList;
    
    public MessageBox(){
        this.msgList = new LinkedList<>();
    }
    
    public List<String> getMsg(){
        return this.msgList;
    }
    
    public void addMsg(String msg){
        this.msgList.add(msg);
    }
    
    public void showMsg(){
        this.msgList.forEach((m) -> {
            System.out.println(m);
        });
        System.out.println();
    }
}