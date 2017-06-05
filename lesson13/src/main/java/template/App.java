package template;

public class App extends AbstractApp {
  int i = 10;

  protected void init() {
    //super.init();
    System.out.println("Foo::init");
    System.out.println("i = " + i);
  }

  protected void invoke() {
    System.out.println("invoking");
    System.out.println("i = " + i);
  }

  protected void configure() {
    System.out.println("configuring");
  }

  protected void destroy() {
    System.out.println("destroying");
  }
}