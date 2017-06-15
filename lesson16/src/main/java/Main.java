public class Main {
  public static void main(String[] args) {
    System.out.println("Lesson 16");

    Bag bag = new Bag();
    for (int i = 0; i < 10; i++) {
      bag.add(i + 1);
    }
    System.out.println(bag);
    System.out.println(bag.size());

    //Node node = new Node(-1);
    //node.next = new Node(-1);
  }
}