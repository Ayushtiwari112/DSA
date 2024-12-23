package dsa;

import java.util.Scanner;

public class Arrays_15 {

    public static void update(int marks[]){
        for (int i=0;i<marks.length;i++){
            marks[i] = marks[i] + 1;
        }
    }

    public static int linear(int numbers[], int key){
        for (int i=0 ; i<numbers.length;i++){
            if (numbers[i]  == key){
                return i;
            }
        }
        return -1;
    }

    public static int largest(int numbers[]){
        int larg = Integer.MIN_VALUE;
        for (int i=1;i< numbers.length;i++){
            if (larg<numbers[i]){
                larg=numbers[i];
            }
        }
        return larg;
    }

    public static int binary(int numbers[],int key){
        int start = 0;
        int end = numbers.length-1;
        while (start<=end){
            int mid = (start+end)/2;
            if (numbers[mid]==key){
                return mid;
            }
            if (numbers[mid]<key){
                 start =mid +1;
            }
            else {
                end = mid -1 ;
            }
        }
        return -1;
    }

    public static void reverse(int numbers[]){
        int first = 0;
        int last = numbers.length-1;
        while (first<last){
            int temp = numbers[last];
            numbers[last]=numbers[first];
            numbers[first] = temp;
            first++;
            last--;
        }
    }

    public static void pairs(int numbers[]){
        int tp=0;
        for (int i=0 ; i<numbers.length;i++){
            int curr = numbers[i];
            for (int j=i+1 ; j<numbers.length;j++){
                System.out.print("(" + curr + "," + numbers[j] + ")");
                tp++;
            }
            System.out.println(" Total pairs: " + tp);
        }
    }

    public static void subArrays(int numbers[]){
        int total = 0;
        for (int i = 0; i< numbers.length; i++){
            int start = i;
            for (int j=i;j< numbers.length;j++){
                int end = j;
                for (int k=start;k<=end;k++){ // print
                    System.out.print(numbers[k]+" "); // subarray
                }
                total++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarrays: " + total);
    }
    public static void main(String[] args) {
//        int marks1[] = new int[10];
//        int marks[] = {77,78,56};
//        update(marks);
//        for (int i=0;i<marks.length;i++){
//            System.out.println(marks[i]+ " ");;
//        }
//        System.out.println();
//        int markss[] =new int[100];
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Lenght of array is: " +  markss.length);
//        markss[0]= sc.nextInt();
//        markss[1]= sc.nextInt();
//        markss[2]= sc.nextInt();
//        System.out.println("Phy: " + markss[0]);
//        System.out.println("Chem: " + markss[1]);
//        System.out.println("Maths: " + markss[2]);
//


//        // updated value
//        markss[2]=markss[2] + 1;
//        System.out.println("Math: " + markss[2]);
//        int percentage = (markss[0] + markss[1] + markss[2])/3;
//        System.out.println("Percentage is: " + percentage);




        //Linear search
//        int numbers[] = {1,2,3,4,5,6};
//        int key = 5;
//        int index = linear(numbers,key);
//        if (index == -1) {
//            System.out.println("Key is not found in the array");
//        } else {
//            System.out.println("Key is found at index: " + index);
//        }




        // Binary Search
//        int numbers[] = {2,4,6,8,10,12,14};
//        int key = 8;
//        System.out.println("Index key is: " + binary(numbers,key));



        // Reverse of an array
//        int numbers[] = {2,3,4,5,6,7};
//        reverse(numbers);
//        for (int i=0;i<numbers.length;i++){
//            System.out.print(numbers[i]+ " ");
//        }
//        System.out.println();




        //Pairs in an array
//        int numbers[] = {2,4,6,8,10};
//        pairs(numbers);



        // SubArrays
        int numbers[] = {2,4,6,8,10};
        subArrays(numbers);
    }
}
