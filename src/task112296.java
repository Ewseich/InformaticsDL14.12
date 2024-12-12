import java.util.Scanner;
public class task112296 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = 1, last = Integer.MAX_VALUE, max = 0, el = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            k++;
            if (arr[i] != last && k > max) {
                max = k - 1;
                if (last == Integer.MAX_VALUE) {
                    el = arr[i];
                }
                k = 1;
            }
            else if (arr[i] != last) {
                k = 1;
            }
            else if (arr[i] == last && k > max) {
                el = arr[i];
                max = k;
            }
            last = arr[i];
        }

        System.out.println(el + " " + max);
    }
}
