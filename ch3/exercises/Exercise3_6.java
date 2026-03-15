package ch3.exercises;

public class Exercise3_6 {
    public static void main(String[] args) {
double minSafeRating = 7.3;
double currentRating = 8.8;

boolean safeToOpenForPublic = currentRating >= minSafeRating;
        System.out.println("Is it safe to open for the public? " + safeToOpenForPublic);

    }
}
