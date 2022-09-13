/**
* 메모리: 18560 KB, 시간: 240 ms
* 2022.09.13
* by Alub
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        sc.close();

        for (int i = 1; i < 10; i++) {
            System.out.println(a + " * "+ i + " = " + (a * i));
        }


    }
}