package session02;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập cạnh a:");
        int a = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập cạnh b:");
        int b = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập cạnh c:");
        int c = Integer.parseInt(sc.nextLine());

        if (a + b <= c || a + c <= b || b + c <= a){
            System.out.println("Ba cạnh không tạo thành tam giác");
        }
        else if (a == b && b == c) {
            System.out.println("Tam giác đều");
        }
        else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
            System.out.println("Tam giác vuông");
        }
        else if (a == b || a == c || b == c) {
            System.out.println("Tam giác cân");
        }
        else {
            System.out.println("Tam giác thường");
        }
    }



}
