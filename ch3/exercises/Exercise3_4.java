package ch3.exercises;
//Create a program that checks whether the park’s maximum capacity has been reached. The program only needs to print true or
//false after the words “Max capacity reached:”. This is crucial in maintaining safety standards and ensuring a positive visitor
//experience.
public class Exercise3_4 {
    public static void main(String[] args) {
        int maximumCapacity = 1000;
        int currentVisitors = 885;

        boolean maxCapacityReached = currentVisitors == maximumCapacity;
        System.out.println("Max capacity reached: " + maxCapacityReached);


    }
}
