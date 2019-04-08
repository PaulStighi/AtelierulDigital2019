package Lab_3.Observer;

public class Teacher implements ObservedSubject {
    private Observer[] observers = new Observer[10];
    private int size = 0;

    private void deleteObserver(int pos) {
        for (int i = pos; i < size; ++i)
            observers[i] = observers[i + 1];

        observers[size] = null;

        size--;
    }

    public void register(Observer obj) {
        observers[size++] = obj;
    }

    public void unregister(Observer obj) {
        for (int i = 0; i < size; ++i)
            if (observers[i] == obj) {
                deleteObserver(i);
                break;
            }
    }

    public void notifyObserver(String message) {
        for (int i = 0; i < size; ++i)
            observers[i].update(message);
    }
}
