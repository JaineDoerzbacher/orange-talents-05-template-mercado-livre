package mercadolivre.mercadolivre.controllers;

import mercadolivre.mercadolivre.entities.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.validation.Valid;


@Controller
public class UsuarioController {

    @PersistenceContext
    private EntityManager entityManager;

    @PostMapping("/api/usuarios")
    @Transactional
    public void register(@RequestBody @Valid NovoUsuarioRequest novoUsuarioRequest) {
        Usuario novoUsuario = novoUsuarioRequest.toModel();
        entityManager.persist(novoUsuario);
    }
}
