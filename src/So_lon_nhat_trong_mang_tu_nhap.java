import java.util.Scanner;

public class So_lon_nhat_trong_mang_tu_nhap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap kich thuoc mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhap mang ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int index = 0;
        for(int i = 1; i < arr.length; i++){
            if ( arr[i]> max){
                max = arr[i];
                index = i;
            }
        }
        System.out.println("So lon nhat trong mang: " + max + " va o vi tri: " + index);
    }
}
