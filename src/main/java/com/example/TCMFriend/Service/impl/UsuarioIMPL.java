package com.example.TCMFriend.Service.impl;

import com.example.TCMFriend.Dto.LoginDTO;
import com.example.TCMFriend.Dto.UsuarioDTO;
import com.example.TCMFriend.Entity.Usuario;
import com.example.TCMFriend.Repo.UsuarioRepo;
import com.example.TCMFriend.Service.UsuarioService;
import com.example.TCMFriend.response.LoginResponse;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UsuarioIMPL implements UsuarioService {

    @Autowired
    private UsuarioRepo usuarioRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;
    
    @Override
	public List<Usuario> obtenerUsuario() {
		
		return usuarioRepo.findAll();
	}

    @Override
    public String addUsuario(UsuarioDTO usuarioDTO) {

        Usuario usuario = new Usuario(
                usuarioDTO.getUsuarioid(),
                usuarioDTO.getNombre(),
                usuarioDTO.getApellido(),
                usuarioDTO.getEmail(),
                this.passwordEncoder.encode(usuarioDTO.getPassword()),
                usuarioDTO.getCiclo(),
                usuarioDTO.getCarrera(),
                usuarioDTO.getDescripcion());

        usuarioRepo.save(usuario);
        return usuario.getNombre();
    }
    
    @Override
    public LoginResponse loginUsuario(LoginDTO loginDTO) {
    	//String msg = "";
        Usuario usuario1 = usuarioRepo.findByEmail(loginDTO.getEmail());
        if (usuario1 != null) {
            String password = loginDTO.getPassword();
            String encodedPassword = usuario1.getPassword();
            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
            if (isPwdRight) {
            	Optional<Usuario> usuario = usuarioRepo.findOneByEmailAndPassword(loginDTO.getEmail(), encodedPassword);
                if (usuario.isPresent()) {
                    return new LoginResponse("Login Success", true);
                } else {
                    return new LoginResponse("Login Failed", false);
                }
            } else {
 
                return new LoginResponse("password Not Match", false);
            }
        }else {
            return new LoginResponse("Email not exits", false);
        }
    }

	/**@Override
	public Usuario encontrarUsuario(int id) {
		return usuarioRepo.findById(id);
	}
*/
	@Override
	public String updateUsuario(String email, UsuarioDTO usuarioDTO) {
	    	Usuario username = usuarioRepo.findByEmail(email);
	    	//username.setEmail(usuarioDTO.getEmail());
	    	username.setNombre(usuarioDTO.getNombre());
	    	username.setApellido(usuarioDTO.getApellido());
	    	//username.setPassword(this.passwordEncoder.encode(usuarioDTO.getPassword()));
	    	username.setCiclo(usuarioDTO.getCiclo());
	    	username.setCarrera(usuarioDTO.getCarrera());
	    	username.setDescripcion(usuarioDTO.getDescripcion());
	    	
	    	usuarioRepo.save(username);
	    	return username.getNombre();
	}

	@Override
	public Usuario findUser(String email) {
		return usuarioRepo.findByEmail(email);
	}
}








