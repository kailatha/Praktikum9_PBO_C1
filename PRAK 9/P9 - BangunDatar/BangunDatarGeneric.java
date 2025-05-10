/* Nama  : Kaila Talitha Putri 
 * Nim   : 24060123140179
 * Kelas : C
 * Lab   : C1 
 */

public class BangunDatarGeneric<T extends BangunDatar> {
    private T bangunDatar;

    public void set(T tipeBangunDatar) {
        bangunDatar = tipeBangunDatar;
    }

    public T get() {
        return bangunDatar;
    }

    public double hitungLuas() {
        return bangunDatar.hitungLuas();
    }

    public double hitungKeliling() {
        return bangunDatar.hitungKeliling();
    }
}

