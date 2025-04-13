package home.practice.c1.arr_rotation;
public class ArrayRotate {
    public static void main(String[] args) throws Exception {
       // System.out.println("Hello, World!");
        int nums[]={1,2,3,4,5};
        int order =1;
        int rotated_arr[]= bubbleRotate(nums,order);
        print_arr(rotated_arr);
    }

    //Solution 1: Bubble Rotate
    public static int[] bubbleRotate(int[] arr,int order){
        for(int i=0;i<order;i++){
        for(int j=arr.length-1;j>0;j--){
           int temp=arr[j-1];
           arr[j-1]=arr[j];
           arr[j]=temp;
        }
    }
        return arr;
    }

    // Print the passed array
    public static void print_arr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
