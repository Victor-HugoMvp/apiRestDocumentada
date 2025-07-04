package dio.my_web_api.doc;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI myOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Title - Rest API")
                        .description("Descrição da API com Spring Boot")
                        .version("1.0")
                        .contact(new Contact()
                                .name("Seu Nome")
                                .url("https://www.seusite.com.br")
                                .email("voce@seusite.com.br"))
                        .license(new License()
                                .name("Licença da API")
                                .url("https://www.seusite.com.br/licenca")))
                .externalDocs(new ExternalDocumentation()
                        .description("Documentação externa")
                        .url("https://www.seusite.com.br/docs"));
    }
}