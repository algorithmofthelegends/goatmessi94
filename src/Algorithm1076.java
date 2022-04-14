import java.util.*;

public class Algorithm1076 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] bam = new String[3];
        
        for(int i=0; i<3; i++){
            bam[i] = sc.next();    
        }

        int valueArr[][] = {{0,1},{1,10},{2,100},{3,1000},{4,10000},{5,100000},{6,1000000},{7,10000000},{8,100000000},{9,1000000000}};

        Map<String, Object> color = new HashMap<String, Object>();
        color.put("black",valueArr[0]);
        color.put("brown",valueArr[1]);
        color.put("red",valueArr[2]);
        color.put("orange",valueArr[3]);
        color.put("yellow",valueArr[4]);
        color.put("green",valueArr[5]);
        color.put("blue",valueArr[6]);
        color.put("violet",valueArr[7]);
        color.put("grey",valueArr[8]);
        color.put("white",valueArr[9]);

        int one[] = (int[]) color.get(bam[0]);
        int two[] = (int[]) color.get(bam[1]);
        int three[] = (int[]) color.get(bam[2]);

        String plus = Integer.toString(one[0]) + Integer.toString(two[0]) ;
        int plusToInt = Integer.parseInt(plus);
        long dap = (long) plusToInt * three[1];
        System.out.println(dap);

    }
}
