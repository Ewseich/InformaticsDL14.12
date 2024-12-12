import java.util.Scanner;
public class task112300 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int r = sc.nextInt();
        int[] help = new int[r];
        System.arraycopy(arr, 0, help, 0, r);
        System.arraycopy(arr, r, arr, 0, n - r);
        System.arraycopy(help, 0, arr, n - r, help.length);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
