import java.util.Scanner;

public class Algorithm2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kg = sc.nextInt();
        int result1 = 0;
        int result2 = 0;
        int result3 = 0;
        int result4 = 0;
        int result5 = 0;
        int tmp = 0;

        //5만 될경우
        if((kg % 5)==0){
            result1 += kg / 5;
        } else {
            result1 = -1;
        }

        //5로 나누고 3으로 나누는 경우
        tmp = kg;
        result2 = tmp / 5;
        tmp = tmp % 5;
        if((tmp % 3) != 0) {
            result2 = -1;
        } else {
            result2 += (tmp/3);
        }

        //3으로만 나누는 경우
        tmp = kg;
        if((tmp % 3) != 0){
            result3 = -1;
        } else {
            result3 += tmp/3 ;
        }

        //3을 나누고 5를 나누는 방법
        tmp = kg;
        for(int i=tmp/3; i > 0; i--){
            tmp = tmp % (3*i);
            result4 = i ;
            if((tmp%5)==0) {
                result4 += tmp / 5;
                break;
            } else {
                result4 = 0;
                tmp = kg;
            }
        }

        if(result4 == 0){
            result4 = -1;
        }

        //5를 나누고 3을 나누는 방법
        tmp = kg;
        for(int i=tmp/5; i >0 ; i--){
            tmp = tmp % (5*i);
            result5 = i ;
            if((tmp%3)==0) {
                result5 += tmp / 3;
                break;
            } else {
                result5 = 0;
                tmp = kg;
            }
        }

        if(result5 == 0){
            result5 = -1;
        }


        int[] arr = new int [5];
        arr[0] = result1;
        arr[1] = result2;
        arr[2] = result3;
        arr[3] = result4;
        arr[4] = result5;
        //버블 정렬
        int temp = 0;
        //배열의 크기를 구하는 키워드
        //배열이름.length

        for(int i = 0; i < arr.length; i++) {//라운드횟수(0~5까지)
            for(int j = 0; j < arr.length-i-1; j++) {//(0~4까지)
                if(arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        //System.out.println(result1+", "+result2+", "+result3+", "+result4+", "+result5);

        if (result1==-1&&result2==-1&&result3==-1&&result4==-1&&result5==-1){
            System.out.print("-1");
        } else {
            for(int i=0; i < arr.length; i++){
                if(arr[i]!=-1){
                    System.out.print(arr[i]);
                    break;
                }
            }
        }
    }
}
