import java.util.Scanner;
public class task112312 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), col = 0, pos, nol = -1;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] fib = new int[100];
        int[] fin = new int[100];
        fib[0] = 0;
        int las1t = 0;
        fib[1] = 1;
        int last = 1;
        for (int i = 2; i < 100; i++) {
            fib[i] = las1t + last;
            las1t = last;
            last = fib[i];
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 100; j++) {
                if (arr[i] == fib[j]) {
                    fin[i] = arr[i];
                    col++;
                    if (fin[i] == 0) nol = 0;
                }
            }
        }
        int length = fin.length;
        for (int i = 0; i < length; i++) {
            if (fin[i] == 0) {
                pos = i;
                while (fin[i] == 0) {
                    for (int j = i; j < n - 1; j++) {
                        fin[j] = fin[j + 1];
                    }
                    if (length == i + 1) break;
                    fin[n - 1] = 0;
                    length--;
                }
            }
        }
        if (col > 0) {
            for (int i = 0; i < length + nol; i++) {
                System.out.print(fin[i] + " ");
            }
        }
        else System.out.println(0);
    }
}
