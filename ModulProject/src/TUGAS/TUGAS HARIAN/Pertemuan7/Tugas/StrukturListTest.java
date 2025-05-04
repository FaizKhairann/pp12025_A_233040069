package Pertemuan7.Tugas;

public class StrukturListTest {
  public static void main(String[] args) {
    StrukturList list = new StrukturList();

    list.addTail(5);
    list.addTail(4);
    list.addTail(6);
    list.displayElement();
    System.out.println(list.find(6)); // true

    StrukturList list2 = new StrukturList();

    list2.addTail(7);
    list2.addTail(6);
    list2.addTail(4);
    list2.addTail(3);
    list2.addTail(2);
    list2.displayElement();
    System.out.println("Jumlah elemen: " + list2.size());
  }
}
