 class ts {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 0;
        rotateArray(arr, k);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void rotateArray(int[] arr, int k) {
        k = k%arr.length;
        for (int i = 1;i<=k;i++){
            int temp = arr[arr.length-1];
            for(int j = arr.length-1; j>0 ;j--){
               arr[j] = arr[j-1];
            }
            arr[0] = temp;
        }
    }

   
}