package pertemuan3;

public class StrukturList {
  public node HEAD;

  public boolean isEmpty() {
    return HEAD == null;
  }

  // ADD TAIL
  public void addTail(int data) {
    node posNode = null, curNode = null;

    node newNode = new node(data);
    if (isEmpty()) {

      HEAD = newNode;
    } else {
      curNode = HEAD;
      while (curNode != null) {
        posNode = curNode;
        curNode = curNode.getNext();
      }
      posNode.setNext(newNode);
    }
  }

  // display
  public void displayElement() {
    node curNode = HEAD;
    while (curNode != null) {
      System.out.print(curNode.getdata() + "");
      curNode = curNode.getNext();
    }
  }

  // ADD HEAD
  public void addHead(int data) {
    node newNode = new node(data);
    if (isEmpty()) {
      HEAD = newNode;
    } else {
      newNode.setNext(HEAD);
      HEAD = newNode;
    }
  }

}
