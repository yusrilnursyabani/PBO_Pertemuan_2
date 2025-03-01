/*  Nama File   : Kendaraan.java 
    Deskripsi   : berisi atribut dan method dalam class Kendaraan
    Pembuat     : Moh Yusril Nur Syabani
    Tanggal     : 27 - Februari - 2025
*/

public class Kendaraan {
    private String noPlat;
    private String jenis;
    

    //Konstruktor tanpa parameter
    public Kendaraan () {
        this.noPlat = "";
        this.jenis = "";
    }

    //Konstruktor dengan parameter
    public Kendaraan(String noPlat, String jenis) { 
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    //Selektor untuk masing-masing atribut
    public String getnoPlat() {
        return noPlat;
    }

    public String getjenis() {
        return jenis;
    }

    //Mutator untuk masing-masing atribut
    public void setnoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public void setjenis(String jenis) {
        this.jenis = jenis;
    }
}
