package io.dtwo.api.signup.config;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import springfox.documentation.spring.web.plugins.Docket;

import static org.junit.jupiter.api.Assertions.assertNotNull;


//@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class SpringFoxConfigTest {

    @Spy
    SpringFoxConfig springFoxConfig;

    @Test
    public void api() {
        Docket response = springFoxConfig.api();
        assertNotNull(response);

    }
}
