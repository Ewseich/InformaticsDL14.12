import java.util.Scanner;
public class task112298 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), posrednik;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n / 4; i++) {
            posrednik = arr[i];
            arr[i] = arr[n/2 - 1 - i];
            arr[n/2 - 1 - i] = posrednik;
        }
        for (int i = 0; i < n / 2; i++) {
            posrednik = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = posrednik;
        }
        for (int i = 0; i < n / 4; i++) {
            posrednik = arr[i];
            arr[i] = arr[n/2 - 1 - i];
            arr[n/2 - 1 - i] = posrednik;
        }
        for (int i = 0; i < n / 2; i++) {
            posrednik = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = posrednik;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
