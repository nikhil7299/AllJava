package Unit1.Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class MobileNew{
    String model;
    String os;
    int ram;

    public  MobileNew( String model,
    String os,
    int ram){
        this.model = model;
        this.os = os;
        this.ram = ram;

    }

    @Override
    public String toString() {
        return "MobileNew{" +
                "model='" + model + '\'' +
                ", os='" + os + '\'' +
                ", ram=" + ram +
                '}';
    }
}
public class PartitionByGroupBy {
    public  static  void  main(String[] args){

        List<MobileNew> mobiles = Arrays.asList(
               new MobileNew("OnePlus","Android",8),
               new MobileNew("Realme","Android",16),
               new MobileNew("Vivo","Android",4),
               new MobileNew("iPhone","iOS",8),
               new MobileNew("Nokia","Windows",8),
               new MobileNew("OnePlus","Android",8)
        );

        Map<Boolean, List<MobileNew>> partitionByList = mobiles.stream().sorted((m1,m2)-> m2.ram>= m1.ram? 1:-1).collect(Collectors.partitioningBy(e->e.os.equals("Android")));
        List<MobileNew> getPartitionByList = partitionByList.get(true);
        for (MobileNew mn: getPartitionByList){
            System.out.println(mn.toString());
        }

        Map<String,List<MobileNew>> groupByList=mobiles.stream()
                .sorted((m1,m2)->m1.ram > m2.ram ? 1:-1)
                .collect(Collectors.groupingBy(e->e.os));
        System.out.println("Group by");
        List<MobileNew> lsiOS=groupByList.get("iOS");
        List<MobileNew> lsAnd=groupByList.get("Android");
        for(MobileNew mn:lsiOS)
            System.out.println(mn.model +" "+ mn.os + " " + mn.ram);

        for(MobileNew mn:lsAnd)
            System.out.println(mn.model +" "+ mn.os + " " + mn.ram);

    }
}
