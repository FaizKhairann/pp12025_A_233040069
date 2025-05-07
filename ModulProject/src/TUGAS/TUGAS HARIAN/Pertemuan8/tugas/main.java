package Pertemuan8.tugas;

import Pertemuan8.latihan.*;;

public class main {
  public static void main(String[] args) {
    StrukturList list = new StrukturList();
    // latihan 4
    // list.addHead(new Matakuliah("IF1001", "Dasar Pemrograman", 4));
    // list.addHead(new Matakuliah("IF1001", "Pemrograman Web", 3));

    // // tes 1
    // list.addHead(new Matakuliah("IF001", "Dasar Pemrograman", 4));
    // list.addHead(new Matakuliah("IF002", "Pemrograman Web", 3));
    // list.addHead(new Matakuliah("IF003", "Struktur Diskrit", 3));
    // list.addHead(new Matakuliah("IF004", "konstruksi PL Berorientasi Objek", 3));

    // tes 4
    list.addTail(new Matakuliah("IF004", "Konstruksi PL Berorientasi Objek", 3));
    list.addTail(new Matakuliah("IF004", "Struktur Diskrit", 3));
    list.addTail(new Matakuliah("IF004", "Pemrograman Web", 3));
    list.addMid(new Matakuliah("IF001", "Dasar Pemrogrman", 4), 4);

    list.displayElement();
  }

}
