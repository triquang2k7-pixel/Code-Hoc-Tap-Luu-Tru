/*- Sử dụng lớp điểm đã tạo ở Bài tập 2.
- Thiết kế lớp tam giác với thành phần dữ liệu gồm 3 đỉnh là 3 điểm.
- Viết các phương thức khởi tạo, phương thức get/set, phương thức
nhập/xuất cho lớp tam giác, và phương thức tính chu vi của tam giác.
- Viết hàm main để test: tạo 1 đối tượng hình tam giác và gọi thực thi các
phương thức của nó.*/

package OOP.Chuong4.Bai3;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Tao doi tuong tam giac
        TamGiac tg = new TamGiac();

        // Nhap tam giac
        tg.nhap(sc);

        // Xuat tam giac
        System.out.println("\n===== THONG TIN TAM GIAC =====");
        tg.xuat();

        // Tinh chu vi
        System.out.printf("Chu vi tam giac: %.2f%n",
                tg.chuVi());

        sc.close();
    }
}