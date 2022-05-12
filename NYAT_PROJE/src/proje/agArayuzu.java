package proje;

public class agArayuzu implements  IagArayuzu{

    Eyleyici eyle = new Eyleyici();
    ISubject publisher;

    public agArayuzu(ISubject publisher){
        this.publisher = publisher;
    }
    public void sogutucuAc(){
        eyle.sogutucuAc();
        publisher.notify("Sogutucu kapatildi!");
    }

    public void sogutucuKapat(){
        eyle.sogutucuKapat();
        publisher.notify("Sogutucu kapatildi!");
    }

    public void sicaklikGonder(){
        System.out.println("-------------------------------------");
        System.out.println("Sicaklik : " + eyle.sicaklikgetir());
    }

}
