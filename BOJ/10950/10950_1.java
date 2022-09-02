/**
* 메모리: 17900 KB, 시간: 232 ms
* 2022.09.02
* by Alub
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        int arr[] = new int[C];

        for (int i = 0; i < C; i++) {

            int A = sc.nextInt();
            int B = sc.nextInt();
            arr[i] = A + B;


        }

        sc.close();
        for (int k : arr){
            System.out.println(k);
        }
    }
}