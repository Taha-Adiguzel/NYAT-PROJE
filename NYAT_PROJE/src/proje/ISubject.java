package proje;

public interface ISubject {
    void ekle(IObserver observer);
    void notify(String mesaj);
}
