package pertemuan4.Tugas;

public class node {
  private double data;
  private node next;

  // Inisialisasi atribut node

  public node(double data) {
    this.data = data;
    this.next = null;

  }

  // Setter & Getter
  public void setData(double data) {
    this.data = data;
  }

  public double getdata() {
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
