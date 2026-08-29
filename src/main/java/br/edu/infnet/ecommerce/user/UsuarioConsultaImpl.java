package br.edu.infnet.ecommerce.user;

import br.edu.infnet.ecommerce.user.repository.UsuarioRepository;
import org.springframework.stereotype.Component;

@Component
public class UsuarioConsultaImpl implements UsuarioConsulta {

    private final UsuarioRepository usuarioRepository;

    public UsuarioConsultaImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public boolean existeUsuario(Long usuarioId) {
        return usuarioRepository.existsById(usuarioId);
    }
}
