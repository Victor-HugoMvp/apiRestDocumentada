package dio.my_web_api.repository;

import dio.my_web_api.handler.BussinesException;
import dio.my_web_api.handler.CampoObrigatorioException;
import dio.my_web_api.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {
    public void save(Usuario usuario){ // algoritmo padrão de save de usuário
        if(usuario.getLogin() == null)
        {
        throw new CampoObrigatorioException("login");
        }

        if(usuario.getPassword() == null)
        {
            throw new CampoObrigatorioException("senha");
        }

        if(usuario.getId()==null)
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        else
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");

        System.out.println(usuario);
    }

    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id %d para excluir um usuário"));
        // .format serve para formatar uma string inserindo valores em posições específicas, no caso %d4
        System.out.println(id);
    }

    public List<Usuario> findAll(){
        System.out.println("LIST - Listando os usuários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("123", "Victor Hugo"));
        usuarios.add(new Usuario("143", "Sthefany"));
        return usuarios;
    }

    public Usuario findById(Integer id){
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuário",id));
        return new Usuario("123", "Victor Hugo");
    }

    public Usuario findByUsername(String username){
        System.out.println(String.format("FIND/username - Recebendo o username: %s para localizar um usuário", username));
        return new Usuario("123", "Victor Hugo");
    }

}
