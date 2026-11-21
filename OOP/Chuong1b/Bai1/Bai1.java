/*Bài 1: Viết chương trình nhập số nguyên N, kiểm tra và
xuất kết quả N là số số âm/zero/ dương.*/

package OOP.Chuong1b.Bai1;

import java.util.*;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap N: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("N la so am");
        } else if (n == 0) {
            System.out.println("N la zero");
        } else {
            System.out.println("N la so duong");
        }

        sc.close();
    }
}