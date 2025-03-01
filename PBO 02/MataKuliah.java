/*  Nama File   : MataKuliah.java 
    Deskripsi   : berisi atribut dan method dalam class MataKuliah
    Pembuat     : Moh Yusril Nur Syabani
    Tanggal     : 27 - Februari - 2025
*/

public class MataKuliah {
    private String idMatkul;
    private String nama;
    private int sks;

    //Konstruktor tanpa parameter
    public MataKuliah() {
        this.idMatkul = "";
        this.nama = "";
        this.sks = 0;
    }

    //Konstruktor dengan parameter
    public MataKuliah(String idMatkul, String nama, int sks){
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }

    //Selektor masing-masing atribut
    public String getidMatkul() {
        return idMatkul;
    }
    
    public String getnama() {
        return nama;
    }

    public int getsks() {
        return sks;
    }
    

    //Mutator masing-masing atribut
    public void setidMatkul(String idMatkul) {
        this.idMatkul = idMatkul;
    }

    public void setnama (String nama) {
        this.nama = nama;
    }

    public void setsks (int sks) {
        this.sks = sks;
    }

}


