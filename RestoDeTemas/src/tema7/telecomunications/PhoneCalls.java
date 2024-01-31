package tema7.telecomunications;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class PhoneCalls implements Comparable<PhoneCalls> {
    String phoneNumberC;
    String phoneNumberIn;
    LocalDateTime dateIn;
    LocalDateTime dateOut;
    zone zone;
    boolean outgoing;
    double [] fees = {1, 2.5, 0.5, 0.3, 0.6 };

    public PhoneCalls(String phoneNumberC, String phoneNumberIn, String dateIn, String dateOut,
            tema7.telecomunications.zone zone, boolean outgoing) {

        this.phoneNumberC = phoneNumberC;
        this.phoneNumberIn = phoneNumberIn;

        DateTimeFormatter formate = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime dateTimeIn = LocalDateTime.parse(dateIn, formate);
        LocalDateTime dateTimeOut = LocalDateTime.parse(dateOut, formate);

        this.dateIn = dateTimeIn;
        this.dateOut = dateTimeOut;
        this.zone = zone;
        this.outgoing = outgoing;

    }

    public long duration() {
        return this.dateIn.until(this.dateOut, ChronoUnit.MINUTES);
    }

    public double price() {
        if (outgoing) {
            double fee = this.fees[zone.ordinal()];
            double duration = this.duration();
            System.out.println("a");
            return fee * duration / 100;
        }else {
            System.out.println("b");
            return 0;
        }
    }

    public int compareTo(PhoneCalls phoneCalls) {
        if (this.phoneNumberC.equals(phoneCalls.phoneNumberC)) {
            return this.dateIn.compareTo(phoneCalls.dateIn);
        } else {
            return this.phoneNumberC.compareTo(phoneCalls.phoneNumberC);
        }

    }

    @Override
    public String toString() {
        return "client number: " + this.phoneNumberC + " intercount number: " + this.phoneNumberIn + " start date; "
                + this.dateIn + " end date; " + this.dateOut + " zone: " + this.zone + " duration: " + this.duration() + " price: " + this.price();
    }

}
