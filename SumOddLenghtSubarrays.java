package Work;

public class SumOddLenghtSubarrays {


    public static int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int leftCount = i + 1;
            int rightCount = n - i;

            int oddLength = (leftCount + 1) / 2 * (rightCount + 1) / 2;

            sum += oddLength * arr[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3};
        int sum = sumOddLengthSubarrays(arr);
        System.out.println("Sum of odd-length subarrays: " + sum);
    }

}
