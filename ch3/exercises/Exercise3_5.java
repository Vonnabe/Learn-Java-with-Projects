package ch3.exercises;

public class Exercise3_5 {
    public static void main(String[] args) {
    
        int dino1Age = 7; 
        int dino2Age = 10; 

        int ageDifference =dino1Age - dino2Age;
        if(ageDifference < 0) {
            ageDifference *=-1; 
        }
        System.out.println("Age Difference: " + ageDifference + " years");

    }
}
