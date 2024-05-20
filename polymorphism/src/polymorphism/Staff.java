
package polymorphism;

public class Staff extends Employee {
    private String gelar;
    
    public Staff(String nama, String alamat, String no_telp, String email, String kantor, double gaji, MyDate rekrut, String gelar){
        super(nama, alamat, no_telp, email, kantor, gaji, rekrut );
        this.gelar=gelar;
    }
    
     @Override
    public String toString() {
        return super.toString() + ", Gelar : " + gelar;
    }
}
