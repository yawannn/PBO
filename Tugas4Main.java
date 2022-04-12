
package cobaa;

import java.util.Scanner;


public class Tugas4Main {

    public static void main(String[] WKWKWKWK){
        Scanner wkwk = new Scanner(System.in);

        // input data merchant
        DataMerchant.merchant = DataMerchant.tambahMerchant(new Merchant("Bakso Pak Sahid", "Bakso", 8000));
        DataMerchant.merchant = DataMerchant.tambahMerchant(new Merchant("Nasgor Mblebes", "Nasi Goreng Jawa", 10000));
        DataMerchant.merchant = DataMerchant.tambahMerchant(new Merchant("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 8000));

        System.out.println("Nama    :Fahru Setiawan Iskandar");
        System.out.println("Nim     :215150600111026");
        DataMerchant.tampilData();
        System.out.println();

       //tambah data merchant dengan inputan
        System.out.println("===Memasukkan Data Merchant Melalui Input===");
        System.out.print("Input Nama Merchant : ");
        String m = wkwk.nextLine();
        System.out.print("Input Nama Produk : ");
        String p = wkwk.nextLine();
        System.out.print("Input Harga Produk : ");
        double h = wkwk.nextDouble();
        wkwk.nextLine();

        DataMerchant.merchant = DataMerchant.tambahMerchant(new Merchant(m, p, h));
        System.out.println();

        //menampilkan data merchan
        System.out.println("===Menampilkan Data Merchant===");
        DataMerchant.tampilData();
        System.out.println();

        //mengubah data merchant sekaligus mencari merchant
        System.out.println("Update Merchant: ");
        String nama = wkwk.nextLine();
        String jual = wkwk.nextLine();
        double harga = wkwk.nextDouble();
        DataMerchant.updateMerchant(DataMerchant.cariMerchant("Bakso Pak Sahid"), nama, jual, harga);

        //menampilkan data merchant yang diupdate
        System.out.println("===Menampilkan Data Merchant yang nilainya sudah di update===");
        
        DataMerchant.tampilData();

        System.out.println();
        System.out.println("Nama    :Fahru Setiawan Iskandar");
        System.out.println("Nim     :215150600111026"); 
    }
    
}
