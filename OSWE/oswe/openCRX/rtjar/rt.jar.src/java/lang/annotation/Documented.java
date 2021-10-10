package java.lang.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.ANNOTATION_TYPE})
public @interface Documented {}


/* Location:              /Users/timmy/timmy/OSWE/oswe/openCRX/rt.jar!/java/lang/annotation/Documented.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */