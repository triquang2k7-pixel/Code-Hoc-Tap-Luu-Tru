/*Viết chương trình nhập vào giá trị năm là một số
nguyên, thực hiện kiểm tra năm đó có phải là năm nhuận.
Biết rằng năm nhuận là năm chia hết cho 400 hoặc chia hết
cho 4 nhưng không chia hết cho 100.*/

package OOP.Chuong1b.Bai5;

import java.util.*;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int nam;

        do {
            System.out.print("Nhập năm: ");
            nam = sc.nextInt();

            if (nam < 0) {
                System.out.println("Năm nhập không được âm");
            }
        } while (nam < 0);

        if (nam % 400 == 0 || (nam % 4 == 0 && nam % 100 != 0)) {
            System.out.println(nam + " là năm nhuận");
        }
        else {
            System.out.println(nam + " lằ không phải năm nhuận");
        }
        sc.close();
    }
}