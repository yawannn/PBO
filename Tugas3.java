
package javabajugeming;

import java.util.Scanner;

class JavaBajuGeming {
    
    String jenis;
    int harga;
    int jumlah;
    
    final int bajua = 100000;
    final int bajub = 125000;
    final int bajuc = 175000;
    
    void daftar() {
        System.out.println("Baju yang tersedia : ");
        System.out.println("Baju A dengan harga " + bajua);
        System.out.println("Baju B dengan harga " + bajub);
        System.out.println("Baju C dengan harga " + bajuc);
    }
    
    void hargaa(){
        if(jumlah > 100){
            this.harga = 95000;
        }else{
            this.harga = bajua;
        }
    }
    void hargab(){
        if(jumlah > 100){
            this.harga = 120000;
        }else{
            this.harga = bajub;
        }
    }
    void hargac(){
        if(jumlah > 100){
            this.harga = 160000;
        }else{
            this.harga = bajuc;
        }
    }
    
    void print(){
        if(jenis.equalsIgnoreCase("a"))
            hargaa();
        else if(jenis.equalsIgnoreCase("b"))
            hargab();
        else if(jenis.equalsIgnoreCase("c"))
            hargab();
        System.out.println("Jenis yang anda beli    : " + jenis);
        System.out.println("Harga per buah          : " + harga);
        System.out.println("Total harga             : " + harga*jumlah);
    }
}
public class Tugas3{
    public static void main(String[] args) {
        Scanner wkwk = new Scanner(System.in);
        
        JavaBajuGeming beli = new JavaBajuGeming();
        beli.daftar();

        System.out.print("Baju yang anda akan beli bertipe : ");
        beli.jenis = wkwk.nextLine();

        System.out.print("Jumlah baju yang akan anda beli adalah : ");
        beli.jumlah = wkwk.nextInt();

        beli.print();
        System.out.println("Mau beli lagi?");
    }
}