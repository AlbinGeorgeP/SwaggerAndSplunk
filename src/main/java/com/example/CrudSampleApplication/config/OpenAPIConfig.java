package com.example.CrudSampleApplication.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;


@OpenAPIDefinition(
        info = @Info(
                contact = @Contact(
                        name="API Support",
                        email = "support@example.com",
                        url = "https://www.example.com/support"
                ),
                description = "OpenApi Doc for Spring Boot",
                title = "OpenApi Spec - Albin",
                version = "1.0",
                license = @License(
                        name = "Apache 2.0",
                        url = "https://www.apache.org/licenses/LICENSE-2.0.html"
                ),
                termsOfService = "https://example.com/terms/"
        ),
        servers ={
                @Server(
                        description = "Dev",
                        url = "http://localhost:9000"
                ),@Server(
                description = "Prod",
                url = "http://localhostProd:9010"
        )
        }
)
public class OpenAPIConfig {
}
