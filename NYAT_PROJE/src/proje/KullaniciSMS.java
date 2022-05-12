package proje;

public class KullaniciSMS implements IObserver {
    @Override
    public void update(String mesaj){
        System.out.println("SMS ile giden mesaj :" + mesaj);
    }

}
