/*BÀI TẬP 2

- Thiết kế lớp điểm gồm 2 thuộc tính x, y (int) và các phương thức thiết
lập/nhập/ xuất.
- Thiết kế lớp điểm màu thừa kế từ lớp điểm, bổ sung thuộc tính màu
(int), các phương thức thiết lập/nhập/xuất của lớp điểm màu.
- Thiết kế lớp đoạn thẳng bao gồm các thuộc tính điểm màu 1, điểm màu 2
(là đối tượng của lớp điểm màu), các phương thức:
+ Thiết lập/nhập/xuất
+ Tính khoảng cách giữa 2 điểm
+ In ra kết quả cho biết 2 điểm của đoạn thẳng có cùng màu không
- Viết hàm main để test: tạo 1 đối tượng đoạn thẳng và gọi thực thi các
phương thức của nó*/

package OOP.Chuong4.Bai2;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Tao doi tuong doan thang
        DoanThang dt = new DoanThang();

        // Nhap hai diem
        dt.nhap(sc);

        // Xuat thong tin
        System.out.println("\n===== THONG TIN DOAN THANG =====");
        dt.xuat();

        // Tinh khoang cach
        System.out.printf("Khoang cach hai diem: %.2f%n",
                dt.khoangCach());

        // Kiem tra cung mau
        if (dt.cungMau()) {
            System.out.println("Hai diem cung mau!");
        } else {
            System.out.println("Hai diem khac mau!");
        }

        sc.close();
    }
}