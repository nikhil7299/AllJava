package Unit1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
 class StudentNew{
    String name;
    int score;
    public  StudentNew(String name,int score){
        this.name =name;
        this.score  = score;

    }
    int getScore(){
        return  this.score;
    }

     @Override
     public String toString() {
         return "StudentNew{" +
                 "name='" + name + '\'' +
                 ", score=" + score +
                 '}';
     }
 }
public class Parallel_Stream {
    public  static  void  main(String []args){
        IntStream is = IntStream.rangeClosed(1,5);
        is.forEach(System.out::println);

        IntStream ps = IntStream.rangeClosed(1,5);
        ps.parallel().forEach(System.out::println);

        List<StudentNew> s   = Arrays.asList(
                new StudentNew("Arnav",80),
                new StudentNew("Nikhil",71),
                new StudentNew("Aman",85),
                new StudentNew("Abhishek",98),
                new StudentNew("Rishabh",83)
        );
        System.out.println("Sequencial Stream");
        s.stream().filter(e->e.getScore() >= 75).limit(3).forEach(t-> System.out.println(t.toString()));
        System.out.println("Parallel Stream");

        s.parallelStream().filter(e->e.getScore() >= 75).limit(3).forEach(t-> System.out.println(t.toString()));

        System.out.println("Parallel Stream on Stream");
        s.stream().parallel().filter(e->e.getScore() >= 75).limit(3).forEach(t-> System.out.println(t.toString()));
    }
}
