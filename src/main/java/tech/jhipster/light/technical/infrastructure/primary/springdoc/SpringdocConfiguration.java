package tech.jhipster.light.technical.infrastructure.primary.springdoc;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringdocConfiguration {

  @Bean
  public OpenAPI jhLightOpenAPI() {
    return new OpenAPI()
      .info(
        new Info()
          .title("JHipster Light API")
          .description("JHipster Light API")
          .version("v0.0.1")
          .license(new License().name("Apache 2.0").url("https://jhipster.tech"))
      )
      .externalDocs(new ExternalDocumentation().description("JHipster Light Documentation").url("https://jhipster.tech/light"));
  }

  @Bean
  public GroupedOpenApi jhLightAllOpenAPI() {
    // prettier-ignore
    return GroupedOpenApi.builder()
      .group("all")
      .pathsToMatch("/api/**")
      .build();
  }
}
