package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectorTesting
{

  public static void main(String[] args) throws InterruptedException
  {
    //Vectors are collection of objects that allow us to manipulate them, they do exist since 1996.(Before arrays)
    int size = 1000000;
    List<Integer> arrayList = new ArrayList<>();
    long start = System.currentTimeMillis();

    for (int i = 0; i < size; i++) {
      arrayList.add(i);
    }
    long end = System.currentTimeMillis();
    System.out.println("Added "+ size +" elements to ArrayList for "+ (end - start)+ "ms");


    List<Integer> vector = new Vector<>();
    start = System.currentTimeMillis();

    for (int i = 0; i < size; i++) {
      vector.add(i);
    }
    end = System.currentTimeMillis();
    System.out.println("Added "+ size +" elements to Vector for "+ (end - start)+ "ms");

    List<Integer> multithreadedList = Collections.synchronizedList(new ArrayList<>());
    start = System.currentTimeMillis();

    Thread t1 = new Thread(() -> {
      for (int i = 0; i < size; i++) {
        multithreadedList.add(i);
      }
    });
    Thread t2 = new Thread(() -> {
      for (int i = 0; i < size; i++) {
        multithreadedList.add(i);
      }
    });
    t1.start();
    t2.start();
    t1.join();
    t2.join();
    end = System.currentTimeMillis();
    System.out.println("Added "+ size +" elements to multithreaded List for "+ (end - start)+ "ms");
    System.out.println("Multithreaded list size is: " + multithreadedList.size());

    List<Integer> multithreadedVector = new Vector<Integer>();
    start = System.currentTimeMillis();

    t1 = new Thread(() -> {
      for (int i = 0; i < size; i++) {
        multithreadedVector.add(i);
      }
    });
    t2 = new Thread(() -> {
      for (int i = 0; i < size; i++) {
        multithreadedVector.add(i);
      }
    });
    t1.start();
    t2.start();
    t1.join();
    t2.join();
    end = System.currentTimeMillis();
    System.out.println("Added elements to multithreaded Vector for "+ (end - start)+ "ms");
    System.out.println("Multithreaded vector size is: " + multithreadedVector.size());

  }
}
