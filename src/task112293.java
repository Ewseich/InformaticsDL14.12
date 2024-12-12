import java.util.Scanner;
public class task112293 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, col = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] < min && arr[i] % 2 == 0 && arr[i] >= 0) {
                min = arr[i];
                col++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > max && arr[i] % 2 == 0 && arr[i] >= 0) {
                max = arr[i];
            }
        }
        if (col == 0) {
            System.out.println(-1 + " " + -1);
        }
        else System.out.println(min + " " + max);
    }
}