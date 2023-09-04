import java.util.Scanner;

public class Dien_tich_HCN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu dai: ");
        String cd = sc.nextLine();
        System.out.println("Chieu dai: "+ cd);
        System.out.println("Nhap chieu rong: ");
        String cr = sc.nextLine();
        System.out.println("Chieu rong: "+ cr);
        int dt = Integer.parseInt(cd) * Integer.parseInt(cr);
        System.out.println("Dien tich: " + dt);
    }
}
