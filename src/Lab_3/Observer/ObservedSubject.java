package Lab_3.Observer;

public interface ObservedSubject {
    void register(Observer obj);
    void unregister(Observer obj);
    void notifyObserver(String message);
}
