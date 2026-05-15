package session02;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số nguyên N: ");
        int n = Integer.parseInt(sc.nextLine());

        //chuyển số âm thành số dương
        if (n < 0) {
            n = -n; // n = -(-123) => n = 123
        }

        int sum = 0;

        while (n > 0){
            //lấy số cuối
            int digit = n % 10;
            //cộng số cuối đó vào sum
            sum += digit;
            //bỏ số cuối
            n /= 10; // n = n /10
        }
        System.out.println("Tông các chữ số của N là: " + sum);
    }
}
