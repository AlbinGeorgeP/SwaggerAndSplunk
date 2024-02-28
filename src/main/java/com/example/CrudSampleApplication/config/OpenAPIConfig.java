package com.example.CrudSampleApplication.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                contact = @Contact(
                        name="Albin",
                        email = "albin@gmail.com",
                        url = "https://www.youtube.com/watch?v=2o_3hjUPAfQ"
                ),
                description = "OpenApi Doc for Spring Boot",
                title = "OpenApi Spec - Albin",
                version = "1.0",
                license = @License(
                    name = "License Name",
                    url = "https://www.youtube.com/watch?v=2o_3hjUPAfQ"
                ),
                termsOfService = "Terms of Service"
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
