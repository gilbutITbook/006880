package com.devchronicles.decorator;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import javax.inject.Qualifier;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.ElementType.PARAMETER;

@Qualifier
@Retention(RUNTIME)
@Target({ FIELD, PARAMETER, TYPE })
public @interface ClearanceSale {
}
