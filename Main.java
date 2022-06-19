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
        System.out.println("NAMA  : FAHRU SETIAWAN ISKANDAR");
        System.out.println("NIM   : 215150600111026");
        System.out.println("KELAS : PTI-B");

        System.out.println("======================== DATA PEKERJA ========================");
        Pekerja pkr1 = new Pekerja(9, 31, "205102439283", "Elvaretta Rizky ", "622734535", false, true);
        System.out.println(pkr1.toString());
        System.out.println("======================== DATA PEKERJA ========================");
        Pekerja pkr2 = new Pekerja(8, 28, "195102439283", "Iqbal Biondy ", "351717969", true, true);
        System.out.println(pkr2.toString());
        System.out.println("======================== DATA PEKERJA ========================");
        Pekerja pkr3 = new Pekerja(9, 20, "213100223567", "Danila Putri", "566411981", false, true);
        System.out.println(pkr3.toString());

        System.out.println("\n");

        System.out.println("======================== DATA MANAJER ========================");
        Manajer man1 = new Manajer(6, 17, "124452346263", "M. Nur Ramadhan", "350511256676", true, false, 1500);
        System.out.println(man1.toString());
        System.out.println("======================== DATA MANAJER ========================");
        Manajer man2 = new Manajer(7, 26, "251627886577", "Nurul Hidayah ", "230566922111", false, true, 1600);
        System.out.println(man2.toString());
        System.out.println("======================== DATA MANAJER ========================");
        Manajer man3 = new Manajer(9, 27, "211188639267", "Rizky Al-fatihatul ", "192876952452", true, true, 1200);
        System.out.println(man3.toString());

        System.out.println("");
        System.out.println("======================== DATA MAHASISWA ========================");
        MahasiswaFilkom mw1 = new MahasiswaFilkom("Carrisa Alyeda", "45126141324", false, false, "205150601111025", 3.9);
        System.out.println(mw1.toString());
        System.out.println("======================== DATA MAHASISWA ========================");
        MahasiswaFilkom mw2 = new MahasiswaFilkom("Willy Aidil", "456574338912", true, true, "215150600111215", 3.6);
        System.out.println(mw2.toString());
        System.out.println("======================== DATA MAHASISWA ========================");
        MahasiswaFilkom mw3 = new MahasiswaFilkom("Dicky Surya Nanda", "261233689485", true, false, "195150607112226", 3.5);
        System.out.println(mw3.toString());
    }
}



