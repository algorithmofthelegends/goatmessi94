import java.util.Scanner;

public class Algorithm5533 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] arr;
        int[][] copyArr;
        int[] result;

        int size = scan.nextInt();

        arr = new int[size][3];
        copyArr = new int[size][3];
        result = new int[size];


        for (int i = 0; i < size; i++){
            for(int j = 0; j < 3; j++){
                arr[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < size; i++){
            for(int j = 0; j < 3; j++){
                copyArr[i][j] = arr[i][j];
            }
        }


        for (int i=0; i< size-1; i++) {
            for (int j=i+1; j < size; j++){
                for (int k=0; k<3; k++){
                    if(arr[i][k] == arr[j][k]) {
                        copyArr[i][k] = 0;
                        copyArr[j][k] = 0;
                    }
                }
            }
        }

        for (int i=0; i < size; i++){
            for(int j=0; j < 3; j++){
                result[i] += copyArr[i][j];
            }
        }

        for (int i=0; i < size; i++){
            System.out.println(result[i]);
        }
    }

}

