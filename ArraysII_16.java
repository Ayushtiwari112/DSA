package dsa;

public class ArraysII_16 {


    public static void maxSubArrays(int numbers[]){
        int currSum=0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i< numbers.length; i++){
            int start = i;
            for (int j=i;j< numbers.length;j++){
                int end = j;
                currSum=0;
                for (int k=start;k<=end;k++){ // print
                    currSum += numbers[k];// subarray
                }
                System.out.println(currSum);
                if (currSum>maxSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("Max sum= " + maxSum);
    }



    public static void prefixMaxSubArrays(int numbers[]){
        int currSum=0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix [0] = numbers[0];
        // Calculate prefix array
        for(int i=1; i<prefix.length;i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for (int i = 0; i< numbers.length; i++){
            int start = i;
            for (int j=i;j< numbers.length;j++){
                int end = j;

                currSum = start ==0 ? prefix[end]: prefix[end] - prefix[start-1];

                System.out.println(currSum);
                if (currSum>maxSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("Max sum= " + maxSum);
    }

    public static void kadanes(int number[]){
        int ms = Integer.MIN_VALUE;
        int cs=0;

        for (int i=0; i< number.length;i++){
            cs = cs + number[i];
            if (cs<0){
                cs=0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println("Max sum is:" + ms);
    }



    public static int trappedRainWater(int height[]) {
        int n = height.length;

        // Step 1: Precompute leftMax array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // Step 2: Precompute rightMax array
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        // Step 3: Calculate trapped water
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;
    }



    public static int buyAndSell(int price[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i=0;i<price.length;i++){
            if (buyPrice<price[i]){
                int profit = price[i] - buyPrice;
                maxProfit = Math.max(maxProfit,profit);
            }else {
                buyPrice = price[i];
            }
        }
        return maxProfit;
    }


    public static void main(String[] args) {
//        int numbers[] = {1, -2, 6, -1, 3};
//        maxSubArrays(numbers);


//        int numbers [] = {1,-2,6,-1,3};
//        prefixMaxSubArrays(numbers);

//        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
//        kadanes(numbers);


//        int height[] = {4,2,0,6,3,2,5};
//        System.out.println(trappedRainWater(height));



        int prices[] = {7,1,5,3,6,4};
        System.out.println(buyAndSell(prices));
    }
}
