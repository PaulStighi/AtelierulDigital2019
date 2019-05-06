package Lab_6.Leader;

import java.util.Collections;
import java.util.List;

public class Leader {
    public static void DisplayLeader(List<Integer> list) {
        Collections.reverse(list);

        int max = list.get(0);
        System.out.print("Leaders : " + max + " ");

        for (int current : list) {
            if(current > max){
                System.out.print(current + " ");
                max = current;
            }
        }
    }
}
