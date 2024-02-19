import java.util.Scanner;

class Codechef{

    public static int countSubArray(int n, int[] arr){

        int count = 0;
        // Iterate through each subarray
        for (int i = 0; i < n; i++) {
            int sumVal = 0;
            int productVal = 1;
            // Calculate sum and product of elements in the subarray

            for (int j = i; j < n; j++) {
                sumVal += arr[j];
                productVal *= arr[j];
                // Check if sum and product are equal
                if (sumVal == productVal) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main (String[] args) throws java.lang.Exception{
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for(int i=1; i<=t; i++){
            // input size of Array
            int n = scanner.nextInt();
            int[] arr = new int[n];

            for(int k=0; k<arr.length; k++){
                arr[k]= scanner.nextInt();
            }

            int result = countSubArray(n, arr);
            System.out.println(result);
        }
    }
}

