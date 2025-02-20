package pertemuan3;

public class node {
  private int data;
  private node next;

  // Inisialisasi atribut node

  public node(int data) {
    this.data = data;
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
