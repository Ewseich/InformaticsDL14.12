import java.util.Scanner;
public class task112304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), pos, copyn = n;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                pos = i;
                while (arr[i] == 0) {
                    for (int j = i; j < n - 1; j++) {
                        arr[j] = arr[j + 1];
                    }
                    if (n == i + 1) break;
                    arr[n - 1] = 0;
                    n--;
                }
            }
        }
        for (int i = 0; i < copyn; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
