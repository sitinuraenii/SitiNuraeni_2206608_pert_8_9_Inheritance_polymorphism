package polymorphism;

public class Person {
    private String nama;
    private String alamat;
    private String no_telp;
    private String email;


    public Person(String nama, String alamat, String no_telp, String email){
        this.nama=nama;
        this.alamat=alamat;
        this.no_telp=no_telp;
        this.email=email;
    }

@Override
    public String toString() {
        return this.getClass().getSimpleName() + ": " + nama;
    }
}