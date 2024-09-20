// Write a ‘java’ program to check whether given number is Armstrong or not. (Use static keyword) 


import java.util.Scanner;

public class q3 {
    static int arm = 0;

    static void arms() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int num = sc.nextInt();
        int temp = num;

        while (temp != 0) {
            int m = temp % 10;
            arm += m * m * m;
            temp /= 10;
        }
        if (arm == num) {
            System.out.println("the number is armstrong");
        } else {
            System.out.println("not a armstrong ");
        }
    }

    public static void main(String[] args) {
        arms();

    }
}
