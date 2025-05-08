package pertemuan701;

/**
 *
 * @author Made Artha
 * TGL: 8 Mei 2025
 * Contoh class Overloading
 */
public class salam {
    String tx = "Menggunakan Method tulisSalam tanpa parameter";
    
    public void tulisSalam(){
        System.out.println(this.tx);
    }
    public void tulisSalam(String txt){
        System.out.println(txt);
    }
    /*
    Silahkan buat metod tulisSalam dengan parameter yang berbeda
    gunakan method tersebut di main project
    */
}
