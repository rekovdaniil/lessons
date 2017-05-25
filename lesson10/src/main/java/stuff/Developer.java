package stuff;

import stuff.base.Engineer;
import stuff.base.SEX;

public class Developer extends Engineer {
  public Developer(String name, int age) {
    this(name, age, SEX.NOT_DEFINED);
  }

  public Developer(String name, int age, SEX sex) {
    super(name, age, sex);
  }

  //public void sayHello() {}
}