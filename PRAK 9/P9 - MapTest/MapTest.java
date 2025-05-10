/* Nama  : Kaila Talitha Putri 
 * Nim   : 24060123140179
 * Kelas : C
 * Lab   : C1 
 */

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        //Kunci -> int, nilai -> String 
        Map<Integer,String> map = new HashMap<Integer,String>();
        //menempatkan elemen kunci dan nilai 
        map.put(1,"Satu");
        map.put(2, "dua");
        map.put(3, "tiga");
        
        //mengambil elemen pertama
        System.out.println(map.get(1));
        System.out.println(map.size());
        
        System.out.println(map);
        //mengambil keseluruhan kunci sebagai objek collection set
        Set<Integer> key = map.keySet();
        for (Integer k : key) {
            System.out.println("Kunci: " + k + ", Nilai: " + map.get(k));
        }
    }  
}
