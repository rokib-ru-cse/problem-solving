package designpattern.observer.geekific;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {
    private final List<EmailMsgListener> customers;

    public NotificationService() {
        this.customers = new ArrayList<>();
    }

    public void subscribe(EmailMsgListener listener){
        customers.add(listener);
    }

    public void unSubscribe(EmailMsgListener listener){
        customers.remove(listener);
    }

    public void notifySubs() {}



}

