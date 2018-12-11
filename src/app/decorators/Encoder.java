// Szyfr Cezara

package app.decorators;

import app.MessageBox;

public class Encoder extends Decorator{
    private final int ALPHABET = 'z' - 'a' + 1;
    private final int LETTER = 'a';
    
    public Encoder(MessageBox msg, int key){
        key %= ALPHABET;
        this.msgList = msg.getMsg();
        String message;
        StringBuilder result;
        for(String m:this.msgList){
            message = m;
            result = new StringBuilder();
            for(int i=0;i<message.length();i++){
                if(Character.isLetter(message.charAt(i))){
                    result.append((char) ((message.charAt(i) % LETTER + key) % ALPHABET + LETTER));
                } else {
                    result.append(message.charAt(i));
                }
            }
            this.msgList.set(this.msgList.indexOf(m), result.toString());
        }
    }
}
