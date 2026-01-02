import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_Api {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(2,4,50,21,22,67);
        List<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(34);
        list2.add(23);
        list2.add(78);
        List<Integer> listEven = new ArrayList<>();
        for(Integer i : list1)
        {
            if(i % 2 == 0)
            {
                listEven.add(i);
            }
        }
        System.out.println(list1);
        System.out.println(listEven);

        // using Stream Api
        Stream<Integer> stream = list1.stream();
        List<Integer> newList = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(newList);
        

    }
}
