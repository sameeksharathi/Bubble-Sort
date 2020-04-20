import java.util.Scanner;

class BubbleSortMain{
    public static void main(String[] args) {
        BubbleSort obj=new BubbleSort();
        Scanner sc=new Scanner(System.in);
        int size = sc.nextInt();
        int arr[]=new int[size];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=sc.nextInt();
        }
        obj.sort(arr);
        obj.display(arr);
    }
}
