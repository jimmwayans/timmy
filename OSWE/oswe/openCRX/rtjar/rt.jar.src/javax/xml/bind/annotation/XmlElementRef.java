package javax.xml.bind.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface XmlElementRef {
  Class type() default DEFAULT.class;
  
  String namespace() default "";
  
  String name() default "##default";
  
  boolean required() default true;
  
  public static final class DEFAULT {}
}


/* Location:              /Users/timmy/timmy/OSWE/oswe/openCRX/rt.jar!/javax/xml/bind/annotation/XmlElementRef.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */