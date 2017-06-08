package strategy;

public class RedheadDuck extends Duck {
  public RedheadDuck() {
    super(new Quack(), new FlyWithWings());
  }

  public void display() {
    System.out.println("Hey. I'm looking like a God");
  }
}