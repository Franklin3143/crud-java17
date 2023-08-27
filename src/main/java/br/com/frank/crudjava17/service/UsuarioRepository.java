package br.com.frank.crudjava17.service;

import br.com.frank.crudjava17.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
