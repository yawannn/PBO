package cobaoop;

import java.util.Scanner;


public class Tugas1b {
    public static void main(String[] args){
        Scanner wkwk = new Scanner(System.in);
        String huruf = wkwk.nextLine();
        int geser = wkwk.nextInt();
        System.out.println(ubah(huruf,geser));
    }
    public static String ubah(String huruf, int geser) {
        String kembali = "";
        for(int i = 0; i < huruf.length(); i++) {
                char c = (char)(huruf.charAt(i));
            if (c >= 'A' && c <= 'Z') {     
                kembali += (char)((c - 'A' + geser) % 26 + 'A');
            }else if (c >= 'a' && c <= 'z') {
                kembali += (char)((c - 'a' + geser) % 26 + 'a');
            }else {
                kembali += c;
            }
        }
    return kembali;
    }
}

