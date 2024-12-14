import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class task112312new {
    public List<Integer> fn() {
        int a = 0, b = 1;
        List<Integer> list1 = new ArrayList<Integer>();
        while (b <= 10000) {
            list1.add(a);
            int fib = a + b;
            a = b;
            b = fib;
        }
        return list1;
    }
    public static void main(String[] args) {
        task112312new task = new task112312new();
        List<Integer> list = task.fn();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), col = 0, pos, nol = -1;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (list.contains(arr[i])) {
                col++;
            }
        }
        int[] result = new int[col];
        int start = 0;
        for (int i = 0; i < col; i++) {
            for (int j = start; j < n; j++) {
                if (list.contains(arr[j])) {
                    result[i] = arr[j];
                    start = j + 1;
                    break;
                }
            }
        }
        if (col == 0) {
            System.out.println(0);
        }
        else {
            for (int i = 0; i < col; i++) {
                System.out.print(result[i] + " ");
            }
        }
    }
}

