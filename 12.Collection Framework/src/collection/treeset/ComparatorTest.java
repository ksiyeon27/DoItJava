package collection.treeset;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.Set; 

class MyCompare implements Comparator<String> { // String 클래스는 Comparable 인터페이스를 이미 구현했기 때문에 새로 내림차순 정렬방식으로.
    @Override
    public int compare(String s1, String s2){
        return (s1.compareTo(s2)) * -1; //내림차순 정렬.
    }
}
public class ComparatorTest {
    public static void main(String[] args){
        Set<String> set = new TreeSet<String>(new MyCompare()); //TreeSet 생성자의 매개변수로 정렬방식을 지정. 
        set.add("aaa");
        set.add("bbb");
        set.add("ccc");

        System.out.println(set);
    }
    
}
