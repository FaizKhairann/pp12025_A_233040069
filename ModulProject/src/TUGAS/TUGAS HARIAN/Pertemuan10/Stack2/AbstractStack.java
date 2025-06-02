package Pertemuan10.Stack2;

public abstract class AbstractStack {
  protected int[] array;
  protected int top = -1;
  protected int capacity;

  public AbstractStack(int capacity) {
    this.capacity = capacity;
    array = new int[capacity];
  }

  public int size() {
    return top + 1;
  }

  public void push(int value) {
    if (top == capacity - 1) {
      System.out.println("Stack penuh, tidak bisa push");
    } else {
      array[++top] = value;
    }
  }

  public int pop() {
    if (top == -1) {
      System.out.println("Stack kosong, tidak bisa pop");
      return -1;
    } else {
      return array[top--];
    }
  }
}
