// Write a java program to display alternate character from a given string.

public class q4 {
    public static void main(String[] args) {
        String s ="patlan cha bailgada";
        for (int i = 0; i < s.length(); i+=2) {
            System.out.print(s.charAt(i)+" ");
        }
        System.out.println();
    }
}
