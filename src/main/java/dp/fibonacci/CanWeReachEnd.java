package dp.fibonacci;

public class CanWeReachEnd {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 1, 1, 0, 3};

        System.out.println(canWeReach(arr));

    }

    private static boolean canWeReach(int[] arr) {

        int[] dp = new int[arr.length];
        int n = arr.length;
        int maxm = -1;
        for (int i = 0; i < n; i++){

            if(maxm<i && maxm!=-1)
                return false;

            maxm = Math.max(maxm, arr[i]+i);

            if(maxm>=n-1)
                return true;
        }
        return false;
    }
}
