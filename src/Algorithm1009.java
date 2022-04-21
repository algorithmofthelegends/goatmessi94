import java.util.List;
import java.util.Scanner;

public class Algorithm1009 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        for (int k = 0; k < count; k++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            int sum = 1;

            for(int i=0; i< b; i++){
                sum = sum * a;
                while (sum > 10){
                    sum %= 10;
                }
            }
            if(sum == 0) sum = 10;
            System.out.println(sum);
        }
    }
}
