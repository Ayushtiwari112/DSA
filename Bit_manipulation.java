package dsa.src;

public class Bit_manipulation {

    public  static void evenAndOdd(int n){
        int bitMask=1;
        if (((n&bitMask)==0)){
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd Number");
        }
    }


    public  static int grtIthBit(int n,int i){
        int bitMask = 1<<i;
        if ((n&bitMask)==0){
            return 0 ;
        } else {
            return 1;
        }
    }


    public static int setIthBit(int n,int i){
        int bitMask= 1<<i;
        return n|bitMask;
    }

    public static int clearIthBit(int n , int i){
        int bitMask = ~(1<<i);
        return n&bitMask;
    }


    public  static int updateIthBit(int n ,int i , int newBit){
        if (newBit==0){
            return clearIthBit(n,i);
        } else {
            return setIthBit(n,i);
        }
    }

    public static int clearLastIBits(int n , int i){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }

    public static void main(String[] args){
        System.out.println(5&6); //AND
        System.out.println(5|6); //OR
        System.out.println(5^6); //XOR
        System.out.println(~5); //One's Complement
        System.out.println(5<<2); //Left Shift
        System.out.println(6>>1); // Right Shift
        evenAndOdd(5);
        evenAndOdd(6);
        System.out.println(grtIthBit(10,3));
        System.out.println(setIthBit(10,2));
        System.out.println(clearIthBit(10,1));
        System.out.println(updateIthBit(10,2,1));
        System.out.println(clearLastIBits(15,2));
    }
}
