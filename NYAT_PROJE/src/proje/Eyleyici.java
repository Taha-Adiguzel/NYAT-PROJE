package proje;

public class Eyleyici{

    SicaklikAlgilayici sicaklik = new SicaklikAlgilayici();

    private boolean status = false;

    public void sogutucuAc(){
        if(!status){
            System.out.println("-------------------------------------");
            System.out.println("Sogutucu Acildi!");

            sicaklikdusur();
            status = true;
        }
        else{
            System.out.println("-------------------------------------");
            System.out.println("Sogutucu zaten calisiyor.");
        }
    }


    public void sogutucuKapat(){
        if(status){
            System.out.println("-------------------------------------");
            System.out.println("Sogutucu Kapatildi!");

            sicaklikarttir();
            status = false;
        }
        else{
            System.out.println("-------------------------------------");
            System.out.println("Sogutucu zaten kapali.");
        }

    }

    public int sicaklikgetir(){
        return sicaklik.sicaklikOku();
    }

    public boolean isStatus() {
        return status;
    }
    public void sicaklikarttir(){
        sicaklik.sicaklikArttir();
    }

    public void sicaklikdusur(){
        sicaklik.sicaklikAzalt();
    }

}
