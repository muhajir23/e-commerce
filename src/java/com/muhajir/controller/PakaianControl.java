/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.muhajir.controller;

import com.oreilly.servlet.MultipartRequest;
import dao.CategoryPakaianDao;
import dao.PakaianDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Enumeration;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.PakaianModel;

/**
 *
 * @author cyber23
 */
public class PakaianControl extends HttpServlet {

    String kdBrg,nmBrg,stokSet,satuanStok,stokLbr;
    byte kategori,sumStok = 0;
    long priceModal = 0,pricePersen = 0;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String menu = request.getParameter("menu");
        String crud = request.getParameter("crud");
        if (menu == null){
          out.print("gagal");  
         
        } else 
        
        if (menu.equalsIgnoreCase("pakaian")){
            PakaianDao dao = new PakaianDao();
            request.setAttribute("getAllPakaian", dao.getAll());
            RequestDispatcher rd = request.getRequestDispatcher("/layout/tekstil/tekstil.jsp");
            rd.forward(request, response);
        } 
        
        
        if (crud.equalsIgnoreCase("update")){
            String kdBrg = request.getParameter("kode");
            PakaianDao pDao = new PakaianDao();
            CategoryPakaianDao cDao = new CategoryPakaianDao();
            request.setAttribute("oneData",pDao.getByIdOrNama(kdBrg, null));
            request.setAttribute("getKategori", cDao.getAll());
            RequestDispatcher rd = request.getRequestDispatcher("/layout/tekstil/tekstil.jsp");
            rd.forward(request, response);
            
        }
        
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        MultipartRequest mr = new MultipartRequest(request, getServletContext().getRealPath("/")+"images/",100000000);
        String crud = mr.getParameter("crud");
        out.print(crud);
        insert(mr, out, request, response);
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    
    
    public void insert(MultipartRequest mr,PrintWriter out,HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{        
        kdBrg = mr.getParameter("kdBrg");
        kategori = Byte.valueOf(mr.getParameter("kategori"));
        nmBrg = mr.getParameter("nmBrg");
        stokSet = mr.getParameter("stokSet");
        satuanStok = mr.getParameter("satuanStok");
        stokLbr = mr.getParameter("stokLbr");
        String priceModalReq = mr.getParameter("priceModal");
        
        sumStok = 0;
        if (!stokSet.equalsIgnoreCase("") && !stokLbr.equalsIgnoreCase("") && !priceModalReq.equalsIgnoreCase("")
              && kdBrg.length() == 9 && !nmBrg.equalsIgnoreCase("")) {
            priceModal = Long.valueOf(priceModalReq);
            pricePersen = (long) (priceModal * 0.5) + priceModal;
            if (satuanStok.equalsIgnoreCase("kodi")) {                
                sumStok = (byte) ((Byte.valueOf(stokSet) * 20) + Byte.valueOf(stokLbr));                

            } else if (satuanStok.equalsIgnoreCase("lusin")) {
                sumStok = (byte) ((Byte.valueOf(stokSet) * 12) + Byte.valueOf(stokLbr));
            }
        } else {
            
            request.setAttribute("status", "error");
            RequestDispatcher rd = request.getRequestDispatcher("layout/tekstil/tekstil.jsp");
            rd.forward(request, response);
        }

// cari harga persen
        

        String warna = mr.getParameter("warna");

//upload photo dan getName        
        Enumeration en = mr.getFileNames();
        String kd = (String) en.nextElement();
        String nmFile = mr.getFilesystemName(kd);
        
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;
        int day = c.get(Calendar.DATE);
        String tgl = year+"-"+month+"-"+day;


// new PakaianModel(date, kdBrg, 0, nmBrg, 0, 0, 0, warna, photo, 0) cari cara date
// upload
        PakaianModel pm = new PakaianModel(tgl,kdBrg,kategori , nmBrg,sumStok,priceModal ,pricePersen,warna,nmFile,0);
        PakaianDao dao  = new PakaianDao();
        dao.insert(pm);
    }
}
