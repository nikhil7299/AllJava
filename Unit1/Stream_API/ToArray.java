package Unit1.Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class  Mobile{
    String name;
    int price;
    String processor;
    int ram;

    public Mobile(String name,int price,int ram, String processor){
        this.name = name;
        this.price = price;
        this.processor = processor;
        this.ram =ram;

    }

    @Override
    public String toString() {
        return "Stream_API.Mobile{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", processor='" + processor + '\'' +
                ", ram=" + ram +
                '}';
    }
}

public class ToArray {
    public  static  void main(String []args){
        List<Mobile> mobileList = Arrays.asList(
                new Mobile("iPhone 15", 45000,8,"Bionic A15"),
                new Mobile("iPhone 15 Plus", 60000,12,"Bionic A15 Plus"),
                new Mobile("iPhone 15 Pro", 85000,12,"Bionic A15 Pro"),
                new Mobile("iPhone 15 Pro Max", 95000,12,"Bionic A15 Pro Max"),
                new Mobile("OnePlus 12 Pro", 75000,8,"Snapdragon Gen 3 4nm")
        );

        Stream<Mobile> mobileStream =  mobileList.stream().sorted((x, y)->(x.price >= y.price) ? 1:-1);

        Object[] arr = mobileStream.toArray();
        for(Object t:arr){
            Mobile mobile = (Mobile) t;
            System.out.println(mobile.toString());
        }
    }

}
