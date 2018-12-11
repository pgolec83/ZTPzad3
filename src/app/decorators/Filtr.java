package app.decorators;

import app.MessageBox;

public class Filtr extends Decorator{
    
    public Filtr(MessageBox msg, String filtr){
        this.msgList = msg.getMsg();
        boolean[] valid = new boolean[msgList.size()];
        for(String m:this.msgList){
            if(m.contains(filtr)){
                valid[this.msgList.indexOf(m)] = true;
            }
        }
        int del = 0;
        for(int i=0;i<valid.length;i++){
            if(valid[i]){
                this.msgList.remove(i-del);
                del++;
            }
        }   
    }
}
