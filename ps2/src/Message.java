public class Message {
    private String recipient;
    private String sender;
    private String text;


    public String getRecipient()
    {
        return recipient;
    }
    public String getSender(){
        return sender;
    }
    public String getText(){
        return text;
    }
    public void setRecipient(String recipient){
        this.recipient = recipient;
    }
    public void setSender(String sender){
        this.sender = sender;
    }
    public void setText(String text){
        this.text = text;
    }

    public Message(){

        recipient = "no";
        sender ="no";
        text = "no";
    }
    public String toString(){
        return "recipient: " + recipient + "\nSender: "+ sender +"\nMessage: "+text;
    }
}
