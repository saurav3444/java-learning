package dp.fibonacci;

import java.util.Arrays;

public class PrimeNumber {

    public static void main(String[] args) {

        int n = 50;

        Boolean[] isPrime = new Boolean[n+1];
        Arrays.fill(isPrime, true);
        int i = 2;

        while(i<=n){

            if(isPrime[i]) {

                int j = i * 2;
                while (j <= 50) {
                    isPrime[j] = false;
                    j += i;
                }
            }
            i++;
        }

        int k = 0;
        for(boolean x: isPrime)
            System.out.println(k++ + ":" + x);


    }
}
