//1. MEMBUAT CLASS REKENING BANK
public class RekeningBank {

//2. MENENTUKAN TIPE DATA MASING-MASING ATRIBUT
  String NamaPemilik, Password, JenisBank;
  int noRekening;
  
//3. MEMBUAT CONSTRUCTOR
  Mobilsedan(String NamaPemilik, String JenisBank, 
String Password, int noRekening) {

this.nama = NamaPemilik;
this.Jenisbank = JenisBank;
this.Password = Password;
this.noRek = noRekening;
}

//4. MEMBUAT METHOD
  void Rekening(){
System.out.println("Nama Pemilik = " + NamaPemilik + 
"Nama Bank = " + JenisBank + "Password = " + Password +
 "No. Rekening = " + noRekening)
  }
}
