import java.util.Scanner;

public class PT_bac_nhat {
    public static void main(String[] args) {
        int a,b,x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        a = sc.nextInt();
        System.out.println("a: "+ a);
        System.out.println("Nhap b: ");
        b = sc.nextInt();
        System.out.println("b: "+ b);

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        }else {
            x = -b / a;
            System.out.println("Phuong trinh co nghiem x: " + x);
        }
    }
}
