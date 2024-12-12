import java.util.Scanner;
public class task112292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), min = Integer.MAX_VALUE;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] == min) {
                System.out.print(i + 1 + " ");
            }
        }

    }
}
