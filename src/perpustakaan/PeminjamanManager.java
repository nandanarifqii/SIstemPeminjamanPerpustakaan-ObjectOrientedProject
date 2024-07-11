/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

import java.util.ArrayList;

/**
 *
 * @author aryaj
 */
public class PeminjamanManager {

    public boolean save(ArrayList<BukuDipinjam> bukuDipinjam) {
        int bukuLength = bukuDipinjam.size();
        if (bukuLength >= 1 && bukuLength <= 10) {

            Perpustakaan.peminjaman.setDaftarBukuDipinjam(bukuDipinjam);
            return true;

        }
        return false;
    }
}
