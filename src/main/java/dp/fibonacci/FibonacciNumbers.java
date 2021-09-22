package dp.fibonacci;

public class FibonacciNumbers {

    public static void main(String[] args) {

        int n = fibonacci(3);

        System.out.println(n);

    }

    private static int fibonacci(int n) {

        int[] arr = new int[n+1];
        arr[0] = 1;
        arr[1] = 1;

        for(int i = 2; i<=n; i++)
            arr[i] = arr[i-1] + arr[i-2];

        return arr[n];
    }
}
