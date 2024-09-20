

// Write a java program to display following pattern:
// 5
// 45
// 345
// 2345
// 12345

public class q5{
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <=5; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
 
