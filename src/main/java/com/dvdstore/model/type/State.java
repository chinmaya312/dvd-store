package com.dvdstore.model.type;

public enum State {
  Alabama		("AL"),
  Alaska 		("AK");

  private String value;
  private State(String value) {
    this.value = value;
  }
}
