<%-- 
    Document   : midUpdate
    Created on : Oct 5, 2016, 9:16:21 AM
    Author     : cyber23
--%>

<%@page import="model.CategoryPakaianModel"%>
<%@page import="java.util.List"%>
<%@page import="model.PakaianModel"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="post" class="form-horizontal" name="formSearch" action="PakaianControl" enctype="multipart/form-data">
            <fieldset>
                <div class="form-group">                    
                    <div class="col-lg-6">
                        <div class="input-group">
                            <input type="hidden" value="getData">
                            <input type="text" name="search" class="form-control " 
                                   placeholder="Cari berdasarkan kode barang atau nama barang"
                                   style="border-top-left-radius:50px;
                                   border-bottom-left-radius: 50px">


                            <button class="input-group-addon" style="border-top-right-radius:50px;
                                    border-bottom-right-radius: 50px">
                                <span class="glyphicon glyphicon-search input-group"><b>Search</b></span>
                            </button>
                        </div>
                    </div>
                </div>
            </fieldset>            
        </form>
        
        <div class="jumbotron" style="padding: 10px;">
            <form class="form-horizontal"  name="formUpdate" method="post" action="PakaianControl" enctype="multipart/form-data">
                <fieldset>
                    <legend><center>Update Data Pakaian</center></legend>
                    <div class="form-group">
                        <label class="col-lg-2 control-label"><div style="float:left">Kode Barang</div></label>
                        <div class="col-lg-2">
                            <input type="text" name="kdBrg" class="form-control"  maxlength="9" value="${oneData.kdBrg}" readonly="readonly"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-lg-2 control-label"><div style="float:left">Kategori</div></label>
                        <% 
                           PakaianModel pm = (PakaianModel) request.getAttribute("oneData");
                           List<CategoryPakaianModel> listC = (List<CategoryPakaianModel>) request.getAttribute("getKategori");
                           byte idKategori = (byte) pm.getIdKategori();
                           out.print(listC.get(1).getIdKategori());
                        %>
                        <div class="col-lg-2">
                            
                            <select name="kategori" class="form-control">
                                <% for (int i = 0; i < listC.size(); i++) {
                                        if (pm.getIdKategori() == listC.get(i).getIdKategori()) {
                                            %><option value="<%=listC.get(i).getIdKategori()%>" selected><%=listC.get(i).getNama() %></option><%
                                        } else {
                                            %><option value="<%=listC.get(i).getIdKategori()%>"><%=listC.get(i).getNama()%></option><%
                                        }
                                    }%>
                            </select>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-lg-2 control-label"><div style="float:left">Nama Barang</div></label>
                        <div class="col-lg-6">
                            <input type="text" name="nmBrg" class="form-control" value="${oneData.nmBrg}"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-lg-2 control-label"><div style="float:left">Stok</div></label>
                        <div class="col-lg-1">
                            <input type="text" name="stokSet" class="form-control" oninput="validAngka(this)" maxlength="1"/>
                        </div>
                        <div class="col-lg-2">
                            <select name="satuanStok" class="form-control">
                                <option value="kodi">Kodi</option>
                                <option value="Lusin">Lusin</option>
                            </select>
                        </div>
                        <div class="col-lg-1">
                            <input type="text" name="stokLbr" class="form-control" maxlength="2" oninput="validAngka(this)"/>
                        </div>
                        <label class="col-lg-2 control-label"><div style="float:left">LBR</div></label>
                    </div>

                    <div class="form-group">
                        <label class="col-lg-2 control-label"><div style="float:left">Price Modal</div></label>
                        <div class="col-lg-5">
                            <input type="text" name="priceModal" class="form-control"  oninput="validAngka(this)"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-lg-2 control-label"><div style="float:left">Warna</div></label>
                        <div class="col-lg-5">
                            <input type="text" name="warna" class="form-control"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-lg-2 control-label"><div style="float:left">Photo</div></label>
                        <div class="col-lg-2">
                            <img src="images/dd.jpg" name="imgPhoto"  width="100" height="100">
                        </div>
                        <div class="col-lg-6">
                            <input type="file" name="photo" />
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-lg-2 col-lg-offset-10">
                            <button class="btn btn-danger form-control">Simpan</button>
                        </div>
                    </div>
                </fieldset>
            </form>
        </div>
    </body>
</html>
