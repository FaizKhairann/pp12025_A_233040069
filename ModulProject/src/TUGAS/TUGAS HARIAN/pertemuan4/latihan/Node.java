package pertemuan4.latihan;

import pertemuan3.node;

public class Node {
  private int data;
  private node next;

  // Inisialisasi atribut node

  public Node(int data) {
    this.data = data;
    this.next = null;

  }

  // Setter & Getter
  public void setnilai(int data) {
    this.data = data;
  }

  public int getdata() {
    return data;
  }

  // Setter & Getter untuk Next
  public void setNext(node next) {
    this.next = next;
  }

  public node getNext() {
    return next;
  }

}
