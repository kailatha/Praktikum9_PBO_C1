/* Nama  : Kaila Talitha Putri 
 * Nim   : 24060123140179
 * Kelas : C
 * Lab   : C1 
 */

public class MainKoleksi {
    public static void main(String[] args) {
        Koleksi koleksiKarakter = new Koleksi(10);

        koleksiKarakter.add('A');
        koleksiKarakter.add('B');
        koleksiKarakter.add('C');
        koleksiKarakter.add('D');
        koleksiKarakter.add('E');
        koleksiKarakter.add('F');
        koleksiKarakter.add('G');
        koleksiKarakter.add('H');
        koleksiKarakter.add('I');
        koleksiKarakter.add('J');

        koleksiKarakter.showAll();

        koleksiKarakter.setIsi(9, 'Z');
        System.out.println("Setelah mengedit indeks ke-9:");
        koleksiKarakter.showAll();

        koleksiKarakter.delete(5);
        System.out.println("Setelah menghapus indeks ke-5:");
        koleksiKarakter.showAll();

        System.out.println("Ukuran koleksi : " + koleksiKarakter.getSize());
    }
}

