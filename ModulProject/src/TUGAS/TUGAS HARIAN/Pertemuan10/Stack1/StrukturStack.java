package Pertemuan10.Stack1;

public class StrukturStack {
  private int[] array;
  private int cappacity;
  private int TOP;

  public final int MIN = -1;

  public boolean isFull() {
    return TOP == array.length - 1;
  }

  public boolean isEmpty() {
    return (TOP == MIN);
  }

  // Constructor
  public StrukturStack(int cappacity) {
    super();
    array = new int[cappacity];
    this.cappacity = cappacity;
    TOP = MIN;
  }

  // push
  public void push(int data) {
    if (isFull()) {
      System.out.println("Stack penuh!!");
    } else {
      TOP++;
      array[TOP] = data;
    }
  }

  // size
  public int size() {
    return TOP + 1;
  }

  // top
  public int top() {
    if (!isEmpty()) {
      return array[TOP];
    }
    return MIN;
  }

  // pop
  public int pop() {
    if (isEmpty()) {
      System.out.println("Stack kosong!!");
      return MIN;
    } else {
      int data = array[TOP];
      TOP--;
      return data;
    }
  }

  // DISPLAY STACK
  public void displayStack() {
    if (isEmpty()) {
      System.out.println("Stack Kosong");
    } else {
      System.out.print("Elemen Stack : ");
      for (int i = TOP; i >= 0; i--) {
        System.out.print(array[i] + " ");
      }
      System.out.println();
    }
  }
}
