package tema7.telecomunications;

import java.util.Arrays;



public class test {

    public static void main(String[] args) {

        
        PhoneCalls[] a1 = {
                new PhoneCalls("688336229", "971145150", "31/01/2024 10:00:00", "31/01/2024 10:50:00", zone.USA, true),
                new PhoneCalls("688336229", "971145150", "20/02/2024 10:00:00", "20/02/2024 10:50:00", zone.UK, false),
                new PhoneCalls("688336229", "971145150", "20/01/2024 10:00:00", "20/01/2024 10:50:00", zone.UK, true)
        };

        Arrays.sort(a1);

        for (PhoneCalls Calls : a1) {
            System.out.println(Calls.toString());
        }

    }

}
