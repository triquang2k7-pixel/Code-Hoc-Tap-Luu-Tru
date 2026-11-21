/*Bài 3: Viết chương trình nhập số tự nhiên N, kiểm tra và
xuất kết quả N là số nguyên tố hay không.*/

package OOP.Chuong1b.Bai3;

import java.util.*;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;

        System.out.print("Nhập số nguyên N: ");
        N = sc.nextInt();

        boolean dk = true;
        if(N < 2) {
            dk = false;
        }
        else {
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    dk = false;
                    break;
                }
            }
        }

        if(dk) {
            System.out.println(N + " là số nguyên tố");
        }
        else {
            System.out.println(N + " là không phải số nguyên tố");
        }

        sc.close();
    }
}
