
package Polymorphism;

public class Kapal extends Kendaraan{
    private String nama, jenis;
    
    public Kapal(String nama){
        super("Kapal");
        this.nama=nama;
        jenis="belum teridentifikasi";
    }
    public Kapal(String nama, String jenis){
        super("Kapal");
        this.nama=nama;
        this.jenis=jenis;
    }
    public void informasi(){
        System.out.println("Nama kapal  = "+nama);
        System.out.println("Jenis kapal = "+jenis);
        super.informasi(); //Memanggil superclass
    }
}
