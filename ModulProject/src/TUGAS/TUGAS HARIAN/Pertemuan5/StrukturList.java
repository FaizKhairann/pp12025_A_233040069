package Pertemuan5;

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

  // REMOVE HEAD
  public void removeHead() {
    if (isEmpty()) {
      System.out.println("List Kosong");
    } else {
      node temp = HEAD;
      HEAD = HEAD.getNext();
      dispose(temp);
    }
  }

  private void dispose(node temp) {
    temp.setNext(null);
    temp = null;
  }

  // REMOVE TAIL
  public void removeTail() {
    if (!isEmpty()) { // <-- ubah menjadi if (!isEmpty()) agar logika benar
      if (HEAD.getNext() == null) {
        node temp = HEAD;
        HEAD = null;
        dispose(temp); // <- tambahkan ini agar konsisten
      } else {
        node lastNode = HEAD;
        node preNode = null;
        while (lastNode.getNext() != null) {
          preNode = lastNode;
          lastNode = lastNode.getNext();
        }
        preNode.setNext(null);
        dispose(lastNode);
      }
    }
  }

}
