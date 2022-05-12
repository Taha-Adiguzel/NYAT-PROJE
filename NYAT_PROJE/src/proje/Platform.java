package proje;

import java.util.Scanner;

public class Platform {

    Scanner giris = new Scanner(System.in);
    Sql sql = new Sql();
    KullaniciMAIL mail = new KullaniciMAIL();
    KullaniciSMS sms = new KullaniciSMS();
    Publisher publisher = new Publisher();

    private IagArayuzu arayuz;
    public int secim = 0;

    public Platform(){
        arayuz = new agArayuzu(publisher);

    }

    public void menu(){
        System.out.println("-------------------------------------");
        System.out.println("1- Sogutucuyu Ac");
        System.out.println("2- Sogutucuyu Kapat");
        System.out.println("3- Sicakligi Goster");
        System.out.println("4- Cikis");
        System.out.println("-------------------------------------");
        System.out.print("Yapmak istediginiz islemin numarasini girin :");
        secim = giris.nextInt();
    }

    public void Basla() {

        publisher.ekle(mail);
        publisher.ekle(sms);

        do {
            System.out.print("Lutfen kullanici adinizi giriniz:");
            String kullaniciAdi = giris.nextLine();
            System.out.print("Lutfen sifrenizi giriniz:");
            String sifre = giris.nextLine();
            System.out.println("");
            sql.Giris(kullaniciAdi,sifre);

        }while(!sql.isGirildiMi());

        do {
            menu();
            switch (secim){
                case 1:
                    arayuz.sogutucuAc();
                    break;

                case 2:
                    arayuz.sogutucuKapat();
                    break;

                case 3:
                    arayuz.sicaklikGonder();
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Lutfen 1 ile 4 arasinda secim yapin.");
                }

            } while (secim != 4);
        System.out.println("Cikis yapiliyor...");
    }
}
