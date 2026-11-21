/*Bài 2: Viết chương trình nhập ba số nguyên, xuất ra số nhỏ
nhất trong ba số đó.*/

package OOP.Chuong1b.Bai2;

import java.util.*;

public class Bai2 {
    public static int soNhoNhat(int a, int b, int c) {
        return (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a, b, c;

        System.out.print("Nhập số nguyên a: ");
        a = sc.nextInt();

        System.out.print("Nhập số nguyên b: ");
        b = sc.nextInt();

        System.out.print("Nhập số nguyên c: ");
        c = sc.nextInt();

        System.out.println("Số nguyên nhỏ nhất trong 3 só là: " + soNhoNhat(a, b, c));

        sc.close();
    }
}