package Setinterface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class HashSetExample {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<String>();
        mySet.add("ozkan1");
        mySet.add("ozkan2");
        mySet.add("ozkan3");
        mySet.add("ozkan4");
        // Clear all
        // mySet.clear();
        // Contains
        boolean isIt = mySet.contains("ozkan");
        // size
        int mySize = mySet.size();
        // reach the elements
        Iterator<String> itr = mySet.iterator();

        while (itr.hasNext()) {
            System.err.println(itr.next());

        }
        // js8 feature
        mySet.forEach(x -> System.out.println(x));

    }

}