<%-- 
    Document   : editnote
    Created on : Sep 25, 2018, 11:08:22 AM
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
          <form method="get"> 
        <h1>Simple Note Keeper</h1>
        <h2>Edit Note</h2>
        Title: ${note.noteT}
        <br>
        Contents: ${note.noteC}
        <br>
        
        <a href="Note?edit">edit </a>
          </form>
    </body>
</html>
