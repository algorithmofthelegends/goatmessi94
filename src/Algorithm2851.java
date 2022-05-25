import java.util.Scanner;

public class Algorithm2851 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] mushroom = new int[10];
        for (int i=0; i<10; i++){
            mushroom[i] = scan.nextInt();
        }

        int[] sum = new int[10];
        for (int i=0; i<10; i++){
            if(i==0){
                sum[i] = mushroom[i];
            } else {
                mushroom[i] = mushroom[i] + mushroom[i-1];
                sum[i] = mushroom[i];
            }
        }

        int min = sum[0];
        for (int i=1; i<10; i++){
            if((100 - min) > (((100 - sum[i]) < 0) ? (100 - sum[i]) * -1 :100 - sum[i])) min = sum[i];
            if((100 - min) == (((100 - sum[i]) < 0) ? (100 - sum[i]) * -1 :100 - sum[i])) min = sum[i];
        }

        System.out.println(min);
    }
}
