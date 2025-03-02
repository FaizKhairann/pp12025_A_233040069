package pertemuan4.latihan;

import pertemuan3.node;

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

  // ADD MID
  public void addMid(int data, int position) {
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

      } else {
        int i = 1;
        while (curNode != null && i < position) {
          posNode = curNode;
          curNode = curNode.getNext();
          i++;
        }
      }
      posNode.setNext(newNode);
      newNode.setNext(curNode);
    }
  }

}
