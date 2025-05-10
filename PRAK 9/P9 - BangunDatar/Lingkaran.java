/* Nama  : Kaila Talitha Putri 
 * Nim   : 24060123140179
 * Kelas : C
 * Lab   : C1 
 */

public class Lingkaran extends BangunDatar{
    private double jejari;
    
    public Lingkaran(double jejari){
        this.jejari = jejari;
    }

    @Override
    public double hitungLuas(){
        return 3.14*jejari*jejari;
    }
    
    @Override
    public double hitungKeliling(){
        return 2*jejari*3.14;
    }
}