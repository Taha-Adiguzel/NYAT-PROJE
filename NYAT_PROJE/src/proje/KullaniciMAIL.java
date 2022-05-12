package proje;

public class KullaniciMAIL implements IObserver {
    @Override
    public void update(String mesaj){
        System.out.println("Mail ile giden mesaj :" + mesaj);
    }

}
