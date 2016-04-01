package com.dvdstore.validators.annotations;

import com.dvdstore.validators.AddressLine2Validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RUNTIME)
@Constraint(validatedBy = AddressLine2Validator.class)
@Documented
public @interface ValidAddressLine2 {

  String message() default "";
  Class<?>[] groups() default { };
  Class<? extends Payload>[] payload() default { };

}
