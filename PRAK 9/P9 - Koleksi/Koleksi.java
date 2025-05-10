/* Nama  : Kaila Talitha Putri 
 * Nim   : 24060123140179
 * Kelas : C
 * Lab   : C1 
 */

public class Koleksi {
    private int nbelm;
    private char[] wadah;

    public Koleksi(int kapasitas) {
        wadah = new char[kapasitas];
        nbelm = 0;
    }

    public char[] getIsi() {
        char[] isi = new char[nbelm];
        for (int i = 0; i < nbelm; i++) {
            isi[i] = wadah[i];
        }
        return isi;
    }

    public void setIsi(int index, char nilaiBaru) {
        if (index >= 0 && index < nbelm) {
            wadah[index] = nilaiBaru;
        } else {
            System.out.println("tidak valid.");
        }
    }

    public int getSize() {
        return nbelm;
    }

    public void setSize(int ukuranBaru) {
        if (ukuranBaru >= 0 && ukuranBaru <= wadah.length) {
            nbelm = ukuranBaru;
        } else {
            System.out.println("tidak valid.");
        }
    }

    public void add(char elemen) {
        if (nbelm < wadah.length) {
            wadah[nbelm] = elemen;
            nbelm++;
        } else {
            System.out.println("Koleksi penuh.");
        }
    }

    public void delete(int index) {
        if (index >= 0 && index < nbelm) {
            for (int i = index; i < nbelm - 1; i++) {
                wadah[i] = wadah[i + 1];
            }
            nbelm--;
        } else {
            System.out.println("tidak valid.");
        }
    }

    public void showAll() {
        System.out.print("Isi Koleksi: ");
        for (int i = 0; i < nbelm; i++) {
            System.out.print(wadah[i] + " ");
        }
        System.out.println();
    }
}
