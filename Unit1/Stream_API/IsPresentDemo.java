package Unit1.Stream_API;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class IsPresentDemo {

    public  static  void  main(String [] args) {
        List<Integer> intList = Arrays.asList(15, 5, 25, 30, 15, 10);
        List<Integer> intList2 = Arrays.asList(8, 5, 4, 7, 9, 4);


//        Optional<Integer> reducedList = intList.stream().filter(e -> e % 2 == 1).reduce((x, y) -> (x + y));
        intList2.stream().filter(e->e%2==0).sorted().map(e->e*e).forEach(System.out::println);
        Optional<Integer> reducedList = intList.stream().filter(e->e%2==1).reduce(Integer::sum);

//        if (reducedList.isPresent()) {
//            System.out.println(reducedList.get());
//        }
        reducedList.ifPresent(System.out::println);
    }
}
