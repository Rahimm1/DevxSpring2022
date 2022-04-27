package class19;

import java.util.Scanner;

public class FindDivisor {
    public static void main(String[] args) {
        System.out.println("please enter number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int count = 0;
        for(int i = 1; i<=num; i++){ // gets executed 10 times
            if(num%i==0){ // this will be true only 4 times
                System.out.println(i); // this will be true only 4 times
                count++;

            }
        }

        System.out.println(count);
    }
}
