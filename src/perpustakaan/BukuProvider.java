/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

import java.util.ArrayList;

public class BukuProvider {

    private ArrayList<Buku> bukuCollection;

    public BukuProvider() {
        bukuCollection = new ArrayList<>();
//        bukuCollection.add(new Buku("Sherlock Holmes"));
//        bukuCollection.add(new Buku("Topeng Kaca"));
//        bukuCollection.add(new Buku("Doraemon"));
//        bukuCollection.add(new Buku("Petualangan Doraemon"));
//        bukuCollection.add(new Buku("Thomas and Friends"));
//        bukuCollection.add(new Buku("The Return of Sherlock Holmes"));
//        bukuCollection.add(new Buku("The Adventure of Sherlock Holmes"));

//       Data set cek kondisi peminjaman buku lebih dari 10
        bukuCollection.add(new Buku("Sherlock Holmes"));
        bukuCollection.add(new Buku("Topeng Kaca"));
        bukuCollection.add(new Buku("Doraemon"));
        bukuCollection.add(new Buku("Petualangan Doraemon"));
        bukuCollection.add(new Buku("Doraemon Di Pulau Hantu"));
        bukuCollection.add(new Buku("Petualangan Doraemon di Negeri Awan"));
        bukuCollection.add(new Buku("Doraemon the Series"));
        bukuCollection.add(new Buku("Doraemon Azab Kubur"));
        bukuCollection.add(new Buku("Thomas and Friends"));
        bukuCollection.add(new Buku("The Return of Sherlock Holmes"));
        bukuCollection.add(new Buku("The Adventure of Sherlock Holmes"));

    }

    public ArrayList<Buku> selectBuku(String judul) {

        ArrayList<Buku> foundBuku = new ArrayList<>();

        for (Buku buku : this.bukuCollection) {
            if (buku.judul.contains(judul)) {
                foundBuku.add(buku);
            }
        }

        return foundBuku;
    }

}
