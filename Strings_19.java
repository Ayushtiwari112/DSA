package dsa.src;

public class Strings_19 {


    public static void printLetters(String str){
        for (int i=0;i<str.length();i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

  // Palindrome
    public static boolean isPalindrome(String str){
        for (int i=0;i<str.length();i++){
            int n = str.length();
            if (str.charAt(i)!=str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }

    public static float shortestPath(String path){
        int x=0 , y=0;
        for (int i=0;i<path.length();i++){
            char dir = path.charAt(i); // analysis character
            // South
            if (dir=='S'){
                y--;
            } else if (dir=='N'){ //North
                y++;
            } else if (dir=='W') { //West
                x--;
            } else { // East
                x++;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float) Math.sqrt(X2+Y2);
    }


    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder();
        // Convert the first character to uppercase
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        // Traverse the string from the second character
        for (int i = 1; i < str.length(); i++) {
            // Check for space and handle capitalization
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i)); // Append the space
                i++; // Move to the next character
                sb.append(Character.toUpperCase(str.charAt(i))); // Append the uppercase character
            } else {
                sb.append(str.charAt(i)); // Append the current character
            }
        }
        return sb.toString();
    }


    // String compression
    public static String compression(String str){
        String newStr = "";
        for (int i=0;i<str.length();i++){
            Integer count = 1;
            while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newStr += str.charAt(i); // Letter add
            if (count>1){
                newStr += count.toString(); //count add
            }
        }
        return newStr;
    }



    public static void main(String[] args){
//        String name = "Ayush Tiwari";
//        System.out.println(name.length());
//
//
//        //concatenation
//        String firstName = "Ayush";
//        String lastName = "Tiwari";
//        String fullName = firstName + " " + lastName;
//        System.out.println(fullName.charAt(1));
//
//        printLetters(fullName);

//        String str = "racecar";
//        System.out.println(isPalindrome(str));


// Shortest Path
//        String path = "WNEENESENNN";
//        System.out.println(shortestPath(path));


        //UpperCase
//        String str = "hi i am ayush";
//        System.out.println(toUpperCase(str));


        // String compress
        String str = "aaabbcccdd";
        System.out.println(compression(str));
    }
}
