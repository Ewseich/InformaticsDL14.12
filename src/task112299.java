import java.util.Scanner;
public class task112299 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt() - 1, m = sc.nextInt() - 1;
        while (k < m) {
            int posrednik = arr[k];
            arr[k] = arr[m];
            arr[m] = posrednik;
            k++;
            m--;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
