package pl.edu.agh.to.lab4;

import java.util.Calendar;
import java.time.LocalDate;
import java.time.Period;

public class Prisoner extends Suspect{
    private final int judgementYear;

    private final int sentenceDuration;

    private final String pesel;

    public Prisoner(String firstname, String lastname, String pesel, int judgementYear, int sentenceDuration) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.pesel = pesel;
        this.judgementYear = judgementYear;
        this.sentenceDuration = sentenceDuration;

        int year = Integer.parseInt(pesel.substring(0, 2));
        int month = Integer.parseInt(pesel.substring(2, 4));
        int day = Integer.parseInt(pesel.substring(4, 6));

        if (month > 80) {
            year += 1800;
            month -= 80;
        }
        else if (month > 60) {
            year += 2200;
            month -= 60;
        }
        else if (month > 40) {
            year += 2100;
            month -= 40;
        }
        else if (month > 20) {
            year += 2000;
            month -= 20;
        }
        else {
            year += 1900;
        }

        LocalDate birthdate = LocalDate.of(year, month, day);
        LocalDate now = LocalDate.now();
        this.age = Period.between(birthdate, now).getYears();
    }

    public String getPesel() {
        return pesel;
    }

    public boolean isJailedNow() {
        return judgementYear + sentenceDuration >= getCurrentYear();
    }

    public int getCurrentYear() {
        return Calendar.getInstance().get(Calendar.YEAR);
    }
}
