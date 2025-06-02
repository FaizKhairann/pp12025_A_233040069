package Pertemuan9;

public class main {
  public static void main(String[] args) {
    StrukturQueue q = new StrukturQueue();
    // LATIHAN 4
    System.out.println("### Sebelum Enqueue 3x ###");
    System.out.println("size : " + q.size());
    System.out.println("isEmpty : " + q.isEmpty());

    q.enqueue(3);
    q.enqueue(2);
    q.enqueue(1);

    System.out.println();

    System.out.println("### Enqueue 3x ###");
    System.out.println("size :" + q.size());
    System.out.println("isEmpty :" + q.isEmpty());
    System.out.println("Front :" + q.front());

    // LATIHAN 5
    System.out.println("### Sebelum Enqueue 4x ###");
    System.out.println("size :" + q.size());
    System.out.println("isEmpty :" + q.isEmpty());

    System.out.println("Elemen Queue :");
    q.displayElement();

    System.out.println("### Enqueue 4x ###");
    System.out.println("size : " + q.size());
    System.out.println("Elemen Queue :");
    q.enqueue(2);
    q.enqueue(6);
    q.enqueue(7);
    q.enqueue(1);
    q.displayElement();

    System.out.println("Front : " + q.front());

    // TUGAS
    q.enqueue(5);
    q.enqueue(10);
    q.enqueue(15);
    q.displayElement();

    q.dequeue();
    q.displayElement();
    System.out.println("Ukuran Queue: " + q.size());
    System.out.println("Elemen paling depan: " + q.front());
  }
}
