import java.util.Scanner;

public class bitplusplus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int num_of_cases = sc.nextInt();
        while (num_of_cases-- > 0) {
            String s = sc.next();
            if (s.equals("++X") || s.equals("X++"))
                x++;
            else
                x--;
        }
        System.out.println(x);
        sc.close();
    }
}
