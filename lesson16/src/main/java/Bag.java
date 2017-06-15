public class Bag {
  private Node firstNode; 
  private int size = 0;

  public void add(int item) {
    if (firstNode == null) {
      firstNode = new Node(item);
    } else {
      Node node = firstNode;
      while (node.next != null) {
        node = node.next;
      }
      node.next = new Node(item);
    } 

    size++;   
  }

  public String toString() {
    String result = "[ ";
    Node node = firstNode;
    for(int i = size; i > 0; i--) {
      result += node.value + " ";
      node = node.next;
    }
    return result + "]";
  }

  public int size() {
    return size;
  }

  public boolean isEmpty() {
    return size() == 0;
  }

  private class Node {
    Node(int value) {
      this.value = value;
    }
    
    int value;
    Node next;
  }
}