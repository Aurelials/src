//1. MEMBUAT CLASS PION CATUR
public class PionCatur{

//2. MENENTUKAN TIPE DATA MASING-MASING ATRIBUT
  String nama, warna;
  int jumlah;
  
//3. MEMBUAT CONSTRUCTOR
  Mobilsedan(String nama, String warna, int jumlah) {

this.nama = nama;
this.warna = warna;
this.jumlah = jumlah;
}

//4. MEMBUAT METHOD
  void Catur(){
System.out.println("Nama = " + nama + "warna = " + warna + "Jumlah pion Catur = " + jumlah)
  }
}
