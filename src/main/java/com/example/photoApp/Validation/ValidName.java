package com.example.photoApp.Validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ValidNameValidatior.class)
@Documented
public @interface ValidName {
    String message() default "Not a valid Name";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}