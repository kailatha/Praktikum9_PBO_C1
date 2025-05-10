/* Nama  : Kaila Talitha Putri 
 * Nim   : 24060123140179
 * Kelas : C
 * Lab   : C1 
 */

public class Persegi extends BangunDatar{
    private double sisi;

    public Persegi(double sisi){
        this.sisi = sisi;
    }

    @Override
    public double hitungLuas(){
        return sisi*sisi;
    }

    @Override
    public double hitungKeliling(){
        return 4*sisi;
    }
}
