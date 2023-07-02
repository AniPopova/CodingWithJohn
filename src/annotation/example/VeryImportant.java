package annotation.example;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@Target(ElementType.TYPE) //this means that the annotation will be used only on classes
@Target({ElementType.TYPE, ElementType.METHOD}) //this means that the annotation will be used on classes and methods only
@Retention(RetentionPolicy.RUNTIME)
public @interface VeryImportant
{
}
