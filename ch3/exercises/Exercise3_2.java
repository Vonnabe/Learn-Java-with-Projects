package ch3.exercises;

//Exercise 3.2: Proper nutrition is essential for the health of our dinosaurs. The caretakers want to have a rough guideline of how much to feed a
//dinosaur. Write a program that determines the amount of food required for a dinosaur based on its weight. You can come up with
//the amount of food needed per weight unit of the dinosaurs.

public class Exercise3_2 {
    public static void main(String[] args) {
        double dinoWeight = 4451.5; 
        double foodPerKg = 0.1; 

        double feedTime = dinoWeight * foodPerKg;
        System.out.println("The total amount of food needed for the dinosaur is: " + feedTime + " kg");

    }
}
