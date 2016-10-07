/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author cyber23
 */
public class CategoryPakaianModel {
    private byte idKategori;
    private String nama,deskripsi;
    
    public CategoryPakaianModel(byte idKategori,String nama,String deskripsi){
        this.idKategori = idKategori;
        this.nama = nama;
        this.deskripsi = deskripsi;
    }

    public byte getIdKategori() {
        return idKategori;
    }

    public void setIdKategori(byte idKategori) {
        this.idKategori = idKategori;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
    
    
    
}
