package designpattern.observer.geekific;

public class EmailMsgListener {

    private final String email;

    public EmailMsgListener(String email) {
        this.email = email;
    }

    public void update(){
        System.out.println("email sent");
    }

}
