package lovepower.hellospring.concept;

import org.springframework.http.converter.json.GsonBuilderUtils;

import java.util.ArrayList;

public class Generics {
    public static void main(String[] args) {

    ArrayList<Object> list = new ArrayList<Object>();
    list.add(10); //auto Boxing : list.add(new Integer(10));
    list.add(20);
    list.add(30);
    list.add("dd");

    Integer i = (Integer) list.get(2);
    String  j = (String) list.get(3);

    System.out.println(list);
    System.out.println(j+i);

    }
}
