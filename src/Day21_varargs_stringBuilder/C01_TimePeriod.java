package Day21_varargs_stringBuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class C01_TimePeriod {

    public static void main(String[] args) {

        LocalDate dogumTarihi = LocalDate.of(1987,3,17);
        LocalDate bugün = LocalDate.now();

        Period yas = Period.between(dogumTarihi,bugün);
        System.out.println(yas);  //P36Y6M17D

        System.out.println(yas.getYears()); // 36

        LocalDate dogumTarihi1 = LocalDate.of(1986,10,3);
        LocalDate bugün1 = LocalDate.now();

        Period yas2 = Period.between(dogumTarihi1,bugün1);
        System.out.println(yas2);  // P37Y1D

        System.out.println(yas2.getYears());  // 37



    }
}
