package cobaoop;
import java.util.Arrays;
import java.util.Scanner;

public class Tugas1a {
    public static void main(String[] args){
        Scanner wkwk = new Scanner(System.in); 
        int menu = wkwk.nextInt();
        switch (menu){
            case 1 :{
            int sisi = wkwk.nextInt();
                System.out.println(persegi(sisi));
                break;
            }
            case 2 :{
            double alas = wkwk.nextInt();
            double tinggi = wkwk.nextInt();
                System.out.println(segitiga(alas,tinggi));
                break;
            }
            case 3 :{
            double jarijari = wkwk.nextInt();
                System.out.println(lingkaran(jarijari));
                break;
            }
            default:{
                System.out.println("Input yang anda masukan tidak sesuai");
            }
        }
    }
    public static int persegi (int x){
        return x * x;
    }
    public static int segitiga (double x, double y){
        return (int) ((x * y)/2);      
    }
    public static double lingkaran (double x){
        if (x % 7 == 0){
            double phi = 22/7;
            double lingkaran = phi * x * x;
            return lingkaran;
        }else{
            double phi = 3.14;
            double lingkaran = phi * x * x;
            return (int)lingkaran;
        }
    }
}
    


