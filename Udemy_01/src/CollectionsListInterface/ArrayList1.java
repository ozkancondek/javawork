package CollectionsListInterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayList1 {
    public static void main(String[] args) {
        // adding new elements to list
        ArrayList<String> names = new ArrayList<String>();
        names.add("ozkan1");
        names.add("ozkaan2");
        names.add("ozkan3");

        List<String> names2 = new ArrayList<String>();
        names2.add("condek1");
        names2.add("condek2");
        names2.add("condek3");

        // add arrays
        names2.addAll(names);
        // size of the array
        int mySize = names.size();
        // get the elements
        // nth element
        String second = names.get(1);
        // Iterator method
        /*
         * Iterator<String> itr = names.iterator();
         * while (itr.hasNext()) {
         * System.out.println(itr.next());
         * 
         * }
         */
        for (String name : names) {
            System.err.println(name);
        }

        // sort
        Collections.sort(names);

        // set elements
        names.set(0, "ozkannnn");

        // Delete element
        names.remove(0);

    }
}
