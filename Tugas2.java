package wkwkwkkwk;

import java.util.Scanner;

class Persegi{
    int sisi;
    Persegi(){
        
    }
    Persegi(int sisi){
        this.sisi = sisi;
    }
    
    void hitungLuas(){
        int luas = sisi*sisi;
        System.out.println(luas);
    }
}
class Segitiga{
    double alas;
    double tinggi;
    Segitiga(){
        
    }
    Segitiga(double alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    void hitungLuas(){
        double luas = alas*tinggi/2;
        System.out.println((int)luas);
    }
}
class Lingkaran{
    double phi;
    int r;
    Lingkaran(){
        
    }
    Lingkaran(double phi, int r){
        this.phi = phi;
        this.r = r;
    }
    void hitungLuas(){
        int lingkaran = (int)(phi * r * r);
        System.out.println((double)lingkaran);
    }
}
public class Tugas2 {
    public static void main(String[] wkwkwkwk){
        Scanner wkwk = new Scanner(System.in);
        int pilihan = wkwk.nextInt();
        switch(pilihan){
            case 1:
                int sisi= wkwk.nextInt();
                Persegi persegi = new Persegi(sisi);
                persegi.hitungLuas();
                break;
            case 2:
                double alas = wkwk.nextDouble();
                double tinggi = wkwk.nextDouble();
                Segitiga segitiga = new Segitiga(alas,tinggi);
                segitiga.hitungLuas();
                break;
            case 3:
                int jarijari = wkwk.nextInt();
                if (jarijari % 7 == 0){
                    double phi = 22/7;
                    Lingkaran lingkaran = new Lingkaran(phi,jarijari);
                    lingkaran.hitungLuas();
                }else{
                    double phi = 3.14;
                    Lingkaran lingkaran = new Lingkaran(phi,jarijari);
                    lingkaran.hitungLuas();
                }
                break;
            default:
                System.out.println("Input yang anda masukan tidak sesuai");
                break;
        }
    }
}
