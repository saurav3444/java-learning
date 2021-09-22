package dp.fibonacci;

public class StairwayToHeaven {

    public static void main(String[] args) {

        int n = 10;
        System.out.println(stairway(n));

    }

    private static int stairway(int n) {

        int prev=1, curr=2, ans=0;

        if(n==1)
            return 1;
        if(n==2)
            return 2;

        for(int i = 3; i<=n; i++){

            ans = (prev + curr)%1000000007;
            prev = curr;
            curr = ans;

        }

        return ans;
    }

}
