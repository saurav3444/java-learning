package dp.fibonacci;

public class HouseRobber {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 1};

        System.out.println(maxRob(arr, arr.length));
    }

    private static int maxRob(int[] arr, int length) {


        if(length<=1)
            return arr[length-1];

        if(length==2)
            return Math.max( arr[0], arr[1]);


        int[] dp = new int[length+1];

        dp[0] = arr[0];
        dp[1] = Math.max( arr[0], arr[1]);


        for(int i=2;i<length;i++){

            dp[i] = Math.max(dp[i-2]+arr[i], dp[i-1]);

        }

        return dp[length-1];


    }
}
