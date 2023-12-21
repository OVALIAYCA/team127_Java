package Day20_mutable_ImmutableClasses;

import java.time.LocalDateTime;

public class C05_LocalDateTime {

    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);  // 2023-10-03   T11:32:51.165755

        //kullanıcıya zamani 3 Ekim 2023 Salı şeklinde yazdırın

        System.out.println(ldt.getDayOfMonth() + " "
        + ldt.getMonth() + " "
        + ldt.getYear() + " "
        + ldt.getDayOfWeek());

        //3 OCTOBER 2023 TUESDAY
        // 03 Oct 2023 Tue gibi istersek datetimeformatter daha kolaydır



    }
}
