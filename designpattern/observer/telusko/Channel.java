package designpattern.observer.telusko;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
    private List<Subscriber> subs = new ArrayList<>();
    private String title;

    @Override
    public void subscribe(Subscriber subscriber) {
        subs.add(subscriber);
    }

    @Override
    public void unSubscribe(Subscriber subscriber) {
        subs.remove(subscriber);
    }

    @Override
    public void notifySub() {
        for (Subscriber subscriber : subs) {
            subscriber.update();
        }
    }

    @Override
    public void upload(String title) {
        this.title = title;
        notifySub();
    }


}
