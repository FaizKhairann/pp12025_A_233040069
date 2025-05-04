package Pertemuan7.Tugas;

public class StrukturList {
  private node Head;

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

  public boolean find(int data) {
    node curNode = HEAD;
    boolean ketemu = false;
    while (curNode != null && !ketemu) {
      if (curNode.getData() == data) {
        ketemu = true;
      } else {
        curNode = curNode.getNext();
      }
    }
    return ketemu;
  }

  public int size() {
    node curNode = HEAD;
    int jumlah = 0;
    while (curNode != null) {
      jumlah = jumlah + 1;
      curNode = curNode.getNext();
    }
    return jumlah;
  }

  // display
  public void displayElement() {
    node curNode = HEAD;
    while (curNode != null) {
      System.out.print(curNode.getData() + " ");
      curNode = curNode.getNext();
    }
    System.out.println();
  }

  // REMOVE ELEMENT LIST
  public void clear() {
    HEAD = null;
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
