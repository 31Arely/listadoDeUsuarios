/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package igsw.uaz.sgg.servicio;

import igsw.uaz.sgg.domain.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author Arely
 */
@Stateless
public class UsuarioServiceImp implements UsuarioService {
    
    @Override
    public List<Usuario> listarUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario(1, "Luis","Sandoval","25","mensual"));
        usuarios.add(new Usuario(2, "Cristal","Lopez","23","semanal"));
        usuarios.add(new Usuario(3, "Arely","Sanchez","27","quincenal"));
        return usuarios;
    }
    
    @Override
    public Usuario encontrarUsuarioPorId(Usuario usuario) {
        return null;
    }
    
    @Override
    public void registrarUsuario(Usuario usuario) {
    }
    
    @Override
    public void modificarUsuario(Usuario usuario) {
    }
    
    @Override
    public void eliminarUsuario(Usuario usuario) {
    }
}
