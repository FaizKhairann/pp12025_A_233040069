package Pertemuan9;

public class StrukturQueue {
  public node FRONT;
  public node REAR;

  public boolean isEmpty() {
    return FRONT == null;
  }

  public void displayElement() {
    if (isEmpty()) {
      System.out.println("Elemen Queue: Queue kosong");
    } else {
      System.out.print("Elemen Queue: ");
      node current = FRONT;
      while (current != null) {
        System.out.print(current.getData() + " ");
        current = current.getNext();
      }
      System.out.println(); // ganti baris setelah cetak semua elemen
    }
  }

  public void enqueue(int data) {

    node newNode = new node(data);
    if (isEmpty()) {
      FRONT = newNode;
      REAR = newNode;
    } else {
      REAR.setNext(newNode);
      REAR = newNode;
    }
  }

  public int dequeue() {
    if (isEmpty()) {
      System.out.println("Antrian kosong, tidak dapat di dequeue");
      return -1; // atau bisa juga lempar exception
    } else {
      int data = FRONT.getData();
      FRONT = FRONT.getNext();
      if (FRONT == null) {
        REAR = null;
      }
      return data;
    }
  }

  public int size() {
    int size = 0;
    node curNode = FRONT;
    while (curNode != null) {
      size++;
      curNode = curNode.getNext();
    }
    return size;
  }

  public int front() {
    return FRONT != null ? FRONT.getData() : -1;
  }
}
