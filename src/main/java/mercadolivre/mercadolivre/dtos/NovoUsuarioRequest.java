package mercadolivre.mercadolivre.dtos;

import mercadolivre.mercadolivre.entities.Usuario;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class NovoUsuarioRequest {

    @NotBlank
    @Email
    @UniqueValue(entityClass = Usuario.class, fieldName = "email")
    private String email;

    @NotBlank @Length(min = 6)
    private String senha;

    public NovoUsuarioRequest(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public Usuario toModel() {
        return new Usuario(this.email, new RawPassword(this.senha));
    }
}
