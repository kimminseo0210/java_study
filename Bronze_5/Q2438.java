package Bronze_5;
// 백준 Bronze : 2438
import java.util.*;

public class Q2438 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int starCount = scan.nextInt();

        for(int i=1; i<=starCount;i++) {
            for(int j=1;j<i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
