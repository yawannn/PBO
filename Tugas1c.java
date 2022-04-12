
package cobaoop;

import java.util.Scanner;

public class Tugas1c {

    public static void main(String[] args) {
        Scanner wkwk = new Scanner(System.in);
        double saldo = wkwk.nextInt();
        double setor = wkwk.nextInt();
        System.out.println(mesin(saldo, setor));
    }
    public static double mesin(double x, double y){
        double admin = 7000;
        double total = (x + y);
        total -= admin;
        double potong = total * 0.0005;
        double hasil = total + potong;
        return hasil;
    }
}
