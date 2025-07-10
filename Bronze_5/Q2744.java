package Bronze_5;
import java.util.*;

public class Q2744 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String wordInput = scan.next();

        for(int i=0; i<wordInput.length(); i++) {
            char c = wordInput.charAt(i);
            // 소문자 -> 대문자
            if (Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
                System.out.print(c);
            } // 대문자 -> 소문자
            else if (Character.isLowerCase(c)) {
                c = Character.toUpperCase(c);
                System.out.print(c);
            }
        }
        scan.close();
    }
}
