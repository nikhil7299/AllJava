package Unit1;

@FunctionalInterface
interface MyFunInterface{
    public String sayHello();
}
public class Lambda {
public static  void main(String[] args){
    MyFunInterface msg =()->{return "Hello Student";};
    System.out.println(msg.sayHello());
}

}
