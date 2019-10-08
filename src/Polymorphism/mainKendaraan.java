/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism;

/**
 *
 * @author LENOVO
 */
public class mainKendaraan {
    public static void main(String[]args){
        Kendaraan p;
        Pesawat psw=new Pesawat("Boeing 707","Pesawat Komersial");
        Mobil mbl1= new Mobil("Toyota Kijang","Jeep");
        Mobil mbl2=new Mobil("Suzuki Baleno","Sedan");
        Mobil mbl3 =new Mobil("VW Combi");
        Kapal kpl=new Kapal("Queen Maty 2","Kapal Pesiar");
        
        
//        Kendaraan k =new Kendaraan("Bebek");
//        p=k;
//        p.informasi();
        
        p=psw; //Kendaraan menunjuk obyek pesawat
        p.informasi();
        p=mbl1; //Kendaraan menunujuk obyek MObil 1
        p.informasi();
        p=mbl2;
        p.informasi();
        p=mbl3;
        p.informasi();
        p=kpl; //Kendaraan menunjuk obyek Kapal
        p.informasi();
        
        
    }
}
