package depot;

import java.util.ArrayList;
import java.util.List;

public class Urunler {

    private String urunIsmi;
    private String uretici;
    private String  urunBirimi;
   private int urunMiktari;
    private String rafNo;
    public Urunler(){

    }

    public Urunler(String urunIsmi, String uretici, String urunBirimi, int urunMiktari, String rafNo) {
        this.urunIsmi = urunIsmi;
        this.uretici = uretici;
        this.urunBirimi = urunBirimi;
        this.urunMiktari = urunMiktari;
        this.rafNo = rafNo;
    }

    public String getUrunIsmi() {
        return urunIsmi;
    }

    public void setUrunIsmi(String urunIsmi) {
        this.urunIsmi = urunIsmi;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public String getUrunBirimi() {
        return urunBirimi;
    }

    public void setUrunBirimi(String urunBirimi) {
        this.urunBirimi = urunBirimi;
    }

    public int getUrunMiktari() {
        return urunMiktari;
    }

    public void setUrunMiktari(int urunMiktari) {
        this.urunMiktari = urunMiktari;
    }

    public String getRafNo() {
        return rafNo;
    }

    public void setRafNo(String rafNo) {
        this.rafNo = rafNo;
    }

    @Override
    public String toString() {
        return "Urunler{" +
                "urunIsmi='" + urunIsmi + '\'' +
                ", uretici='" + uretici + '\'' +
                ", urunBirimi='" + urunBirimi + '\'' +
                ", urunMiktari=" + urunMiktari +
                ", rafNo='" + rafNo + "\n" +
                '}';
    }
}
