package pertemuan2;

public class Node {
  private int nilai;
  private Node next;

  // inisialisasi Node
  public Node(int nilai) {
    this.nilai = nilai;
  }

  // Setter & Getter
  public void setnilai(int nilai) {
    this.nilai = nilai;
  }

  public int getnilai() {
    return nilai;
  }

  // Setter & Getter untuk Next
  public void setNext(Node next) {
    this.next = next;
  }

  public Node getNext() {
    return next;
  }

}
