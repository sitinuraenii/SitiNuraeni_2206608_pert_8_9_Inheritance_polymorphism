
package polymorphism;

public class Faculty extends Employee {
    private String jamKerja;
    private String pangkat;

    public Faculty(String nama, String alamat, String no_telp, String email, String kantor, double gaji, MyDate rekrut, 
            String jamKerja, String pangkat) {
        super(nama, alamat, no_telp, email, kantor, gaji, rekrut);
        this.jamKerja = jamKerja;
        this.pangkat = pangkat;
    }

    @Override
    public String toString() {
        return super.toString() + ", Jam Kerja : " + jamKerja + ", Pangkat: " + pangkat;
    }
}
