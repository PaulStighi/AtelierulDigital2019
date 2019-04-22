package Lab_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 5, 7, 13);
        List<Integer> list2 = Arrays.asList(1, 5, 9, 11, 20, 30);

        /**Leader.DisplayLeader(list);*/
        List<Integer> res = Main.merge(list,list2);
        System.out.println(res);
    }

    public static List<Integer> merge(List<Integer> A, List<Integer> B) {
        List<Integer> toReturn = new ArrayList<>();

        int i = 0, j = 0;

        while (i < A.size() && j < B.size()) {
            if (A.get(i) < B.get(j)) toReturn.add(A.get(i++));
            else toReturn.add(B.get(j++));
        }

        while(i < A.size()) toReturn.add(A.get(i++));
        while(j < B.size()) toReturn.add(B.get(j++));

        return toReturn;
    }
}
