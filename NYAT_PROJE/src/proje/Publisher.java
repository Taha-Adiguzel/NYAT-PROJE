package proje;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements ISubject{
    private List<IObserver> hesaplar = new ArrayList<>();

    @Override
    public void ekle(IObserver hesap) {
            hesaplar.add(hesap);
    }

    @Override
    public void notify(String mesaj) {
        for(IObserver hesap: hesaplar) {
            hesap.update(mesaj);
        }
    }
}
