package id.sch.smktelkom_mlg.learn.recyclerview1.model;

/**
 * Created by yanda on 05/11/2016.
 */

import android.graphics.drawable.Drawable;

public class Hotel {
    public String judul;
    public String deskripsi;
    public Drawable foto;

    public Hotel(String judul, String deskripsi, Drawable foto) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.foto = foto;
    }
}
