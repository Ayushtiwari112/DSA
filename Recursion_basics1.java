package dsa.src;

public class Recursion_basics1 {

    public static void printDecreasing(int n){
        if (n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDecreasing(n-1);
    }

    public static void printIncreasing(int n){
        if (n==1){
            System.out.print(n+" ");
            return;
        }
        printIncreasing(n-1);
        System.out.print(n + " ");
    }

    public static int factorial(int n){
        if (n==0){
            return 1;
        }
        int fnm1 = factorial(n-1);
        int fn = n*factorial(n-1);
        return fn;
    }

    public static int calSum(int n){
        if (n==1){
            return 1;
        }
        int snm1 =calSum(n-1);
        int sn = n +snm1;
        return sn;
    }

    public static int fibonacci(int n){
        if (n==0 || n==1){
            return n;
        }
        int fnm1 = fibonacci(n-1);
        int fnm2 = fibonacci(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    public static boolean sorted(int arr[],int i){
        if (i==arr.length-1){
            return true;
        }
        if (arr[i]>arr[i+1]){ // ascending order
            return false;
        }
        return sorted(arr,i+1);
    }

    // Find occurence of an element in an array
    public static int firstOccurence(int arr[] , int key , int i){
        if (i==arr.length){
            return -1;
        }
        if (arr[i]== key){
            return i;
        }
        return firstOccurence(arr,key,i+1);
    }

    public static int lastOccurence(int arr[], int key,int i){
        if (i== arr.length){
            return -1;
        }
        int isFound = lastOccurence(arr,key,i+1);
        if (isFound == -1  && arr[i]==key){
            return i;
        }
        return isFound;
    }

    public static int power(int x , int n){
        if (n==0){
            return 1 ;
        }
        return x*power(x,n-1);
    }



    public static int optimisedPower(int a , int n){
        if (n==0){
            return 1 ;
        }
        int halfpower = optimisedPower(a,n/2);
        int halfpowersq = halfpower*halfpower;
        // n is odd
        if (n%2!=0){
            halfpowersq = a * halfpowersq;
        }
        return halfpowersq;
    }

    public static void main(String[] args){
        int n=25;
        printDecreasing(n);
        printIncreasing(n);
        System.out.println(factorial(n));
        System.out.println(calSum(n));
        System.out.println(fibonacci(25)); //TC = O(n^2)
        int arr[] = {1,2,3,4,5};
        System.out.println(sorted(arr,0)); // TC = O(n)
        int arr1[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(firstOccurence(arr1,3,0)); // TC = O(n)
        System.out.println(lastOccurence(arr1,5,0));
        System.out.println(power(2, 10)); // TC = O(n)
        System.out.println(optimisedPower(2,5)); // TC = O(logn)
    }
}
