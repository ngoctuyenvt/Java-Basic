import java.util.Scanner;

public class Tinh_giai_thua {
    public static void main(String[] args) {
        int n, gt = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            gt *= i;
        }
        System.out.println("Giai thua: " + gt);
    }
}
