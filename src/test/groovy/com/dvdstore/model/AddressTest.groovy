package com.dvdstore.model

import com.dvdstore.model.type.State
import org.hibernate.validator.HibernateValidator
import spock.lang.Shared

import javax.validation.ConstraintViolation
import javax.validation.Validation
import javax.validation.ValidatorFactory

class AddressTest extends spock.lang.Specification {

  def "Address Line 2 should not be populated without populating Address Line 1" () {
    when: "Address without line 1 but with line 2"
      Address address = new Address()
      address.line1 = ""
      address.line2 = "APT 1098"
      address.city = "Here"
      address.state = State.Alabama
      address.zip = "60187"
      address.country = "USA"
      def violations = validator.validate(address)

    then: "Constraint with the given message"
      violations.size() == 1
      violations.iterator().next().getMessage().equals("Address Line 2 should be empty if Address Line 1 is not entered")

  }

  def @Shared validator;

  def setupSpec() {
    ValidatorFactory factory = Validation.byProvider( HibernateValidator.class )
        .configure()
        .buildValidatorFactory();
    validator = factory.getValidator();
  }
}
