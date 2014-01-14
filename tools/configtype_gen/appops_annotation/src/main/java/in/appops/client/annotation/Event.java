package in.appops.client.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import com.google.gwt.event.shared.GwtEvent;

@Documented
@Inherited
@Retention(RetentionPolicy.CLASS)
public @interface Event {
	Class type() default GwtEvent.class;
}
