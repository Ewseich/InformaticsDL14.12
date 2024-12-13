import java.util.Scanner;
public class task112302reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int r = sc.nextInt();
        for (int i = 0; i < (n-r)/2; i++) {
            int temp = arr[i];
            arr[i] = arr[n-r-i-1];
            arr[n-r-i-1] = temp;
        }
        for (int i = 0; i < n/2; i++) {
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
        for (int i = 0; i < r/2; i++) {
            int temp = arr[i];
            arr[i] = arr[r-i-1];
            arr[r-i-1] = temp;
        }
        int temp1 = arr[0];
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
