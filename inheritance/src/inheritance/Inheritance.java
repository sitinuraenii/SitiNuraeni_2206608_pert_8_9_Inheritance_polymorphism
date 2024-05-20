package inheritance;
import java.util.Scanner;
public class Inheritance {

    public static void main(String[] args) {
        Scanner inheritance = new Scanner(System.in);

        System.out.print("Sisi 1 : ");
        double side1 = inheritance.nextDouble();

        System.out.print("Sisi 2 : ");
        double side2 = inheritance.nextDouble();

        System.out.print("Sisi 3 : ");
        double side3 = inheritance.nextDouble();

        System.out.print("Warna apa? : ");
        String color = inheritance.next();

        System.out.print("Isi segitiga (true/false)? : ");
        boolean filled = inheritance.nextBoolean();

        Segitiga segitiga = new Segitiga(side1, side2, side3);
        segitiga.setColor(color);
        segitiga.setFilled(filled);
        
        System.out.println("");
        System.out.println(segitiga);
        System.out.println("Luas: " + segitiga.getArea());
        System.out.println("Keliling: " + segitiga.getPerimeter());
        System.out.println("Warna: " + segitiga.getColor());
        System.out.println("Terisi: " + segitiga.isFilled());
    }
}
