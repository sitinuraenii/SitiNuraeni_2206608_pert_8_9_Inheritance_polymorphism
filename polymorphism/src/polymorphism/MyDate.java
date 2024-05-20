package polymorphism;

import java.time.LocalDate;

public class MyDate {
    private LocalDate date;

    public MyDate(int tahun, int bulan, int tanggal) {
        this.date = LocalDate.of(tahun, bulan, tanggal);
    }

    @Override
    public String toString() {
        return date.toString();
    }
}
