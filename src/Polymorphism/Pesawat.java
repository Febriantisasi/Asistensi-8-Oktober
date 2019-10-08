
package Polymorphism;

public class Pesawat extends Kendaraan{
    private String nama, jenis;
    
    public Pesawat(String nama){
        super("Pesawat");
        this.nama=nama;
        jenis="belum teridentifikasi";
    }
    public Pesawat(String nama, String jenis){
        super("Pesawat");
        this.nama=nama;
        this.jenis=jenis;
    }
    public void informasi(){
        System.out.println("Nama pesawat  = "+nama);
        System.out.println("Jenis pesawat = "+jenis);
    }
}
