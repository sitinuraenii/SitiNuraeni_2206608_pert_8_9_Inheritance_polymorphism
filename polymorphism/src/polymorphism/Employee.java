
package polymorphism;


public class Employee extends Person {
    private String kantor;
    private double gaji;
    private MyDate rekrut;
    
    public Employee(String nama, String alamat, String no_telp, String email, String kantor, double gaji, MyDate rekrut){
        super(nama, alamat, no_telp, email);
        this.kantor=kantor;
        this.gaji=gaji;
        this.rekrut=rekrut;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Kantor : " + kantor + ", Gaji : " + gaji + ", Tanggal diPekerjakan : " + rekrut;
    }
}
