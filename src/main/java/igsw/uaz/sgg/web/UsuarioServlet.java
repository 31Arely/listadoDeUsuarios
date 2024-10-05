/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package igsw.uaz.sgg.web;

import igsw.uaz.sgg.domain.Usuario;
import igsw.uaz.sgg.servicio.UsuarioService;
import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Arely
 */
@WebServlet("/usuarios")
public class UsuarioServlet extends HttpServlet {
    @Inject
    UsuarioService usuarioService;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        List<Usuario> usuarios = usuarioService.listarUsuarios();
        System.out.println("Usuarios"+usuarios);
        request.setAttribute("usuarios", usuarios);
        request.getRequestDispatcher("/listadoUsuarios.jsp").forward(request, response);
        
    }
}
