/* Nama  : Kaila Talitha Putri 
 * Nim   : 24060123140179
 * Kelas : C
 * Lab   : C1 
 */

public class Anjing extends Anabul{

    public Anjing(String nama){
        super(nama);
    }
    
    @Override
    public void gerak(){
        System.out.println(nama + " bergerak dengan cara melata");
    }

    @Override
    public void bersuara(){
        System.out.println(nama + " bersuara guk-guk");
    }
}
