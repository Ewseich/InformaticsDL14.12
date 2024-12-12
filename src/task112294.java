import java.util.Scanner;
public class task112294 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), min = Integer.MAX_VALUE, min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE, k = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] < min) {
                min = arr[i];
                k = i;
            }
        }
        for (int i = k; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        n--;
        for (int i = 0; i < n; i++) {
            if (arr[i] < min1) {
                min1 = arr[i];
                k = i;
            }
        }
        for (int i = k; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        n--;
        for (int i = 0; i < n; i++) {
            if (arr[i] < min2) {
                min2 = arr[i];
            }
        }
        System.out.println(min + " " + min1 + " " + min2);
    }
}
