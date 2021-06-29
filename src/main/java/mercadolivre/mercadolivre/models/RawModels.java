package mercadolivre.mercadolivre.models;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class RawPassword {


    private String senha;

    public RawPassword(String password) {
        this.senha = password;
    }

    public String getSenha() {
        return senha;
    }

}
