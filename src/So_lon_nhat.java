public class So_lon_nhat {
    public static void main(String[] args) {
        int[] arr = {16,2,30,14,56,46,70};
        int max = arr[0];
        int index = 0;
        for(int i = 1; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
                index = i;
            }
        }
        System.out.println("So lon nhat trong mang: " + max + " va o vi tri: " + index);
    }
}
