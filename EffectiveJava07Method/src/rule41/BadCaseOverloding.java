package rule41;

import java.math.BigInteger;
import java.util.*;

// 실행시점에 결과를 선택하는 경우라면 옳지않은 방법
// 컴파일 시점 인자의 자료를 근거로 선택한다
public class BadCaseOverloding {
    public static String classify(Set<?> set) {
        return "Set";
    }

    public static String classify(List<?> list) {
        return "List";
    }

    public static String classify(Collection<?> collection) {
        return "Unknown Collection";
    }

    public static void main(String[] args) {
        Collection<?>[] collections = {
                new HashSet<String>(),
                new ArrayList<BigInteger>(),
                new HashMap<String, String>().values()
        };

        // three times print collection
        for(Collection<?> collection : collections)
            System.out.println(classify(collection));
    }
}

