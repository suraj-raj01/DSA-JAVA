package Sortings;

public class BubbleSort {
    public static void bubbleSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {8,6,3,4,1,7,5};
        BubbleSort.bubbleSort(arr);
    }
}
