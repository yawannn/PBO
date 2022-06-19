/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikoem;

/**
 *
 * @author ASUS
 */
public class PegawaiTetap extends Pegawai {
    private double upah;

    public PegawaiTetap(String nama, String noKTP, double upah) {
        super(nama, noKTP);
        this.upah = upah;
    }

    public double getUpah() {
        return upah;
    }

    public void setUpah(double upah) {
        this.upah = upah;
    }

    @Override
    public String toString() {
        return  "\nPegawai Tetap   : " + getNama() +
                "\nNo. KTP         : " + getNoKTP() +
                "\nUpah            : " + getUpah() +
                "\nPendapatan      : " + "Rp " + (int)getUpah();
    }
}
