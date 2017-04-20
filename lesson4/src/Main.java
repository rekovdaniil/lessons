public class Main {
  static int a;
  static char c;
  static double d;
  static float f = 1.0f;
  static long l = 1l;
  static Стринг полеСтринг;

  public static void main(String[] args) {
    System.out.println("Wow");

    System.out.println(a);
    System.out.println(c);
    System.out.println(d);
    System.out.println(f);
    System.out.println(l);

    //double localD;
    double localD = 10.0d;

    System.out.println(localD);

    String str = new String("Hello string");
    String str2 = "foo bar";
    String строка = "ололо";
    Стринг строка2 = new Стринг();

    System.out.println(str);
    System.out.println(str2);
    System.out.println(строка);

    Стринг стринг = null;

    System.out.println(стринг);
    System.out.println(полеСтринг);

    //Main main = null;
    //main.main(new String[0]);

    Стринг.foo();
    //стринг.foo(); // it works despite the null reference because it's a static method
    //стринг.bar(); // it throws NPE
    System.out.println(Стринг.classVar);

    стринг = new Стринг();
    стринг.bar();
    System.out.println(стринг.instanceVar);

    Counter counter = new Counter();
    System.out.println(counter.i);
    System.out.println(counter.b);

    for (int i = 0; i < 100; i++) {
      new Counter();
    }

    System.out.println(counter.i);
    System.out.println(counter.b);
  }
}

class Стринг {
  int instanceVar;
  static int classVar;

  static void foo() {
    System.out.println("foo");
  }

  void bar() {
    System.out.println("bar");
  }
}

class Counter {
  static int i = 0;
  int b = 0;

  Counter() {
    i++;
    b++;
  }
}
