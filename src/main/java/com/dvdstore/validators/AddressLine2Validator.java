package com.dvdstore.validators;

import com.dvdstore.model.Address;
import com.dvdstore.validators.annotations.ValidAddressLine2;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AddressLine2Validator implements ConstraintValidator<ValidAddressLine2, Address> {

  @Override
  public void initialize(ValidAddressLine2 constraintAnnotation) {

  }

  @Override
  public boolean isValid(Address address, ConstraintValidatorContext context) {

    boolean isValid = true;
    String line1 = address.getLine1();
    String line2 = address.getLine2();

    if(line2 != null && !line2.trim().isEmpty()) {
      if(line1 == null || line1.trim().isEmpty()) {
        isValid = false;
      }
    }

    if(!isValid) {
      if(context != null) {
        context.disableDefaultConstraintViolation();
        context.buildConstraintViolationWithTemplate(
            "Address Line 2 should be empty if Address Line 1 is not entered"
        ).addPropertyNode("line2")
         .addConstraintViolation();
      }
      
    }

    return isValid;
  }
}
