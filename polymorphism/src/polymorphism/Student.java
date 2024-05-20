package polymorphism;

public class Student extends Person {
    public static final int mahasiswa_baru = 1;
    public static final int mahasiswa_tahun_kedua = 2;
    public static final int junior = 3;
    public static final int senior = 4;

    private int status;

    public Student(String nama, String alamat, String no_telp, String email, int status) {
        super(nama, alamat, no_telp, email);
        this.status = status;
    }

    @Override
    public String toString() {
        String statusStr = "";
        switch (status) {
            case mahasiswa_baru: statusStr = "Mahasiswa baru"; break;
            case mahasiswa_tahun_kedua: statusStr = "Mahasiswa tahun kedua"; break;
            case junior: statusStr = "Junior"; break;
            case senior: statusStr = "Senior"; break;
        }
        return super.toString() + ", Status: " + statusStr;
    }
}