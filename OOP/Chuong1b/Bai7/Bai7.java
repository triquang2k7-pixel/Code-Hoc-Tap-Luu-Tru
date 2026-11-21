/*Bài 7: Viết chương trình giúp người dùng nhập tháng bằng
chữ số và chuyển sang tháng bằng tiếng Anh.*/

package OOP.Chuong1b.Bai7;

import java.util.*;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int thang;

        do {
            System.out.print("Nhập tháng 1 đến 12: ");
            thang = sc.nextInt();

            if (thang < 1 || thang > 12) System.out.println("Nhập tháng sai. Vui lòng nhập lại.");
        } while (thang < 1 || thang > 12);

        switch(thang) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Không có gì");
                break;
        }

        sc.close();
    }
}
