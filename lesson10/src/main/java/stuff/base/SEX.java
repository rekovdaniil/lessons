package stuff.base;

public enum SEX {
  MALE("M"), FEMALE("F"), NOT_DEFINED("N/D");

  private String asString;
  
  SEX(String asString) {
    this.asString = asString;
  }

  public String toString() {
    return asString;
  }
}