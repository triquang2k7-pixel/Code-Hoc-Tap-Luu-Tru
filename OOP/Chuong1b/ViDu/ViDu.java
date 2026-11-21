/*Viết chương trình, hiện ra dòng chữ hỏi “Mình có xinh
đẹp không?”, người dùng chỉ được nhập một trong hai ký
tự là “c” hoặc “k”, nếu người dùng nhập chữ “k” thì bắt
người dùng nhập lại câu trả lời. Nếu người dùng nhập chữ
“c” thì xuất ra màn hình dòng chữ “Cảm ơn bạn!”.*/

package OOP.Chuong1b.ViDu;

import java.util.*;

public class ViDu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char traLoi;

        do {    
            System.out.println("Vui lòng trả lời c (có) hoặc k (không)");
            System.out.println("Mình có xinh đẹp hay không?:");
            traLoi = sc.next().charAt(0);
            
            if (traLoi == 'c' ) {
                System.out.println("Cảm ơn bạn nhiều <3");
            } else if (traLoi == 'k'){
                System.out.println("Tui cấm bạn nhập k");
            } else {
                System.out.println("Vui lòng nhập c hoặc k");
            }
        } while(traLoi != 'c');

        sc.close();
    }
}
