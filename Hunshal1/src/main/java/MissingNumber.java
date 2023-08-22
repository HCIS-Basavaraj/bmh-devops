public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 8, 5, 6, 7};
        int n = arr.length;
        System.out.println(MissingNumber.findMissingNumber(arr, n));
    }

    public static int findMissingNumber(int[] arr, int n) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1+=arr[i];
            System.out.println(arr[i]);
        }
        for(int i=1; i<=n+1; i++){
            sum2+=i;
            System.out.println(i);
        }
        System.out.println("sum1 =" + sum1 + "sum2 =" + sum2);
        return sum2-sum1;
    }
}
