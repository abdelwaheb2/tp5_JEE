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
  <div class="card-header text-center fw-bolder text-primary">
    Confirmation l'action 
  </div>
  <div class="card-body">
      
      <div class="form-group">
       <label class="control-label">ID :</label>
       <input type="text" name="id" class="form-control" readonly value="${examen.id }"/>
        </div>
        <div>
       <label class="control-label">Matiere :</label>
       <input type="text" name="matiere" class="form-control" readonly value="${examen.matiere }"/>
      </div>
      
      <div class="control-label">
       <label class="control-label">Etudient :</label>
       <input type="text" name="etudiant" class="form-control" readonly value="${examen.etudiant }"/>
      </div>
      <div class="control-label">
       <label class="control-label">Note :</label>
       <input type="text" name="note" class="form-control" readonly value="${examen.note }"/>
      </div>
      <div class="control-label">
       <label class="control-label">Coffetion :</label>
       <input type="text" name="coffetion" class="form-control" readonly value="${examen.coffetion }"/>
      </div>
      <div class="control-label">
       <label class="control-label">Dure :</label>
       <input type="text" name="dure" class="form-control" readonly value="${examen.dure }"/>
      </div>
       </div>
         
  </div>
</div>
</body>
</html>