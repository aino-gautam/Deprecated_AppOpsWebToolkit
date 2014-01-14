package in.appops.client.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)
public @interface Rule {
	Attribute[] value() default {};
	
}
