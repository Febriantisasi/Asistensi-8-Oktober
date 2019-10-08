
package Polymorphism;

public class Kendaraan {
    private String model;
    
    //inisialisasi

    public Kendaraan(String model) {
        this.model=model;
    }
    //informasi yg merupakan method tanpa instruksi
    public void informasi(){
        System.out.println("Model   : "+model);
    }
    
    
}
