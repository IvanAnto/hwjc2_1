import java.util.*;
import java.util.stream.*;

class Main {
  
  public static void main(String[] args) {

    List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

    //Stream<Integer> stream = intList.stream() 
    intList.stream() // получение потока из массива целых чисел
      .filter(x -> x > 0)
      .filter(x -> x % 2 == 0)
      .sorted(Comparator.naturalOrder())
      //.mapToInt(value -> value)
      //.mapToInt(x -> x.intValue())
      .forEach(System.out::println);
      
    
  }
}