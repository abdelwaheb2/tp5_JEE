<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Insert title here</title>
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />
</head>
<body>
<%@include file="header.jsp" %>
<p></p>
<div class="container">
<div class="card">
  <div class="card-header">
    Recherche des Eaxamen
  </div>
  <div class="card-body">
  <div  class="w-50 mx-auto my-2">
	  <form class="row" action="chercher.do" method="get">
	        <input type="text" placeholder="Mot clee" class="form-control col-8" name="motCle" value="${model.motCle}"/>
        	<button type="submit" class="btn btn-primary col-3">Chercher</button>
      </form> 
  </div>    
      <table class="table table-striped">
        <tr >
          <th>ID</th>
          <th>Matiere</th>
          <th>Etudient</th>
          <th>Note</th>
          <th>Coffetion</th>
          <th>Dure</th>
          <th>Suppression</th>
          <th>Edition</th>
         </tr>
         <c:forEach items="${model.getExamens()}" var="p">
           <tr>
              <td>${p.id }</td>
              <td>${p.matiere }</td>
              <td>${p.etudiant }</td>
              <td>${p.note }</td>
              <td>${p.coffetion }</td>
              <td>${p.dure }</td>
              <td><a onclick="return confirm('Etes-vous sure ?')" href="supprimer.do?id=${p.id }">Supprimer</a></td>
               <td><a href="editer.do?id=${p.id }">Edit</a></td>
           </tr>
         </c:forEach>        
      </table>
  </div>
</div>
</div>
</body>
</html>