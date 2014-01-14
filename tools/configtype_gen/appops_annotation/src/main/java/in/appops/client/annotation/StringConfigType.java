package in.appops.client.annotation;

public @interface StringConfigType {

	int minLength() default 10;

	int maxLength() default 100;

	String inject() default "";

	String validationRegex() default "[A-Z][a-z]";
}
