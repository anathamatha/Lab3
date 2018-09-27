/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;
import domain.note;
import java.io.*;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 731866
 */
public class NoteServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
          if( request.getParameter("edit") != null)
        {
            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        }
        

         String titles ;
        String contents;
 String path = getServletContext().getRealPath("/WEB-INF/note.txt");
// to read files
BufferedReader br = new BufferedReader(new FileReader(new File(path)));
titles = br.readLine();
contents = br.readLine();
note n = new note(titles,contents);
request.setAttribute("note", n);

 getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
    }
    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        String firstbox = request.getParameter("textarea");
        String secondbox = request.getParameter("box");
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));
        pw.println(firstbox);
        pw.println(secondbox);
        
        
        
        pw.close();
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
        String box1 = br.readLine();
        String box2 = br.readLine();
        note n = new note(box1,box2);
        request.setAttribute("note", n);
        
        
        getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
