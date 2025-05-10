/* Nama  : Kaila Talitha Putri 
 * Nim   : 24060123140179
 * Kelas : C
 * Lab   : C1 
 */

public class AMain {
    public static void main(String[] args) {
        KoleksiAnabul<Anabul> koleksi = new KoleksiAnabul<>();

        koleksi.add(new Kucing("Scara"));
        koleksi.add(new Anjing("Kazu"));
        koleksi.add(new Burung("Shenhe"));
        koleksi.add(new Kucing("Diona"));
        koleksi.add(new Anjing("Gorou"));
        koleksi.add(new Burung("Venti"));
        koleksi.add(new Kucing("Collei"));
        koleksi.add(new Anjing("Tighnari"));
        koleksi.add(new Burung("Sara"));
        koleksi.add(new Kucing("Keqing"));

        koleksi.showAll();
    }
}
