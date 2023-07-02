package annotation.example;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationDemo
{
  public static void main(String[] args) throws InvocationTargetException, IllegalAccessException
  {
    @SuppressWarnings("unused")
    double candy;
    Cat myCat = new Cat("Stella");

    if (myCat.getClass().isAnnotationPresent(Working.class)) {
      System.out.println("This cat is smoking.");
    }
    else {
      System.out.println("This thing is not very important");
    }

    for (Method method : myCat.getClass().getDeclaredMethods()) {
      if (method.isAnnotationPresent(RunImmediately.class)) {
        RunImmediately annotation = method.getAnnotation(RunImmediately.class);
        for (int i = 0; i < annotation.times(); i++) {
          method.invoke(myCat);
        }

      }
    }
    for (Field field : myCat.getClass().getDeclaredFields()) {
      if (field.isAnnotationPresent(ImportantString.class)) {
          Object objectValue = field.get(myCat);


      }
    }

  }
}
