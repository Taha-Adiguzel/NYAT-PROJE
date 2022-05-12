package proje;


public class SicaklikAlgilayici {
    private int sicaklik = (int)Math.floor(Math.random()*(25-19+1)+19);

    public int sicaklikOku(){
        return sicaklik;
    }

    public void sicaklikArttir(){
        sicaklik++;
    }

    public void sicaklikAzalt(){
        sicaklik--;
    }
}
