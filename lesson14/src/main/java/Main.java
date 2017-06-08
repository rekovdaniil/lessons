import strategy.*;

public class Main {
  public static void main(String[] args) {
    System.out.println("Lesson 14");

    Duck readheadDuck = new RedheadDuck();
    Duck mallardDuck = new MallardDuck();
    Duck rubberDuck = new RubberDuck();

    readheadDuck.display();
    readheadDuck.fly();
    readheadDuck.quack();

    mallardDuck.display();
    mallardDuck.fly();
    mallardDuck.quack();
    
    rubberDuck.display();
    rubberDuck.fly();
    rubberDuck.quack();
  }
}