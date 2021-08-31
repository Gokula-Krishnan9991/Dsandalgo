package Algorithms;
class Sort{
    // Algorithm for bubble sort

    public void sort(int[]arr,int n){

        boolean flag=false;

        for(int i=0;i<n;i++) {
            for (int j = 0; j < n - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {

                    swap(arr, j, j + 1);
                    flag = true;
                }
            }
            if (!flag) {
                System.out.println("The given list is already sorted");
                break;
            }
        }
    }
    public void swap(int[]arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}


public class BubbleSort {

    public static void main(String[] args) {

        Sort a=new Sort();
        int[]arr=new int[]{1,2,3,4,5};

        a.sort(arr,arr.length);

        for(int b:arr){
System.out.println(b);
        }

    }
}
