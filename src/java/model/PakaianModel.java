/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;


/**
 *
 * @author cyber23
 */
public class PakaianModel {
    private byte idKategori,stok;
    private int jual;
    private String kdBrg,nmBrg,warna,photo,date;
    private long priceModal,pricePersen;
    
    public PakaianModel(){};
    
    public PakaianModel(String date,String kdBrg,byte idKategori,String nmBrg,byte stok,long priceModal,long pricePersen,String warna,
            String photo,int jual){
        this.date = date;
        this.kdBrg = kdBrg;
        this.idKategori = idKategori;
        this.nmBrg = nmBrg;
        this.stok = stok;
        this.priceModal = priceModal;
        this.pricePersen = pricePersen;
        this.warna = warna;
        this.photo = photo;
        this.jual = jual;
    }

    public byte getIdKategori() {
        return idKategori;
    }

    public void setIdKategori(byte idKategori) {
        this.idKategori = idKategori;
    }

    public byte getStok() {
        return stok;
    }

    public void setStok(byte stok) {
        this.stok = stok;
    }

    public int getJual() {
        return jual;
    }

    public void setJual(int jual) {
        this.jual = jual;
    }

    public String getKdBrg() {
        return kdBrg;
    }

    public void setKdBrg(String kdBrg) {
        this.kdBrg = kdBrg;
    }

    public String getNmBrg() {
        return nmBrg;
    }

    public void setNmBrg(String nmBrg) {
        this.nmBrg = nmBrg;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public long getPriceModal() {
        return priceModal;
    }

    public void setPriceModal(long priceModal) {
        this.priceModal = priceModal;
    }

    public long getPricePersen() {
        return pricePersen;
    }

    public void setPricePersen(long pricePersen) {
        this.pricePersen = pricePersen;
    }
    
}