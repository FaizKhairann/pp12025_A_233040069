package pertemuan3;

public class ListmainH {
  public static void main(String[] args) {
    StrukturList list = new StrukturList();
    list.addHead(1);
    list.addHead(4);
    list.addHead(5);
    list.addHead(7);

    System.out.println("Elemen: ");
    list.displayElement();
  }
}
