package Pertemuan10.Stack2;

public class Mystack extends AbstractStack {

  public Mystack(int capacity) {
    super(capacity);
  }

  public void displayStack(String s) {
    System.out.print(s);
    System.out.print("Stack (bottom -->):");
    for (int i = 0; i < size(); i++) {
      System.out.print(peekN(i));
      System.out.print(""); // perbaikan: ganti '' dengan println() kosong
    }
    System.out.println();
  }

  public int peekN(int n) { // perbaikan: 'it' diganti 'int'
    return array[n]; // perbaikan: 'arr' diganti 'array'
  }

}
