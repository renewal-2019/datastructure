package list;

import java.util.LinkedList;
import java.util.List;

public class MyLinkedList {

    public static void main(String[] args) {

        //源码分析：https://www.jianshu.com/p/6a9cb631b2ef
        List<Integer> ints = new LinkedList<>();
        ints.add(1);
        ints.add(0,2);
        ints.add(3);
        System.out.println(ints);

        LinkedList<Integer> integers = new LinkedList<>();
        integers.addFirst(1);

    }

}
