/* Nama  : Kaila Talitha Putri 
 * Nim   : 24060123140179
 * Kelas : C
 * Lab   : C1 
 */

import java.util.*;

public class KoleksiAnabul<T extends Anabul> {
    private List<T> koleksi;

    public KoleksiAnabul() {
        this.koleksi = new ArrayList<>();
    }

    public void add(T o){
        koleksi.add(o);
    }

    public void showAll(){
        for( T anabul : koleksi){
            System.out.println("Nama : "+ anabul.getNama());
            anabul.gerak();
            anabul.bersuara();
            System.out.println();
        }
    }
    
}
