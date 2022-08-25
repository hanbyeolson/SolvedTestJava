/**
* 메모리: 17760 KB, 시간: 224 ms
* 2022.08.25
* by Alub
*/
import java.util.Scanner;

public class Main {
     public static void main(String[] args) {

         Scanner  sc = new Scanner(System.in);

         int score = sc.nextInt();
         char grade;

         if (score >= 90 && score <= 100){
             grade = 'A';
         }else if (score >= 80 && score < 90){
             grade = 'B';
         }else if (score >= 70 && score < 80) {
             grade = 'C';
         }else if (score >= 60 && score < 70) {
             grade = 'D';
         }else {
             grade = 'F';
         }

         System.out.println(grade);

         sc.close();
     }
}