public class Main {
  public static void main(String[] args) {
    System.out.println("Lesson 6");

    String str = new String();
    java.lang.String str2 = "";


    LightBulb bulb = new LightBulb();
    System.out.println(bulb.isOn());
    bulb.switchState();
    System.out.println(bulb.isOn());

    //error: state has private access in LightBulb
    //System.out.println(bulb.state);

    LightBulb bulb2 = new LightBulb();

    System.out.println(bulb.equals(bulb2));
    bulb2.switchState();
    System.out.println(bulb.equals(bulb2));

    System.out.println(bulb == bulb2);

    System.out.println(bulb.equals(bulb));

    System.out.println("test" == "test");
    System.out.println(new String("test") == "test");
    System.out.println(new String("test") == new String("test"));
    System.out.println(("tes" + "t") == "test");
    System.out.println(new String("test").equals("test"));
  }
}

//class String {}

class LightBulb {
  private String type = "LED";
  private boolean state = false;

  void on() {
    state = true;
  }

  void off() {
    state = false;
  }  

  void switchState() {
    state = !state;
  }

  boolean isOn() {
    return state;
  }

  boolean equals(LightBulb that) {
    if (this == that) return true;

    return state == that.state;
  }
}
