/*Bài 6: Viết chương trình nhập vào một kí tự và kiểm tra xem
kí tự đó là nguyên âm, phụ âm hay không phải ký tự chữ.*/

package OOP.Chuong1b.Bai6;

import java.util.*;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char chuCai;

        do {
            System.out.print("Nhập chữ cái: ");
            chuCai = sc.next().charAt(0);
            chuCai = Character.toLowerCase(chuCai);

            if (!((chuCai >= 'a' && chuCai <= 'z'))) {
                System.out.println("Nhập sai. Vui lòng nhập lại chữ cái: ");
            }
        } while (!((chuCai >= 'a' && chuCai <= 'z')));



        if (chuCai == 'a' || chuCai == 'e' || chuCai == 'u' || chuCai == 'o' || chuCai == 'i') {
            System.out.println(chuCai + " Là nguyên âm");
        } 
        else {
            System.out.println(chuCai + " Là phụ âm");
        }
        
        sc.close();
    }
}
