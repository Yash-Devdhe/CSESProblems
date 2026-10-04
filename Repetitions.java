import java.util.Scanner;

public class Repetitions {

    public static void main(String[] args) {

        int count = 1;
        int maxi = 1;

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        for(int i = 1; i < s.length(); i++) {

            if(s.charAt(i) == s.charAt(i - 1)) {
                count++;
                maxi = Math.max(maxi, count);
            }
            else {
                count = 1;
            }
        }

        System.out.println(maxi);
    }
}