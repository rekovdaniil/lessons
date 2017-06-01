package one;

public enum ShapeType {
  SQUARE("cквер"), RECTANGLE("рыктангэл"), CIRCLE("сёркыл");

  private String name;
  ShapeType(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}