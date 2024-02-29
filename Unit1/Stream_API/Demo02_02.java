

//
//
//
//        Non-terminal -> filter,map,distinct,limit -> return stream of object
//        ternminal -> collect, count,foreach, to array, ( min, max,  reduce,) => get() needed with Optional<>
//
package Unit1.Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Demo02_02{
    public  static  void  main(String [] args){
        List<String> list = Arrays.asList("car","bike","bus","bike","car");
        List<String> collect =  list.stream().distinct().collect(Collectors.toList());
//        List<String> collect =  list.stream().distinct().toList(); ->same
        System.out.println(collect);
        list.stream().distinct().forEach(System.out::println);
        long count = list.stream().distinct().count();
        long streamCount = list.stream().count();
        long streamSize = list.size(); // same

        List<String> limit = list.stream().limit(3).collect(Collectors.toList());
        List<Integer> listInt = Arrays.asList(2,3,8,6,7,3,9,7,3,9);
        long evenCount= listInt.stream().filter(e->e%2==0).distinct().count();
        Optional<Integer> max = listInt.stream().max((x,y)-> {return x.compareTo(y);});
        List<String> listAlpha =Arrays.asList("A","B","C","1","2","3");
        Optional<String> red = listAlpha.stream().reduce((val,comb)->{
            return val+comb;
        });

        Object a[] = listAlpha.stream().toArray();
        for (Object x:a) {
            System.out.println(x);
        }

        System.out.println(red.get());
        System.out.println("max "+max.get());
        System.out.println(count);
        System.out.println(streamCount);
        System.out.println(streamSize);
        System.out.println(limit);
        System.out.println(evenCount);
    }
}