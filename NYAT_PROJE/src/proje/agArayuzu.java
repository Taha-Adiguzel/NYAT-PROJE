package proje;

public class agArayuzu implements  IagArayuzu{

    Eyleyici eyle = new Eyleyici();
    ISubject publisher;

    public agArayuzu(ISubject publisher){
        this.publisher = publisher;
    }
    public void sogutucuAc(){
        if(!eyle.isStatus()){
            publisher.notify("Sogutucu acildi!");
        }
        eyle.sogutucuAc();
    }

    public void sogutucuKapat(){
        if(eyle.isStatus()){
            publisher.notify("Sogutucu kapatildi!");
        }
        eyle.sogutucuKapat();
    }

    public void sicaklikGonder(){
        System.out.println("-------------------------------------");
        System.out.println("Sicaklik : " + eyle.sicaklikgetir());
    }

}
