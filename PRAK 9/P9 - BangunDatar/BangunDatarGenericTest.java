/* Nama  : Kaila Talitha Putri 
 * Nim   : 24060123140179
 * Kelas : C
 * Lab   : C1 
 */

public class BangunDatarGenericTest {
    public static void main(String[] args) {
        BangunDatarGeneric<Lingkaran> bdLingkaran = new BangunDatarGeneric<>();
        bdLingkaran.set(new Lingkaran(2));
        System.out.println("Luas Lingkaran          : " + bdLingkaran.hitungLuas());
        System.out.println("Keliling Lingkaran      : " + bdLingkaran.hitungKeliling());
        System.out.println("Tipe generic            : " + bdLingkaran.get().getClass().getName());

        BangunDatarGeneric<Persegi> bdPersegi = new BangunDatarGeneric<>();
        bdPersegi.set(new Persegi(4));
        System.out.println("Luas Persegi             : " + bdPersegi.hitungLuas());
        System.out.println("Keliling Persegi         : " + bdPersegi.hitungKeliling());
        System.out.println("Tipe generic             : " + bdPersegi.get().getClass().getName());

        BangunDatarGeneric<PersegiPanjang> bdPP = new BangunDatarGeneric<>();
        bdPP.set(new PersegiPanjang(5, 3));
        System.out.println("Luas Persegi Panjang     : " + bdPP.hitungLuas());
        System.out.println("Keliling Persegi Panjang : " + bdPP.hitungKeliling());
        System.out.println("Tipe generic             : " + bdPP.get().getClass().getName());

        BangunDatarGeneric<Segitiga> bdSegitiga = new BangunDatarGeneric<>();
        bdSegitiga.set(new Segitiga(4, 5,3, 4, 5));
        System.out.println("Luas Segitiga            : " + bdSegitiga.hitungLuas());
        System.out.println("Keliling Segitiga        : " + bdSegitiga.hitungKeliling());
        System.out.println("Tipe generic             : " + bdSegitiga.get().getClass().getName());
    }
}


//Mengganti T dengan T1, T2, atau T1234 tidak mempengaruhi fungsionalitas program. 
//Hal ini karena T hanyalah simbol atau nama parameter generic. 
//Yang penting adalah konsistensi penggunaan simbol tersebut di seluruh kelas. 
//Namun, konvensi umum dalam pemrograman Java adalah menggunakan nama-nama pendek seperti T untuk menjaga keterbacaan kode.