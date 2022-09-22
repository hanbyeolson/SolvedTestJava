/**
* 메모리: 17916 KB, 시간: 228 ms
* 2022.09.23
* by Alub
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            
            if (A == 0 && B == 0) {
                sc.close();
                break;
            }
            System.out.println(A + B);
        }


    }
}