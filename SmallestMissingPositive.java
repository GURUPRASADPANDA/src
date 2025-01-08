public class SmallestMissingPositive {
    public static int findSmallestMissingPositive(int[] arr) {
        int n = arr.length;

        
        for (int i = 0; i < n; i++) {
            while (arr[i] > 0 && arr[i] <= n && arr[arr[i] - 1] != arr[i]) {
                // Swap arr[i] with arr[arr[i] - 1]
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            }
        }

       
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }

      
        return n + 1;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 4, -1, 1};
        System.out.println("Smallest positive missing number is: " + findSmallestMissingPositive(arr1));

        int[] arr2 = {1, 2, 0};
        System.out.println("Smallest positive missing number is: " + findSmallestMissingPositive(arr2));

        int[] arr3 = {7, 8, 9, 11, 12};
        System.out.println("Smallest positive missing number is: " + findSmallestMissingPositive(arr3));
    }
}
