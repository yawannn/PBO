package praktikoem;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("==================DATA PEGAWAI TETAP==================");
        Pegawai tetap1 = new PegawaiTetap("Maguire", "349284958084", 3000000.0);
        System.out.println(tetap1.toString());
        Pegawai tetap2 = new PegawaiTetap("Varane", "24909276399639", 5000000.0);
        System.out.println(tetap2.toString());
        Pegawai tetap3 = new PegawaiTetap("Dalot", "5457683418334", 3500000.0);
        System.out.println(tetap3.toString());

        System.out.println("\n==================DATA PEGAWAI HARIAN==================");
        Pegawai harian1 = new PegawaiHarian("Coutinho", "27013224465001", 4500.0, 40);
        System.out.println(harian1.toString());
        Pegawai harian2 = new PegawaiHarian("Gavi", "35050011998879", 8500.0, 30);
        System.out.println(harian2.toString());
        Pegawai harian3 = new PegawaiHarian("Pedri", "21100299709365", 6000.0, 46);
        System.out.println(harian3.toString());
        
        System.out.println("\n==================DATA SALES==================");
        Pegawai sales1 = new Sales("Salah", "35087642219482", 40, 150000.0);
        System.out.println(sales1.toString());
        Pegawai sales2 = new Sales("Mane", "34990277000123", 60, 60000.0);
        System.out.println(sales2.toString());
        Pegawai sales3 = new Sales("Jota", "31050300110009",70 , 65000.0);
        System.out.println(sales3.toString() + "\n");
        
        System.out.println("=================Data Diri============================");
        System.out.println("NAMA  : Fahru Setiawan Iskandar");
        System.out.println("NIM   : 215150600111026");
        System.out.println("KELAS : PTI-B");
    }
}



