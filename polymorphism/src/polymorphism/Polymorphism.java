package polymorphism;

import java.util.Scanner;

public class Polymorphism {

    public static void main(String[] args) {
        Scanner polymorphism = new Scanner (System.in);
        
        System.out.println("Detail Person : ");
        System.out.print("Nama : ");
        String nama = polymorphism.nextLine();
        System.out.print("Alamat : ");
        String alamat = polymorphism.nextLine();
        System.out.print("No telepon : ");
        String no_telp = polymorphism.nextLine();
        System.out.print("Email : ");
        String email = polymorphism.nextLine();
        Person person = new Person(nama, alamat, no_telp, email);
        System.out.println("");

        System.out.println("Detail Student :");
        System.out.print("Nama: ");
        nama = polymorphism.nextLine();
        System.out.print("Alamat : ");
        alamat = polymorphism.nextLine();
        System.out.print("No telepon : ");
        no_telp = polymorphism.nextLine();
        System.out.print("Email: ");
        email = polymorphism.nextLine();
        System.out.print("Status (1=mahasiswa baru, 2=mahasiswa tahun kedua, 3=Junior, 4=Senior): ");
        int status = polymorphism.nextInt();
        polymorphism.nextLine(); 
        Student student = new Student(nama, alamat, no_telp, email, status);
        System.out.println("");
        
        System.out.println("Detail Employee : ");
        System.out.print("Nama: ");
        nama = polymorphism.nextLine();
        System.out.print("Alamat : ");
        alamat = polymorphism.nextLine();
        System.out.print("No telepon : ");
        no_telp = polymorphism.nextLine();
        System.out.print("Email : ");
        email = polymorphism.nextLine();
        System.out.print("Kantor : ");
        String kantor = polymorphism.nextLine();
        System.out.print("Gaji : ");
        double gaji = polymorphism.nextDouble();
        System.out.print("tahun bulan tanggal : ");
        int tahun = polymorphism.nextInt();
        int bulan = polymorphism.nextInt();
        int tanggal = polymorphism.nextInt();
        polymorphism.nextLine(); 
        MyDate rekrut = new MyDate(tahun, bulan, tanggal);
        Employee employee = new Employee(nama, alamat, no_telp, email, kantor, gaji, rekrut);
        System.out.println("");
        
        System.out.println("details Faculty:");
        System.out.print("Nama: ");
        nama = polymorphism.nextLine();
        System.out.print("Alamat : ");
        alamat = polymorphism.nextLine();
        System.out.print("No telepon : ");
        no_telp = polymorphism.nextLine();
        System.out.print("Email: ");
        email = polymorphism.nextLine();
        System.out.print("Kantor : ");
        kantor = polymorphism.nextLine();
        System.out.print("Gaji : ");
        gaji = polymorphism.nextDouble();
        System.out.print("tahun bulan tanggal : ");
        tahun = polymorphism.nextInt();
        bulan = polymorphism.nextInt();
        tanggal = polymorphism.nextInt();
        polymorphism.nextLine(); 
        rekrut = new MyDate(tahun, bulan, tanggal);
        System.out.print("Jam kerja : ");
        String jamKerja = polymorphism.nextLine();
        System.out.print("pangkat : ");
        String pangkat = polymorphism.nextLine();
        Faculty faculty = new Faculty(nama, alamat, no_telp, email, kantor, gaji, rekrut, jamKerja, pangkat);
        System.out.println("");
        
        System.out.println("details Staff:");
        System.out.print("Nama: ");
        nama = polymorphism.nextLine();
        System.out.print("Alamat : ");
        alamat = polymorphism.nextLine();
        System.out.print("No telepon : ");
        no_telp = polymorphism.nextLine();
        System.out.print("Email: ");
        email = polymorphism.nextLine();
        System.out.print("Kantor : ");
        kantor = polymorphism.nextLine();
        System.out.print("Gaji : ");
        gaji = polymorphism.nextDouble();
        System.out.print("tahun bulan tanggal : ");
        tahun = polymorphism.nextInt();
        bulan = polymorphism.nextInt();
        tanggal = polymorphism.nextInt();
        polymorphism.nextLine();
        rekrut = new MyDate(tahun, bulan, tanggal);
        System.out.print("Gelar : ");
        String gelar = polymorphism.nextLine();
        Staff staff = new Staff(nama, alamat, no_telp, email, kantor, gaji, rekrut, gelar);
        System.out.println("");
        
        System.out.println("Hasil : ");
        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
        
    }
    
}
