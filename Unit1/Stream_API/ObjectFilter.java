package Unit1.Stream_API;
import java.util.ArrayList;
import java.util.List;

class Product {
    int id;
    String name;
    double price;
    public Product(int id,String name,double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class ObjectFilter {
    public  static  void main(String []args){
        List <Product>  p =  new ArrayList<>();
        p.add(new Product(101,"HP",4562.43));
        p.add(new Product(102,"Dell",6862.23));
        p.add(new Product(103,"Lenovo",3743.43));
        p.add(new Product(104,"Asus",5562.52));
        p.add(new Product(104,"Mac",8562.52));

        p.stream().filter(t-> t.price>5000).forEach(e-> System.out.println(e.id+"\t"+e.name+"\t"+e.price));
    }
}