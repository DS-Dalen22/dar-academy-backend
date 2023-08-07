package post.coreapi2;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityScheme;

@OpenAPIDefinition(
        info = @Info(
                title = "Parcel handling system Api",
                description = "Parcel System", version = "1.0.0",
                contact = @Contact(
                        name = "Dalenzhan",
                        email = "dalen@san.dev",
                        url = "https://dalen.san.dev"
        )
        )
)
@SecurityScheme(
        name = "JWT",
        type = SecuritySchemeType.HTTP,
        bearerFormat = "JWT",
        scheme = "bearer"
)


public class OpenApiConfig {
}
