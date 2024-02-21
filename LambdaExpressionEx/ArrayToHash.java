package LambdaExpressionEx;
import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;

class ListItems {

    private Integer key;


    private String value;


    public ListItems(Integer id, String name)
    {

        this.key = id;
        this.value = name;
    }


    public Integer getkey() { return key; }


    public String getvalue() { return value; }
}

public class ArrayToHash {
    public static void main(String[] args)
    {

        List<ListItems> list = new ArrayList<ListItems>();


        list.add(new ListItems(1, "I"));
        list.add(new ListItems(2, "Love"));
        list.add(new ListItems(3, "Geeks"));
        list.add(new ListItems(4, "For"));
        list.add(new ListItems(5, "Geeks"));

        // Map which will store the list items
        Map<Integer, String> map = new HashMap<>();


        list.forEach(
                (n) -> { map.put(n.getkey(), n.getvalue()); });

        System.out.println("Map : " + map);
    }

}
