package OOP.Lesson4.DuringLesson;

import java.util.Scanner;

public class Main5 { // 5 - masala
    public static void main(String[] args) {
        Scanner mr = new Scanner(System.in);
        int n = mr.nextInt();
        for(int i = 1; i <= n; i++){
            int sum1 = 0;
            int sum2 = 0;
            for(int j = 1; j <= i/2; j++){
                if(i%j==0) sum1 += j;
            }
            for(int j = 1; j <= sum1/2; j++){
                if(sum1 % j == 0){
                    sum2 += j;
                }
            }
            if(i == sum2 && i < sum1){
                System.out.println(i + " " + sum1);
            }
        }

    }
}
