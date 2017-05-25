package stuff.base;

public class Engineer {
  private String name;
  private int age;
  private SEX sex;

  //public  final String DEFAULT_SEX = "-";

  //public Engineer() {}
  public Engineer(final String name, int age, SEX sex) {
    this.name = name;
    this.age = age;
    this.sex = sex;

    final int i = 0;
  }

  /*final*/ public void sayHello() {
    System.out.println("Hello from " + name + "{" + sex + "}" + " [" + getClass().getName() + "]");
  }

  private /*final*/ void foo() {}

  public static void staticMethod() {
    System.out.println("Yes, I'm a static method");
  }
}