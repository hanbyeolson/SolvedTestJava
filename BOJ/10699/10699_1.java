/**
* 메모리: 18712 KB, 시간: 268 ms
* 2022.08.23
* by Alub
*/
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
     public static void main(String[] args) {

         SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

         Date now = new Date();
         String now_dt = format.format(now);
         System.out.println(now_dt);
     }
}