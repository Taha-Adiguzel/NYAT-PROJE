package proje;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Sql{

    private boolean girildiMi = false;

    private Connection baglan(){

        Connection conn=null;
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Sogutucu",
                    "postgres", "0c12cee0");
        } catch (Exception e) {
            System.out.println("Baglanti girisimi basarisiz!");
            e.printStackTrace();
        }
        return conn;
    }

    public void Giris(String kullaniciAdi,String sifre){

        Connection conn=this.baglan();
        String adi = "";
        String siffre = "";

        try{

            String sql= "SELECT *  FROM \"Hesaplar\" WHERE \"kullaniciAdi\"= '"+ kullaniciAdi+"' AND sifre= '"+ sifre + "'";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            //***** Bağlantı sonlandırma *****
            conn.close();


            while(rs.next())
            {
                adi = rs.getString("kullaniciAdi");
                siffre = rs.getString("sifre");
                System.out.println("Baglanilan hesap :" +adi);
            }

            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if(kullaniciAdi.equals(adi)|| sifre.equals(siffre)){
            girildiMi = true;
        }
    }

    public boolean isGirildiMi() {
        return girildiMi;
    }
}