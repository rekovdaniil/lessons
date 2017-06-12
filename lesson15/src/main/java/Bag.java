public class Bag<T> {
  int size;
  Node first;

  public void add(T elem) {
    if (first == null) {
      first = new Node();
    } else {
      Node node = first;
      first = new Node();
      first.next = node;
    } 
    first.value = elem;   
    size++;
  }

  public int size() {
    return size;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  private class Node {
    T value;
    Node next;
  }
}