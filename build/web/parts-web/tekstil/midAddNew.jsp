<%-- 
    Document   : mid
    Created on : Oct 4, 2016, 2:01:32 AM
    Author     : cyber23
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <div class="jumbotron" style="padding: 10px;">
             <form class="form-horizontal" enctype="multipart/form-data" method="post" action="PakaianControl">
                <fieldset>
                    <legend><center>Entry</center></legend>
                    <div class="form-group">
                        <input type="hidden" value="insert" name="crud"/>
                        <label class="col-lg-2 control-label"><div style="float:left">Kode Barang</div></label>
                        <div class="col-lg-2">
                            <input type="text" name="kdBrg" class="form-control"  maxlength="9"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-lg-2 control-label"><div style="float:left">Kategori</div></label>
                    
                        <div class="col-lg-2">
                            <select name="kategori" class="form-control">
                                <c:forEach items="${getKategori}" var="p">
                                    <option value="${p.idKategori}">${p.nama}</option>
                                </c:forEach>
                                
                            </select>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-lg-2 control-label"><div style="float:left">Nama Barang</div></label>
                        <div class="col-lg-6">
                            <input type="text" name="nmBrg" class="form-control"/>
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
                            <img src="../../images/dd.jpg" name="imgPhoto"  width="100" height="100">
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
