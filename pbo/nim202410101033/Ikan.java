//1. MEMBUAT CLASS IKAN
public class Ikan {

//2. MENENTUKAN TIPE DATA MASING-MASING ATRIBUT
  String nama, warna, habitat;
  
//3. MEMBUAT CONSTRUCTOR
  Ikan(String nama, String warna, String habitat) {

this.nama = nama;
this.warna = warna;
this.habitat = habitat;
}

//4. MEMBUAT METHOD
  void WahanaIkan(){
System.out.println("Nama ikan = " + nama + "warna = " + warna + "habitat = " + habitat)
  }
}
