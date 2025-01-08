7public class subsum {
    public static int maxSubArraySum(int[] A) {
        int maxSoFar = A[0], maxEndingHere = A[0];
        for (int i = 1; i < A.length; i++) {
            maxEndingHere = Math.max(A[i], maxEndingHere + A[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] A = {3, 4, -5, -7, 2, 5};
        System.out.println("Maximum contiguous sum is " + maxSubArraySum(A));
    }
}
