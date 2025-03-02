package pertemuan4.Tugas;

public class StrukturList {
  public node HEAD;

  public boolean isEmpty() {
    return HEAD == null;
  }

  // ADD TAIL
  public void addTail(double data) {
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
      System.out.println(curNode.getdata() + "");
      curNode = curNode.getNext();
    }
  }

  // ADD HEAD
  public void addHead(double data) {
    node newNode = new node(data);
    if (isEmpty()) {
      HEAD = newNode;
    } else {
      newNode.setNext(HEAD);
      HEAD = newNode;
    }
  }

  // ADD MID
  public void addMid(double data, int position) {
    node posNode = null, curNode = null;
    node newNode = new node(data);
    if (HEAD == null) {
      HEAD = newNode;
      return;
    } else {
      curNode = HEAD;
      if (position == 1) {
        newNode.setNext(HEAD);
        HEAD = newNode;
        return;

      } else {
        int i = 1;
        while (curNode != null && i < position) {
          posNode = curNode;
          curNode = curNode.getNext();
          i++;
        }
      }
      // if (posNode != null) {
      posNode.setNext(newNode);
      newNode.setNext(curNode);
      // }

    }
  }

}
