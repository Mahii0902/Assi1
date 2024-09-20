// Write a java program to display all the vowels from a given string.

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine();
        char vo[] = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < vo.length; j++) {
                if (str.charAt(i) == vo[j]) {
                    System.out.println(str.charAt(i));
                }
            }
        }
        sc.close();
    }
}
