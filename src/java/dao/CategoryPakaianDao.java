/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import database.DatabaseMysql;
import interfaces.CategoryPakaianInterface;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;
import model.CategoryPakaianModel;

/**
 *
 * @author cyber23
 */
public class CategoryPakaianDao implements CategoryPakaianInterface{

    @Override
    public List<CategoryPakaianModel> getAll() {
        List<CategoryPakaianModel> data = new LinkedList<>();
        try {
            ResultSet rs = DatabaseMysql.getPreparedStatement("select * from kategori").executeQuery();
            while (rs.next()){
                CategoryPakaianModel subData = new CategoryPakaianModel(rs.getByte(1), rs.getString(2), rs.getString(3));
                data.add(subData);
            }
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
        return data;
    }
    
}
