import template.App;

public class Main {
  //public static void main(String[] args) {
  public static void main(String...args) {
    System.out.println("Lesson 13");

    printParams("one", "two", "three");
    printParams();
    printParams("one");

    //printParams2(); // won't compile

    App app = new App();
    app.run();
  }

  static void printParams(String ...args) {
    for (int i = 0; i < args.length; i++) {
      System.out.println(args[i]);
    }
  }

  static void printParams2(String[] args) {
    for (int i = 0; i < args.length; i++) {
      System.out.println(args[i]);
    }
  } 
}