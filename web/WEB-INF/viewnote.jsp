<%-- 
    Document   : viewnote
    Created on : Sep 25, 2018, 11:08:04 AM
    Author     : 731866
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <form method="post"> 
        <h1>Simple Note Keeper</h1>
        <h2>Edit Note</h2>
        Title:<input type="text" name="textarea" value="${newpost}">
        ${title}
        <br><br>
        <textarea rows="4" name="box" cols="50" value="${box1}">
        </textarea>
        <br>
         <input type="submit" value="Submit">
        Contents:${contents}
        
        
       
          </form>
    </body>
</html>
