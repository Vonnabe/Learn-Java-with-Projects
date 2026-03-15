package ch3.exercises;
//For our park, we need to have a leap year checker. In our commitment to scientific accuracy, use the modulus operator to
//determine if the current year is a leap year. We want to make sure our calendar-themed exhibits are always up to date.
public class Exercise3_3 {
    public static void main(String[] args) {

        int currentYear = 2026;

        boolean isLeapYear = currentYear % 4 == 0 && (currentYear % 100 != 0 || currentYear % 400 == 0);
        System.out.println("Is it a Leap Year? " + (isLeapYear ? "Yes" : "No"));

    }
}
