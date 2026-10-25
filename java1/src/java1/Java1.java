
package java1;

import java.util.ArrayList;
import java.util.List;

public class Java1 {
public static void addNumbers(List<? super Number>list){
    list.add(10);
    list.add(20.5);
    list.add(30.5f);
   System.out.println(list);
}
    
    
    public static void main(String[] args) {
   
       List<Number> numbers = new ArrayList<>();
List<Object> objects = new ArrayList<>();

System.out.println("Number List:");
addNumbers(numbers);

System.out.println("Object List:");
addNumbers(objects);
    }
    
}
