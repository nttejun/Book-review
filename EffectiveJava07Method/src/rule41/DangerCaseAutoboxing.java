package rule41;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

// Java 1.5 이후 Autoboxing 자동객체화 기능 추가로 기본자료형과 참조자료형의 확실한 구분이 어렵다
public class DangerCaseAutoboxing {
    public static void main(String[] args) {

        // Danger
        Set<Integer> set = new TreeSet<Integer>();
        List<Integer> list = new ArrayList<Integer>();

        for (int i = -3; i < 3; i++) {
            set.add(i);
            list.add(i);
        }

        for (int i = 0; i < 3; i++) {
            set.remove(i);
            list.remove(i);
        }

        // Solution
        Set<Integer> SolutionSet = new TreeSet<Integer>();
        List<Integer> SolutionList = new ArrayList<Integer>();

        for (int i = -3; i < 3; i++) {
            SolutionSet.add(i);
            SolutionList.add(i);
        }

        for (int i = 0; i < 3; i++) {
            SolutionSet.remove(i);
            // edit type
            SolutionList.remove(Integer.valueOf(i));
        }

        System.out.println(set + " " + list); //[-3, -2, -1] [-2, 0, 2]
        System.out.println(SolutionSet + " " + SolutionList); // [-3, -2, -1] [-3, -2, -1]
    }
}
