package Unit1;

import java.util.ArrayList;
import java.util.Iterator;
class Student
{
    String name;
    String cityName;

    Student(String name, String cityName)
    {
        this.name=name;
        this.cityName=cityName;
    }
    public String toString()
    {
        return "Name :"+name+" City Name :"+cityName;
    }

}

class Demo18
{
    public static void main(String args[])
    {
        ArrayList<Student> ls=new ArrayList<>();
        ls.add(new Student(" Pankaj"," Uttarakhand"));
        ls.add(new Student(" Kumar"," Punjab"));
        ls.add(new Student(" Raghu"," Delhi"));

        Iterator<Student> it=ls.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println("ForEach loop");
        ls.forEach(System.out::println);
        ls.forEach(s->System.out.println(s));
    }
}