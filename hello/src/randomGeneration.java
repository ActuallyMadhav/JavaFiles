package hello.src;

import java.util.Random;

public class randomGeneration {
    public static void main(String[] args){
        Random random = new Random();

        int num = random.nextInt(-10, 10);
        System.out.println(num);

        boolean isHeads = random.nextBoolean();

        if(isHeads){
            System.out.println("HEADS!");
        }
        else{
            System.out.println("TAILS!");
        }
    }
}
