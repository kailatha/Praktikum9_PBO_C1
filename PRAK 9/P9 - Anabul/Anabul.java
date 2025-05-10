/* Nama  : Kaila Talitha Putri 
 * Nim   : 24060123140179
 * Kelas : C
 * Lab   : C1 
 */

public abstract class Anabul{
    protected String nama;

    public Anabul(String nama){
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public abstract void gerak();
    public abstract void bersuara();

}