/* Nama  : Kaila Talitha Putri 
 * Nim   : 24060123140179
 * Kelas : C
 * Lab   : C1 
 */

public class Segitiga extends BangunDatar{
    private double alas;
    private double tinggi;
    private double sisiA, sisiB, sisiC;

    public Segitiga(double alas, double tinggi, double sisiA, double sisiB, double sisiC){
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
    }

    @Override
    public double hitungLuas(){
        return 0.5 * alas * tinggi;
    }

    @Override
    public double hitungKeliling(){
        return sisiA + sisiB + sisiC;
    }
}
