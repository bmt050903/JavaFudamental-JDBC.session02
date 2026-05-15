package session02;

import java.util.Scanner;

public class Bai1 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Nhập số nguyên dương N: ");
      int n = Integer.parseInt(sc.nextLine());

      int sum = 0;


      if (n > 0){
         for (int i = 1; i <= n; i++) {
            sum += i;
         }
         System.out.println("Tổng từ 1 đến " + n+ " là: " + sum);
      } else {
         System.out.println("Số nhập vào không hợp lệ");
      }

   }
}
