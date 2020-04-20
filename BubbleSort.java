import java.util.Scanner;

public class BubbleSort {
    public void sort(int arr[]){
        int temp;
        for (int i = 0; i <arr.length-1 ; i++) {
            int flag=0;
            for (int j = 0; j <arr.length-1-i ; j++) {
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=1;
                }
            }
            if (flag==0) {
                break;
            }
        }
    }
    public void display(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
