/**
 * Latihan63
 * Nama     : Muhammad Fauzan Fadhlulbarr
 * Kelas    : PBO10K
 * NIM      : 10119176
 * Program  : Gradien Garis Lurus
 */
public class PBO10k10119176Latihan63 {
    public static void main(String[] args) {
        Koordinat nKoordinat = new Koordinat(2, 10, 5, 7);
        System.out.println("Garis yang melalui titik ("+nKoordinat.getX1()+","+nKoordinat.getY1()+") dan ("+nKoordinat.getX2()+","+nKoordinat.getY2()+")");
        System.out.println("memiliki gradien sebesar " + nKoordinat.hitungGradien());
        
        Koordinat nKoordinat2 = new Koordinat(5, 1, 3, 12);
        System.out.println("Garis yang melalui titik ("+nKoordinat2.getX1()+","+nKoordinat2.getY1()+") dan ("+nKoordinat2.getX2()+","+nKoordinat2.getY2()+")");
        System.out.println("memiliki gradien sebesar " + nKoordinat2.hitungGradien());
    }
    
}
