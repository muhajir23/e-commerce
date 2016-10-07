<%-- 
    Document   : midMain
    Created on : Oct 6, 2016, 5:41:13 PM
    Author     : cyber23
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="padding-left: 30px;padding-right: 30px;" >
        <form class="form-horizontal">
            
            <div class="col-lg-8" style="float: right">
                <div class="input-group">
                    <input type="text" name="search" class="form-control"
                           style="border-top-left-radius: 50px;
                           border-bottom-left-radius: 50px;"
                           placeholder="Cari Berdasarkan Nama atau Kode Barang">
                    <button class="btn btn-danger input-group-addon"
                            style="border-top-right-radius: 50px;
                           border-bottom-right-radius: 50px;">
                        <span class="glyphicon glyphicon-search"> Search</span>
                    </span>
                </div>
            </div>
        </form><br><br><br>
        <table class="table table-striped table-hover" style="border-style: double;" >
            <thead style="border-style: double;">
                <tr>
                    <th style="width: 120px;">Tanggal Masuk</th>
                    <th style="width: 105px;">Kode Barang</th>
                    <th style="width: 15px;">Kategori</th>
                    <th>Nama Barang</th>
                    <th style="width: 15px ">Stok</th>
                    <th>Price Modal</th>
                    <th>Price Persen</th>
                    <th>Photo</th>
                    <th></th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                
                <c:forEach items="${getAllPakaian}" var="p">
                    <tr class="info">
                        <td style="padding-top: 20px">${p.date}</td>
                        <td style="padding-top: 20px">${p.kdBrg}</td>
                        <td style="padding-top: 20px"><center>${p.idKategori}</center></td>
                        <td style="padding-top: 20px">${p.nmBrg}</td>
                        <td style="padding-top: 20px"><center>${p.stok}</center></td>
                        <td style="padding-top: 20px">${p.priceModal}</td>
                        <td style="padding-top: 20px">${p.pricePersen}</td>
                        <td><img src="images/${p.photo}" width="50" height="50"
                                 style="border-radius: 8px;"></td>
                        <td style="padding-top: 20px">
                            <a href="PakaianControl?crud=update&kode=${p.kdBrg}" title="UPDATE">
                                <span class="glyphicon glyphicon-edit"></span>
                            </a>
                        </td>
                        <td style="padding-top: 20px">
                            <a href="PakaianControl?status=update" title="DELETE" >
                                <span class="glyphicon glyphicon-remove"></span>
                            </a>
                        </td>
                    </tr>
                </c:forEach>


            </tbody>
        </table>
    </body>
</html>
