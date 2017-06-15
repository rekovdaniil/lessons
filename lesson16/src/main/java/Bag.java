public class Bag<Item> {
  private Node firstNode; 
  private int size = 0;
  
  public void add(Item item) {
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

  private Node currentElement;
  private boolean finished = false;
  
  public Item next() {
    
    Item value = currentElement.value;
    currentElement = currentElement.next;

    if (currentElement == null) {
      finished = true;
    }

    return value;
  }

  public boolean hasNext() {
    if (currentElement == null && finished == false) {
      currentElement = firstNode;
    }
    return currentElement != null;
  }

  private class Node {
    Node(Item value) {
      this.value = value;
    }
    
    Item value;
    Node next;
  }
}