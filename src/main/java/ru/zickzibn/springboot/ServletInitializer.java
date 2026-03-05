package ru.zickzibn.springboot;

import org.jetbrains.annotations.NotNull;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected @NotNull SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBoot311Application.class);
    }

}
