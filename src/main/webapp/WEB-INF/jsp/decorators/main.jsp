<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>   
<%@ page contentType="text/html" pageEncoding="UTF-8"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html>
  <head>
    <title><decorator:title default="Taxação"/></title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/stylesheets/application.css"/>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/stylesheets/bootstrap-celulean.min.css"/>
    <decorator:head/>
  </head>
  <body>
  	<script type="text/javascript" src="${pageContext.request.contextPath}/javascripts/jquery-1.8.2.js"></script>    
    <script type="text/javascript" src="${pageContext.request.contextPath}/javascripts/bootstrap.js"></script> 
    <script type="text/javascript" src="${pageContext.request.contextPath}/javascripts/jquery.maskedinput-1.3.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/javascripts/jquery.maskMoney.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/javascripts/pagina.js"></script>    
    
    <div class="navbar">
  <div class="navbar-inner">
    <a class="brand" href="#">Taxação</a>
    <ul class="nav">
      <li class="active"><a href="#">Home</a></li>
      <li><a href="#">Link</a></li>
      <li><a href="#">Link</a></li>      
      
    </ul>
  </div>
</div>
    <decorator:body/>
  </body>
</html>
