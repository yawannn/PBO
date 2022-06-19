/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikoem;

/**
 *
 * @author ASUS
 */
public class Manajer extends Pekerja {
    private int lamaKerja;
    static int jml3 = 0;

    public Manajer(int jamKerja, int hariKerja, String NIP, String nama, String NIK, boolean jenisKelamin, boolean menikah, int lamaKerja) {
        super(jamKerja, hariKerja, NIP, nama, NIK, jenisKelamin, menikah);
        this.lamaKerja = lamaKerja;
    }

    public int getLamaKerja() {
        return lamaKerja;
    }
    public void setLamaKerja(int lamaKerja) {
        this.lamaKerja = lamaKerja;
    }

    public double bonusManajer(){
        return bonusPekerja() * 0.30;
    }
    public void totalManajer(){
        System.out.println(jml3);
    }

    public String toString(){
    jml3 ++;
    return  "Nama            : " + getNama() +
            "\nNIK             : " + getNIK() +
            "\nJenis Kelamin   : " + (isJenisKelamin()?"Laki-laki" : "Perempuan") +
            "\nNIP             : " + getNIP() +
            "\nPendapatan      : " + (bonusPekerja() + bonusManajer() + gaji() + getTunjangan() + 15) + '$' +
            "\nGaji            : " + gaji()  + '$' +
            "\nBonus           : " + (bonusPekerja() + bonusManajer())  + '$' +
            "\nStatus          : " + getStatus() +
            "\nLama Kerja      : " + getLamaKerja()+ " hari" ;
    }
}
