import java.util.Arrays;

public class smlin {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original Array: " + Arrays.toString(arr));
        
        int[] maxMinArray = convertToMaxMinArray(arr);
        System.out.println("Max-Min Array: " + Arrays.toString(maxMinArray));
    }

    public static int[] convertToMaxMinArray(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        
        Arrays.sort(arr); // Sort the array
        
        int left = 0, right = n - 1;
        boolean flag = true;
        
        for (int i = 0; i < n; i++) {
            if (flag) {
                result[i] = arr[right--];
            } else {
                result[i] = arr[left++];
            }
            flag = !flag;
        }
        
        return result;
    }
}