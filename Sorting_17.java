package dsa.src;
import java.util.Arrays;
import java.util.Collections;

public class Sorting_17 {


    public static void bubbleSort(int arr[]){
        for (int turn=0;turn<arr.length-1;turn++){
            for (int j=0 ; j<arr.length-1-turn;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void printArr(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static void  selection(int arr[]){
        for (int i=0;i< arr.length-1;i++){
            int minPos = i;
            for (int j=i+1;j< arr.length;j++){
                if (arr[minPos]>arr[j]){
                    minPos = j;
                }
            }
            // Swap
            int temp = arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
    }


    public static void insertionSort(Integer arr[]){
        for (int i=1;i< arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            // Finding the correct position of the element
            while (prev>=0 && arr[prev]>curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev+1] = curr;
        }
    }


    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            largest = Math.max(largest,arr[i]);
        }
        int counnt[] = new int[largest+1];
        for (int i=0;i<arr.length;i++){
            counnt[arr[i]]++;
        }

        // Sorting
        int j=0;
        for (int i=0;i<counnt.length;i++){
            while (counnt[i]>0){
                arr[j]=i;
                j++;
                counnt[i]--;
            }
        }
    }


    public static void main(String[] args){
//        int arr[] = {5,4,1,3,2};
//        bubbleSort(arr);
//        printArr(arr);


//        int arr[] = {5,4,1,3,2};
//        selection(arr);
//        printArr(arr);


//        Integer arr[] = {5,4,1,3,2};
////        insertionSort(arr);
//        Arrays.sort(arr,0,3);
//        Arrays.sort(arr, Collections.reverseOrder());
//        printArr(arr);


        int arr[] = {1,4,1,3,2,4,3,7};
        countingSort(arr);
        printArr(arr);
    }
}
