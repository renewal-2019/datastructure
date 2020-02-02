package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyArrayList {

    //ArrayList源码解析: https://www.jianshu.com/p/5d32e3a5a04d
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        List<String> subString = new ArrayList<>();

        strings.add("哈啊哈哈");
        strings.add("lueluelue");

        strings.get(0);
        strings.set(1, "芭比龙");//会返回原来的元素值
        strings.add(1, "牛皮");
        strings.addAll(0, strings);
        strings.remove(0);//并且会返回这个移除的元素
        strings.remove("牛皮");//移除第一次出现的此元素
        subString = strings.subList(0, 1);//含头不含尾
        strings.contains("牛皮");//判断是否包含某元素

        strings.indexOf("牛皮");//获取指定元素第一次在集合中出现时的下标,没有则返回-1
        strings.lastIndexOf("牛皮");
        subString.isEmpty();//判断集合是否为空

        System.out.println(strings);
        System.out.println(subString);

        /**
         * 使用迭代器遍历list
         */
        //创建迭代器
        Iterator<String> it = strings.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }

        /**
         * 使用foreach遍历
         */
        for (String s : strings) {
            System.out.println(s);
        }

    }

}


