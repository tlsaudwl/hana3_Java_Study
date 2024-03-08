import java.util.Scanner;

public class practice01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String str;
        if (num == 1 || num == 3 || num == 5 || num == 7) {
            str = "oh my god~";
        } else str = "enjoy!";
        System.out.println(str);
    }
}
