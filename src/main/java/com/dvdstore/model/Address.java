package com.dvdstore.model;

import com.dvdstore.model.type.State;
import com.dvdstore.validators.annotations.ValidAddressLine2;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

@ValidAddressLine2
public class Address {

  @Length(max = 50)
  private String line1;

  @Length(max = 50)
  private String line2;

  @NotBlank
  @Length(max = 50)
  private String city;

  private State state;

  @NotBlank
  @Length(max = 5)
  private String zip;

  @NotBlank
  @Length(max = 50)
  private String country;


  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getLine1() {
    return line1;
  }

  public void setLine1(String line1) {
    this.line1 = line1;
  }

  public String getLine2() {
    return line2;
  }

  public void setLine2(String line2) {
    this.line2 = line2;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public State getState() {
    return state;
  }

  public void setState(State state) {
    this.state = state;
  }

  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }
}
