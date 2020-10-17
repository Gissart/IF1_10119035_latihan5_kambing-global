//latihan 5 PBO
// Nama       : Argya Aulia Fauzandika
// NIM        : 10119035
// Kelas      : IF-1
// Deskripsi  : mengakses dan mengubah variabel instance melalui method
package com.tugasPBO;

public class latihan5PBO {
    int jumlahkambing = 88;
    public void getjumlahkambing(){
        System.out.println("Jumlah kambing "+ jumlahkambing);
    }
    public void tambahkambing(){
        jumlahkambing += 5;
        System.out.println("Jumlah kambing setelah ditambah : "+ jumlahkambing);
    }
    public static void main(String[] args){
        latihan5PBO kambingsusu = new latihan5PBO();
        kambingsusu.getjumlahkambing();
        kambingsusu.tambahkambing();
        kambingsusu.getjumlahkambing();

    }
}
