package designpattern.observer.telusko;

public interface Subject {
    void subscribe(Subscriber subscriber);

    void unSubscribe(Subscriber subscriber);

    void notifySub();

    void upload(String title);
}
