package dio.my_web_api.controller;

import dio.my_web_api.model.Usuario;
import dio.my_web_api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Usa-se um controller específico para cada função
@RequestMapping("/users/") // Define que todos iniciam pelo caminho users, poderia remover dos gets
public class UsuarioController { // o controler é um prox, ele só da um direcionamento para a funcionalidade de verdade
    @Autowired
    private UsuarioRepository repository;

    @GetMapping() // Define uma uri para o método, um caminho específico
    // getMapping associa-se para funções ligadas ao http
    public List<Usuario> getUsers(){
        return repository.findAll();
    }

    @GetMapping("/{username}") //Especifica ainda mais o caminho, tendo que utilizar o dado salvo no repository
    public Usuario getOne(@PathVariable ("username") String username){
        return repository.findByUsername(username);
    }
    /* Uma IDE só realiza metodos get, deletes, post precisam de um client http*/
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        repository.deleteById(id);
    }

    @PostMapping()
    public void postUser(@RequestBody Usuario usuario){// Spring entende que deve pegar o Json e transformar de acordo com o contrato do codigo
        repository.save(usuario);
    }

    @PutMapping("/users")
    public void putUser(@RequestBody Usuario usuario){// Spring entende que deve pegar o Json e transformar de acordo com o contrato do codigo
        repository.save(usuario);
    }
}

//http://localhost:8080/swagger-ui/index.html# <- Url para chegar no swagger