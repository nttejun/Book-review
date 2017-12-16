package rule41;

import java.math.BigInteger;
import java.util.*;

// bad case
public class Overloding {
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

