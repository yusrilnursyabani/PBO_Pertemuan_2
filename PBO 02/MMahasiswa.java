/*  Nama File   : MMahasiswa.java 
    Deskripsi   : berisi atribut dan method dalam class Mahasiswa
    Pembuat     : Moh Yusril Nur Syabani
    Tanggal     : 27 - Februari - 2025
*/

public class MMahasiswa {
    public static void main(String[] args) {
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
        
        Mahasiswa M1 = new Mahasiswa("181", "Yusril", "Informatika");
        Dosen D1 = new Dosen("123", "Pak Nurdin", "Informatika");
        Kendaraan K1 = new Kendaraan("G2365VN", "motor");
        
        M1.setDosenWali(D1);
        M1.setKendaraan(K1);
        M1.tambahMatkul(PBO);
        M1.tambahMatkul(MBD);
        
        M1.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah: " + M1.getJumlahMatKul());
        System.out.println("Jumlah SKS: " + M1.getJumlahSKS());
    }
}