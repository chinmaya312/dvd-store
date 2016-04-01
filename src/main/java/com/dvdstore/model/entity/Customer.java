package com.dvdstore.model.entity;


import com.dvdstore.model.Address;
import com.dvdstore.model.Name;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class Customer {

  private long id;

  @NotNull
  @Valid
  private Name name;

  @NotNull
  @Valid
  private Address address;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public Name getName() {
    return name;
  }

  public void setName(Name name) {
    this.name = name;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }
}
