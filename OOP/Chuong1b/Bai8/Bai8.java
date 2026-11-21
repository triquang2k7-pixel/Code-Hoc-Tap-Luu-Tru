/*Chiều cao tam giác*/

package OOP.Chuong1b.Bai8;

import java.util.*;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h;

        do {
            System.out.print("Nhập chiều cao tam giác: ");
            h = sc.nextInt();

            if (h < 1) System.out.println("Nhập sai số chiều cao. Vui lòng nhập lại.");
        } while (h < 1);

        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}
