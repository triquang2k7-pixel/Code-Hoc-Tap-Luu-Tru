/*Bài 4: Viết chương trình nhập số tự nhiên N, xuất kết quả :
a. Các số tự nhiên <=N và tổng của chúng
b. Các số tự nhiên chẵn <=N và tổng của chúng
c. Các số tự nhiên lẻ <=N và tổng của chúng
d. Các số tự nhiên là số nguyên tố <=N và tổng của chúng
e. N số nguyên tố đầu tiên*/

package OOP.Chuong1b.Bai4;

import java.util.*;

public class Bai4 {

    // Hàm kiểm tra số nguyên tố
    public static boolean laNguyenTo(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return n > 2;
    }

    // Câu a: Các số tự nhiên <= N và tổng của chúng
    public static void cauA(int n) {
        int tong = 0;

        System.out.print("Cau a: ");

        for (int i = 0; i <= n; i++) {
            System.out.print(i + " ");
            tong += i;
        }

        System.out.println("\nTong = " + tong);
    }

    // Câu b: Các số tự nhiên chẵn <= N và tổng của chúng
    public static void cauB(int n) {
        int tong = 0;

        System.out.print("Cau b: ");

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                tong += i;
            }
        }

        System.out.println("\nTong = " + tong);
    }

    // Câu c: Các số tự nhiên lẻ <= N và tổng của chúng
    public static void cauC(int n) {
        int tong = 0;

        System.out.print("Cau c: ");

        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                tong += i;
            }
        }

        System.out.println("\nTong = " + tong);
    }

    // Câu d: Các số nguyên tố <= N và tổng của chúng
    public static void cauD(int n) {
        int tong = 0;

        System.out.print("Cau d: ");

        for (int i = 0; i <= n; i++) {
            if (laNguyenTo(i)) {
                System.out.print(i + " ");
                tong += i;
            }
        }

        System.out.println("\nTong = " + tong);
    }

    // Câu e: N số nguyên tố đầu tiên
    public static void cauE(int n) {
        int dem = 0;
        int i = 2;

        System.out.print("Cau e: ");

        while (dem < n) {
            if (laNguyenTo(i)) {
                System.out.print(i + " ");
                dem++;
            }

            i++;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap N: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("N phai la so tu nhien!");
        } else {
            cauA(n);
            cauB(n);
            cauC(n);
            cauD(n);
            cauE(n);
        }

        sc.close();
    }
}