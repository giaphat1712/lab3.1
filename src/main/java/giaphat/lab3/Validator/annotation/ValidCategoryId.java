package giaphat.lab3.Validator.annotation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import giaphat.lab3.Validator.ValidCategoryIdValidator;


import java.lang.annotation.*;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({TYPE,FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = ValidCategoryIdValidator.class)
@Documented

public @interface ValidCategoryId {
    String message()default "Invalid Category ID";
    Class  <?>[]groups()default {};
    Class<? extends Payload>[] payload() default {};
}
