package practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class testCollections {
    public static void main(String[] args)
    {
        List li=new ArrayList();
        Collections.addAll(li,"shravan","abr","dbc","kumar","a");
        System.out.println(li);
        Collections.swap(li,2,3);//takes indices of elements
        System.out.println(li);
        Collections.sort(li,new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2)>0?-1:1;//descending order
               
                //return s1.compareTo(s2);
            }
        });
        System.out.println(li);
        int k=Collections.binarySearch(li,"a");
        System.out.println(k);
        Collections.reverse(li);
        System.out.println(li);
    }
}
