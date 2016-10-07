/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import database.DatabaseMysql;
import interfaces.PakaianInterface;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;
import model.PakaianModel;

/**
 *
 * @author cyber23
 */
public class PakaianDao implements PakaianInterface{
    
    @Override
public void insert(PakaianModel p){
        try{
//            new PakaianModel(date, kdBrg, 0, nmBrg, 0, 0, 0, warna, photo, 0) cari cara date
            PreparedStatement ps = DatabaseMysql.getPreparedStatement("insert into pakaian "
                    + "(tglMasuk,kdBrg,idKategori,nmBrg,stok,priceModal,pricePersen,warna,photo,terjual) "
                    
                    + "values (?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, p.getDate());
//kode barang harus 9 karakter
            ps.setString(2, p.getKdBrg());
            ps.setByte(3, p.getIdKategori());
            ps.setString(4,p.getNmBrg());
            ps.setByte(5, p.getStok());
            ps.setLong(6,p.getPriceModal());
            ps.setLong(7, p.getPricePersen());
            ps.setString(8, p.getWarna());
            ps.setString(9, p.getPhoto());
            ps.setInt(10, p.getJual());
            ps.executeUpdate();
              
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public PakaianModel getByIdOrNama(String kdBrg, String nmBrg) {
        PakaianModel pm = new PakaianModel();
        try {
            PreparedStatement ps = DatabaseMysql.getPreparedStatement("select * from pakaian where kdBrg=? or nmBrg=?");
            ps.setString(1,kdBrg);
            ps.setString(2, nmBrg);
            ResultSet rs = ps.executeQuery();
            rs.next();
            pm.setKdBrg(rs.getString("kdBrg"));
            pm.setIdKategori(rs.getByte("idKategori"));
            pm.setNmBrg(rs.getString("nmBrg"));
            pm.setStok(rs.getByte("stok"));
            pm.setPriceModal(rs.getLong("priceModal"));
            pm.setWarna(rs.getString("warna"));
            pm.setPhoto(rs.getString("photo"));
        } catch(Exception ex){
            ex.printStackTrace();
            return null;
        }        
        return pm;
    }

    @Override
    public List<PakaianModel> getAll() {
        List<PakaianModel> data = new LinkedList<>();
        try {
            ResultSet rs = DatabaseMysql.getPreparedStatement("select * from pakaian").executeQuery();
            while(rs.next()){
                PakaianModel pm = new PakaianModel(rs.getString(1), rs.getString(2), rs.getByte(3), rs.getString(4), rs.getByte(5),rs.getLong(6)
                        , rs.getLong(7), rs.getString(8),rs.getString(9) , rs.getInt(10));
                data.add(pm);
            }
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
        return data;
    }
}
