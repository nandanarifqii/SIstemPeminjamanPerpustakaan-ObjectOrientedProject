/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

import java.util.ArrayList;

/**
 *
 * @author doxa
 */
public class Peminjaman {

    private ArrayList<BukuDipinjam> bukuDipinjam = new ArrayList<>();

    public ArrayList<BukuDipinjam> getDaftarBukuDipinjam() {
        return bukuDipinjam;
    }

    public void setDaftarBukuDipinjam(ArrayList<BukuDipinjam> bukuDipinjam) {
        this.bukuDipinjam = bukuDipinjam;
    }
}
