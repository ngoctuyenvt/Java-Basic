import java.util.HashMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Array {
    public static void main(String[] args) {
        // Demo 1 : Mảng
        // Tạo mảng  = { giá trị 1 , giá trị 2, ... }
        int[] array = {1,2,3};

        // Tạo mảng bằng từ khoá new KDL[ độ dài mảng ]
        int[] arr = new int[5];


        // Duyệt mảng bằng for ( máy thì khuyên dùng forEach cho nhanh :v )
        for(int i = 0 ; i < array.length; i++ ){
            System.out.println(array[i]);
        }

        // Duyệt mảng bằng forEach ( trong đó item đóng vai trò như array[i] )
        for(int item : array){
            System.out.println(item);
        }


        // Demo 2 : Vòng lặp

        // for
        //bước 1    bước 2  bước 4
        for(int i = 0 ; i < 10 ; i ++){
            // bước 3
            System.out.println(i);
        }

        //while
        int i = 0;
        while(i < 10){
            System.out.println(i);
            i++; // nếu k có cái này thì i k tự tăng như ở vòng for
        }

        // do - while ( thực hiện do trước r mới kiểm tra điều kiện )
        do{
            System.out.println(i);
            i++;
        }while(i<10);


        // Demo 3 : Map
        //generic ( quy định kiểu dữ liệu key sẽ là Integer và value là String )
        // Có thể thay đổi generic tuỳ ý và tuỳ mục đích sử dụng Map
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"Long"); // Thêm 1 phần tử vào trong hashmap

        hashMap.put(2,"C0823L1"); // Nếu key = 1 thì giá trị Long sẽ được ghi đè thành C0823L1

        hashMap.put(3,"Ahihi");

        hashMap.put(4,"Hê nhô");

        hashMap.get(1); // Lấy phần tử map có key là 1

        hashMap.remove(4); // Xoá phần tử map có key là 4


        // Duyệt để lấy các key của map
        for(int keyList : hashMap.keySet()){
            System.out.println(keyList); // Ở đây sẽ in ra các key của map mình vừa khai báo
        }

        // Duyệt để lấy các value của map
        for(int keyList : hashMap.keySet() ){
            System.out.println(hashMap.get(keyList));// Ở đây sẽ in ra các value tương ứng với các key ở trên
        }



    }
}