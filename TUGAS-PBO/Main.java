package Pertemuan5;

public class Main {
    public static void main(String[] args) {
        
        Mahasiswa m1 = new Mahasiswa();
        m1.npm = 123;
        m1.nama = "Zee";
        m1.prodi = "Informatika";
        m1.infoMahasiswa();
        m1.setData(55210, "Dineschara", "Teknik Informatika");
        Mahasiswa m2 = new Mahasiswa();
        m2.infoMahasiswa();
        System.out.println("NPM m1 : " + m1.npm);
    }
}

class Mahasiswa{
    
    //atribut atau intance variabel
    int npm;
    String nama;
    String prodi;
    
    public void setData(int npm, String nama, String prodi){
        this.npm = npm;
        this.nama = nama;
        this.prodi = prodi;
    }
    
    //method
    public void infoMahasiswa(){
        //local variabel
        int nilai = 85;
        int npm = 55201;
        
        System.out.println("NPM     : " + this.npm);
        System.out.println("Nama    : " + nama);
        System.out.println("Prodi   : " + prodi);
        System.out.println("Nilai   : " + nilai);
        
    }
}