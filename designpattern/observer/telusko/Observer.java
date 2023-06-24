package designpattern.observer.telusko;

public interface Observer {
    void update();

    void subscribeChannel(Subject ch);
}
