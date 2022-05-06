import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Algorithm1418 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;

        for (int j = n; j > 1; j--) {
            List list = new ArrayList();
            for (int i = 1; i < j; i++) {
                if (j % i == 0) {
                    list.add(j / i);
                }
            }
//            System.out.println("+++++++++++++++++++++++++++");
//            System.out.println(list);

            Boolean check = true;
            List listNew = new ArrayList();

            for (int q = 0; q < (int) list.size(); q++) {
                //소수 구하는 부분
                for (int y = 2; y < (int) list.get(q); y++) {
                    if ((int) list.get(q) % y == 0) {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    listNew.add(list.get(q));
                }
                check = true;
            }

//            System.out.println("=======아래 소수==========");
//            System.out.println(listNew);

        if(listNew != null){
            if ((int) listNew.get(0) > k) {

            } else {
                count += 1;
            }
        }

        }

        System.out.println(count+1);
    }
}
