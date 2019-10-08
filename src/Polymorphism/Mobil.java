
package Polymorphism;

public class Mobil extends Kendaraan{
    private String nama, jenis;
    
    public Mobil(String nama){
        super("Mobil");
        this.nama=nama;
        jenis="belum teridentifikasi";
    }
    public Mobil(String nama, String jenis){
        super("Mobil");
        this.nama=nama;
        this.jenis=jenis;
    }
    public void informasi(){
        System.out.println("Nama mobil  = "+nama);
        System.out.println("Jenis mobil = "+jenis);
    }
    
    
    
}